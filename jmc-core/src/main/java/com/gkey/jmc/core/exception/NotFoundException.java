package com.gkey.jmc.core.exception;

/**
 * 404 业务异常
 */
public class NotFoundException extends ServiceException {

    private static final long serialVersionUID = 6586938551931874299L;

    public NotFoundException(String message) {
        super(message, 404);
    }
}
