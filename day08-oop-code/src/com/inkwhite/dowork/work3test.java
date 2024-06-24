package com.inkwhite.dowork;
// 要求：
//	1.按照以上要求定义Manager类和Coder类,属性要私有,生成空参、有参构造，set和get方法
//	2.定义测试类,在main方法中创建该类的对象并给属性赋值(set方法或有参构造方法)
//	3.调用成员方法,打印格式如下:
// 工号为123基本工资为15000奖金为6000的项目经理张三正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
// 工号为135基本工资为10000的程序员李四正在努力的写着代码......
public class work3test {
    public static void main(String[] args) {
        // 项目经理
        work3Manager wm = new work3Manager("张三", 123, 15000, 6000);
        wm.show();
        wm.work();
        // 程序员
        work3Coder wc = new work3Coder("李四", 135, 10000);
        wc.show();
        wc.work();
    }
}
