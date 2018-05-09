package com.gkey.jmc.core.exception;

/**
 * 业务异常 400
 */
public class ServiceException extends BaseException {

    private int status = 400;

    private static final long serialVersionUID = -1794684644067351952L;

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, int status) {
        super(message);
        this.status = status;
    }

    public ServiceException(String message, Throwable cause, int status) {
        super(message, cause);
        this.status = status;
    }

    public ServiceException(String messageCode, String messageInformation) {
        super(messageCode, messageInformation);
    }

    public ServiceException(String messageCode, String messageInformation, Throwable e) {
        super(messageCode, messageInformation, e);
    }

    public int getStatus() {
        return status;
    }
}
