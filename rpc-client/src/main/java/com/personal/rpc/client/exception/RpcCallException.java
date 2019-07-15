package com.personal.rpc.client.exception;

/**
 * @ClassName RpcCallException
 * @Author xiaokai
 * @Description
 * @Date 2019/7/12 5:17 PM
 * @Version 1.0
 **/
public class RpcCallException extends RuntimeException {

    public RpcCallException() {
        super();
    }

    public RpcCallException(String message) {
        super(message);
    }

    public RpcCallException(String message, Throwable cause) {
        super(message, cause);
    }

    public RpcCallException(Throwable cause) {
        super(cause);
    }

    public RpcCallException(String message, Throwable cause,
                            boolean enableSuppression,
                            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
