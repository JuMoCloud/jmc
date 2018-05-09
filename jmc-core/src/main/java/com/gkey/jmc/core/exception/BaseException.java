package com.gkey.jmc.core.exception;

import org.apache.commons.lang3.StringUtils;

/**
 * 自定义异常基础类
 * @author GuoKey[wszghj@aliyun.com]
 *
 */
public class BaseException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String messageCode;
    private String messageInformation;
    private String exceptionSource;
    private String responseCode;
    private String responseInformation;

    public String getResponseCode() {
        return responseCode;
    }

    public String getResponseInformation() {
        return responseInformation;
    }

    public BaseException(String messageCode, String messageInformation, Throwable e) {
        super(e);
        this.messageCode = messageCode;
        this.messageInformation = messageInformation;
    }

    public BaseException(Throwable t) {
        super(t);
    }
    public BaseException(String message, Throwable t) {
        super(message, t);
    }

    public BaseException(String messageCode, String messageInformation) {
        super(messageCode + "," + messageInformation);
        this.messageCode = messageCode;
        this.messageInformation = messageInformation;
    }

    public BaseException(String messageInformation) {
        super(messageInformation);
        this.messageInformation = messageInformation;
    }

    @Override
    public String getMessage() {
        if (StringUtils.isBlank(super.getMessage())) {
            return this.getMessageInformation();
        }
        return super.getMessage();
    }

    public String getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    public String getMessageInformation() {
        return messageInformation;
    }

    public void setMessageInformation(String messageInformation) {
        this.messageInformation = messageInformation;
    }

    public String getExceptionSource() {
        return exceptionSource;
    }

    public void setExceptionSource(String exceptionSource) {
        this.exceptionSource = exceptionSource;
    }
}
