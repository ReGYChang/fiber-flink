package com.regy.quantalink.common.exception;

/**
 * @author regy
 */
public class FlinkException extends QuantalinkException {

    public FlinkException(String errorCode, String message) {
        super(errorCode, message);
    }

    public FlinkException(String errorCode, String message, Throwable cause) {
        super(errorCode, message, cause);
    }
}
