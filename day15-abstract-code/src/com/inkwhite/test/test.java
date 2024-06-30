package com.inkwhite.test;

/**
 * @Author: InkWhite
 * @Date: 2024/6/30 17:06
 * @Version: v1.0.0
 * @Description:
 * 我们现在有乒乓球运动员和篮球运动员，乒乓球教练和篮球教练。
 * 为了出国交流，跟乒乓球相关的人员都需要学习英语。
 * 请用所有知识分析，在这个案例中，哪些是具体类，哪些是抽象类，哪些是接口？
 * 乒乓球运动员 TableTennisPlayer：姓名，年龄，学打乒乓球，说英语
 * 篮球运动员 BasketballPlayer：姓名，年龄，学打篮球
 * 乒乓球教练 TableTennisCoach：姓名，年龄，教打乒乓球，说英语
 * 篮球教练 BasketballCoach：姓名，年龄，教打篮球
 **/
public class test {
    public static void main(String[] args) {
        Person p = new BasketballCoach("吴教练", 38);
        p.showInfo(p);

        p = new BasketballPlayer("张冲", 18);
        p.showInfo(p);

        p = new TableTennisCoach("李教练", 44);
        p.showInfo(p);

        p = new TableTennisPlayer("张超", 22);
        p.showInfo(p);
    }
}
