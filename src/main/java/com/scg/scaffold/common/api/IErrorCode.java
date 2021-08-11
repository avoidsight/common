package com.scg.scaffold.common.api;

/**
 * @author menmenz
 * @version 1.0
 * @date 7/27/21 8:43 PM
 */
public interface IErrorCode {
    /**
     * 返回码
     */
    long getCode();

    /**
     * 返回信息
     */
    String getMessage();
}
