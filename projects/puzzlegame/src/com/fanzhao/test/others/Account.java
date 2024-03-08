package com.fanzhao.test.others;

public class Account {
    private String UID;
    private String username;
    private String pwd;


    public Account() {
    }

    public Account(String UID, String username, String pwd) {
        this.UID = UID;
        this.username = username;
        this.pwd = pwd;
    }

    /**
     * 获取
     * @return UID
     */
    public String getUID() {
        return UID;
    }

    /**
     * 设置
     * @param UID
     */
    public void setUID(String UID) {
        this.UID = UID;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 设置
     * @param pwd
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String toString() {
        return "Account{UID = " + UID + ", username = " + username + ", pwd = " + pwd + "}";
    }
}
