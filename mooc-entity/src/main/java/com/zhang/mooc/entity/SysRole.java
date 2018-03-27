package com.zhang.mooc.entity;

import java.util.Date;

public class SysRole {
    private Integer id;

    private String roleName;

    private String roleDesc;

    private String rights;

    private String addQx;

    private String delQx;

    private String editQx;

    private String queryQx;

    private Integer userId;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    public String getRights() {
        return rights;
    }

    public void setRights(String rights) {
        this.rights = rights == null ? null : rights.trim();
    }

    public String getAddQx() {
        return addQx;
    }

    public void setAddQx(String addQx) {
        this.addQx = addQx == null ? null : addQx.trim();
    }

    public String getDelQx() {
        return delQx;
    }

    public void setDelQx(String delQx) {
        this.delQx = delQx == null ? null : delQx.trim();
    }

    public String getEditQx() {
        return editQx;
    }

    public void setEditQx(String editQx) {
        this.editQx = editQx == null ? null : editQx.trim();
    }

    public String getQueryQx() {
        return queryQx;
    }

    public void setQueryQx(String queryQx) {
        this.queryQx = queryQx == null ? null : queryQx.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}