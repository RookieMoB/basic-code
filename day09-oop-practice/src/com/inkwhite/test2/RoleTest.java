package com.inkwhite.test2;

public class RoleTest {
    public static void main(String[] args) {
        Role role1 = new Role("乔泰", 100, '男');
        Role role2 = new Role("鸠摩智", 100, '女');
        role1.showRoleInfo();
        role1.showRoleInfo();

        while (true) {
            role1.attack(role2);
            if (role2.getBlood() == 0) {
                System.out.println(role1.getName() + " 胜");
                break;
            }

            role2.attack(role1);
            if (role1.getBlood() == 0) {
                System.out.println(role2.getName() + " 胜");
                break;
            }
        }
    }
}
