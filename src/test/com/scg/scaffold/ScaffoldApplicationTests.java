package com.scg.scaffold;

import com.scg.scaffold.log.WebLog;
import com.scg.scaffold.mapper.WebLogMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ScaffoldApplicationTests {

    @Autowired
    WebLogMapper webLogMapper;


    @Test
    void contextLoads() {
        List<WebLog> webLogs = webLogMapper.findAll();
        System.out.println(webLogs.toString());

    }

}
