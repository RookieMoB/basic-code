package com.inkwhite.ArrayListTest;
//需求：
//1,main方法中定义一个集合，存入三个用户对象。
//用户属性为：id,username,password
//2,要求：定义一个方法，根据id查找对应的用户信息。
//如果存在，返回true
//如果不存在，返回false
public class test5User {
    private int id;
    private String username;
    private int password;

    public test5User() {
    }

    public test5User(int id, String username, int password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
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
     * @return password
     */
    public int getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(int password) {
        this.password = password;
    }

    public String toString() {
        return "test5User{id = " + id + ", username = " + username + ", password = " + password + "}";
    }
}
