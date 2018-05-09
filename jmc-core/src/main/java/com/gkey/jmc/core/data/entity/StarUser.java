package com.gkey.jmc.core.data.entity;

import com.gkey.jmc.core.data.dto.BasicsPo;

/**
 * 用户表 实体Entity
 * 
 * @author: Guokey
 * @date: 2018-05-09 14:48:15
 * @version: V1.0-auto
 * @review: Guokey/2018-05-09 14:48:15
 */
public class StarUser extends BasicsPo<Long> {

    private static final long serialVersionUID = 1L;

    /** 主键. */
    private Long id;

    /** 登陆账户. */
    private String loginName;

    /** 登陆密码. */
    private String loginPw;

    /** 昵称. */
    private String nickName;

    /** 邮箱. */
    private String email;

    /** 手机号. */
    private String mobile;

    /** 部门名称. */
    private String departMent;

    /** 角色id. */
    private String roleCode;

    /** 状态 1正常，0禁止登陆，-1删除. */
    private Integer state;

    /** 备注. */
    private String remark;

    /** 主键 get方法. */
    public Long getId() {
        return id;
    }

    /** 主键 set方法. */
    public void setId(Long id) {
        this.id = id;
    }

    /** 登陆账户 get方法. */
    public String getLoginName() {
        return loginName == null ? null : loginName.trim();
    }

    /** 登陆账户 set方法. */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /** 登陆密码 get方法. */
    public String getLoginPw() {
        return loginPw == null ? null : loginPw.trim();
    }

    /** 登陆密码 set方法. */
    public void setLoginPw(String loginPw) {
        this.loginPw = loginPw == null ? null : loginPw.trim();
    }

    /** 昵称 get方法. */
    public String getNickName() {
        return nickName == null ? null : nickName.trim();
    }

    /** 昵称 set方法. */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /** 邮箱 get方法. */
    public String getEmail() {
        return email == null ? null : email.trim();
    }

    /** 邮箱 set方法. */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /** 手机号 get方法. */
    public String getMobile() {
        return mobile == null ? null : mobile.trim();
    }

    /** 手机号 set方法. */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /** 部门名称 get方法. */
    public String getDepartMent() {
        return departMent == null ? null : departMent.trim();
    }

    /** 部门名称 set方法. */
    public void setDepartMent(String departMent) {
        this.departMent = departMent == null ? null : departMent.trim();
    }

    /** 角色id get方法. */
    public String getRoleCode() {
        return roleCode == null ? null : roleCode.trim();
    }

    /** 角色id set方法. */
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    /** 状态 1正常，0禁止登陆，-1删除 get方法. */
    public Integer getState() {
        return state;
    }

    /** 状态 1正常，0禁止登陆，-1删除 set方法. */
    public void setState(Integer state) {
        this.state = state;
    }

    /** 备注 get方法. */
    public String getRemark() {
        return remark == null ? null : remark.trim();
    }

    /** 备注 set方法. */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
