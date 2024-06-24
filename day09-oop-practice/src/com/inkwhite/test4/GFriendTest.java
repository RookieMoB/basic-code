package com.inkwhite.test4;

//定义数组存储4个女朋友的对象
//女朋友的属性：姓名、年龄、性别、爱好
//要求1：计算出四女朋友的平均年龄
//要求2：统计年龄比平均值低的女朋友有几个？并把她们的所有信息打印出来。
public class GFriendTest {
    public static void main(String[] args) {
        GFriend[] gfs = new GFriend[4];
        GFriend gf1 = new GFriend("lili", 18, '女', "网球");
        GFriend gf2 = new GFriend("sisi", 50, '女', "排球");
        GFriend gf3 = new GFriend("wanwan", 15, '女', "蓝球");
        GFriend gf4 = new GFriend("susu", 24, '女', "羽毛球");

        gfs[0] = gf1;
        gfs[1] = gf2;
        gfs[2] = gf3;
        gfs[3] = gf4;

        int age_sum = 0;

        for (int i = 0; i < gfs.length; i++) {
            age_sum += gfs[i].getAge();
        }
        int age_avg = age_sum / gfs.length;
        System.out.println("我的四位女朋友的平均年龄为 : " + age_avg);

        int count = 0;
        for (int i = 0; i < gfs.length; i++) {
            if (age_avg > gfs[i].getAge()) {
                count++;
                gfs[i].showInfo();
            }
        }
        System.out.println("符合条件的女朋友有 " + count + " 个");
    }
}
