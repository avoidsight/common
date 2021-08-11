package com.scg.scaffold.service.impl;

import com.scg.scaffold.common.security.AdminUserDetails;
import com.scg.scaffold.dao.UmsAdminDao;
import com.scg.scaffold.dao.UmsAdminLoginLogDao;
import com.scg.scaffold.dto.UmsAdminParam;
import com.scg.scaffold.entity.UmsAdmin;
import com.scg.scaffold.entity.UmsAdminLoginLog;
import com.scg.scaffold.entity.UmsResource;
import com.scg.scaffold.entity.UmsRole;
import com.scg.scaffold.exception.Asserts;
import com.scg.scaffold.service.UmsAdminService;
import com.scg.scaffold.utils.JwtTokenUtil;
import com.scg.scaffold.utils.RequestUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author menmenz
 * @version 1.0
 * @date 7/29/21 2:03 PM
 */
@Service
public class UmsAdminServiceImpl implements UmsAdminService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UmsAdminServiceImpl.class);
    @Resource
    private JwtTokenUtil jwtTokenUtil;

    @Resource
    private PasswordEncoder passwordEncoder;

    @Resource
    private UmsAdminDao umsAdminDao;

    @Resource
    private UmsAdminLoginLogDao loginLogDao;


    @Override
    public UmsAdmin register(UmsAdminParam umsAdminParam) {
        UmsAdmin umsAdmin = new UmsAdmin();
        BeanUtils.copyProperties(umsAdminParam, umsAdmin);
        umsAdmin.setCreateTime(new Date());
        umsAdmin.setStatus(1);
        //查询是否有相同用户名的用户
        List<UmsAdmin> umsAdminList = umsAdminDao.findByUsername(umsAdmin.getUsername());
        if (umsAdminList.size() > 0) {
            Asserts.fail("用户名已存在!");
        }
        //将密码进行加密操作
        String encodePassword = passwordEncoder.encode(umsAdmin.getPassword());
        umsAdmin.setPassword(encodePassword);
        return umsAdminDao.save(umsAdmin);
    }

    @Override
    public String login(String username, String password) {
        String token = null;
        //密码需要客户端加密后传递
        try {
            UserDetails userDetails = loadUserByUsername(username);
            if(!passwordEncoder.matches(password,userDetails.getPassword())){
                Asserts.fail("密码不正确");
            }
            if(!userDetails.isEnabled()){
                Asserts.fail("帐号已被禁用");
            }
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtTokenUtil.generateToken(userDetails);
            insertLoginLog(username);
        } catch (AuthenticationException e) {
            LOGGER.warn("登录异常:{}", e.getMessage());
        }
        return token;
    }

    private void insertLoginLog(String username) {
        UmsAdmin admin = getAdminByUsername(username);
        if(admin==null) {
            return;
        }
        UmsAdminLoginLog loginLog = new UmsAdminLoginLog();
        loginLog.setAdminId(admin.getId());
        loginLog.setCreateTime(new Date());
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        loginLog.setIp(RequestUtil.getRequestIp(request));
        loginLogDao.save(loginLog);
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        //获取用户信息
        UmsAdmin admin = getAdminByUsername(username);
        if (admin != null) {
            List<UmsResource> resourceList = getResourceList(admin.getId());
            return new AdminUserDetails(admin,resourceList);
        }
        throw new UsernameNotFoundException("用户名或密码错误");
    }

    @Override
    public String refreshToken(String oldToken) {
        return jwtTokenUtil.refreshHeadToken(oldToken);
    }

    @Override
    public UmsAdmin getAdminByUsername(String username) {
        UmsAdmin admin ;
        List<UmsAdmin> adminList = umsAdminDao.findByUsername(username);
        if (adminList != null && adminList.size() > 0) {
            admin = adminList.get(0);
            return admin;
        }
        return null;
    }

    @Override
    public List<UmsRole> getRoleList(String adminId) {
        return null;
    }

    @Override
    public List<UmsResource> getResourceList(String adminId) {
        List<UmsResource> resourceList ;
//        resourceList = adminRoleRelationDao.getResourceList(adminId);
        resourceList = new ArrayList<>();
        return resourceList;
    }
}
