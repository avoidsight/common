package com.scg.scaffold.exception;

import com.scg.scaffold.common.api.IErrorCode;

/**
 * @author menmenz
 * @version 1.0
 * @date 7/28/21 11:22 AM
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
