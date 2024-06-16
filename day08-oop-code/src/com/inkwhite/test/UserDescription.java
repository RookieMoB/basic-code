package com.inkwhite.test;

// 用户描述类
public class UserDescription {
    // 成员变量
    private String username;    // 用户名
    private String password;    // 密码
    private String repassword;  // 确认密码
    private String email;       // 邮箱
    private String gender;      // 性别
    private int age;            // 年龄
    private boolean isSucceed = true;  // 是否注册成功

    // 构造函数
    public UserDescription() {
        System.out.println("无参构造");
    }

    public UserDescription(String username, String password, String repassword, String email, String gender, int age) {
        this.username = username;
        this.password = password;
        if (password == repassword) {
            this.repassword = repassword;
        } else {
            this.isSucceed = false;
            System.out.println("两次输入不一致");
        }
        this.email = email;
        this.gender = gender;
        if (age >= 19 && age <= 25) {
            this.age = age;
        } else {
            this.isSucceed = false;
            System.out.println("名字输入不合规矩");
        }
        if (this.isSucceed) {        // 注册成功，打印输出
            System.out.println("--------");
            System.out.println("注册成功|");
            System.out.println("--------");
        } else {      // 注册失败
            System.out.println("--------");
            System.out.println("注册失败|");
            System.out.println("--------");
        }
    }

    // 成员方法
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
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return repassword
     */
    public String getRepassword() {
        return repassword;
    }

    /**
     * 设置
     * @param repassword
     */
    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return isSucceed
     */
    public boolean isIsSucceed() {
        return isSucceed;
    }

    /**
     * 设置
     * @param isSucceed
     */
    public void setIsSucceed(boolean isSucceed) {
        this.isSucceed = isSucceed;
    }

    public String toString() {
        return "UserDescription{username = " + username + ", password = " + password + ", repassword = " + repassword + ", email = " + email + ", gender = " + gender + ", age = " + age + ", isSucceed = " + isSucceed + "}";
    }
}
