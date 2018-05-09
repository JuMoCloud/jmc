package com.gkey.jmc.core.exception;

/**
 * 异常
 *
 * @author guohongjian[guo_hj@suixingpay.com]
 */
public class ExceptionCode {

    /**
     * 404异常.
     */
    public static final int EXCEPTION_404 = 404;

    /**
     * 业务异常.
     */
    public static final int EXCEPTION_SERVICE = 400;

    /**
     * 系统异常.
     */
    public static final int EXCEPTION_SYSTEM = 199;

    /**
     * 校验异常.
     */
    public static final int EXCEPTION_JSRVALID = 303;

    /**
     * 幂等校验.
     */
    public static final int EXCEPTION_IDEMPOTENT = 304;

    /**
     * 登陆错误.
     */
    public static final int EXCEPTION_LOGIN = 901;

    /**
     * 数据源异常
     */
    public static final int EXCEPTION_DATASOURCE = 902;

}
