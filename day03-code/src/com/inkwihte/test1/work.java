package com.inkwihte.test1;

public class work {
    public static void main(String[] args) {
//        /*
//        * 第一题
//        * 身高是具有遗传性的，子女的身高和父母的身高有一定的关系。假定，父母和子女的身高遗传关系如下：
//        * 儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2
//        * 女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2
//         * 现有父亲身高177CM,母亲身高165CM。求子女身高分别预计为多少？*/
//        int father_height = 177;
//        int mother_height = 165;
//        double child_boy = (father_height + mother_height) * 1.08 / 2;
//        double child_girl = (father_height * 0.923 + mother_height) / 2;
//        System.out.println("男孩身高为 : " + child_boy);// 184.68
//        System.out.println("女孩身高为 : " + child_girl);// 164.1855


//        /*
//        * 第二题
//        * 红茶妹妹有21元钱，她攒了几天钱之后自己的钱比原来的两倍还多三块。
//        * 绿茶妹妹有24元钱，她攒了几天钱之后自己的钱正好是原来的两倍。
//        * 那么红茶和绿茶现在的钱一样多，请问对么？*/
//        int red_tea = 21;
//        int green_tea = 24;
//        int red_tea_curr = red_tea * 2 + 3;
//        int green_tea_curr = green_tea * 2;
//        System.out.println(red_tea_curr == green_tea_curr ? "一样" : "不一样");  // 不一样


        /*
        * 第三题
        * 某小伙想定一份外卖，商家的优惠方式如下：
        * 鱼香肉丝单点24元，油炸花生米单点8元，米饭单点3元。
        * 订单满30元8折优惠。鱼香肉丝优惠价16元，
        * 但是优惠价和折扣不能同时使用。
        * 那么这个小伙要点这三样东西，最少要花多少钱？*/
//        double all_discounts = (24 + 8 + 3) * 0.8;
//        double discounts = 16 + 8 + 3;
//        System.out.println(all_discounts < discounts ? "第一种方案" : "第二种方案");  // 第二种方案
        // 以上写法不严谨
        // 正确写法如下
        double money = 24 + 8 + 3;
        double all_discounts = money >= 30 ? money * 0.8 : money;
        double discounts = 16 + 8 + 3;
        boolean is_low_price = all_discounts < discounts;
        String Scheme1 = "第一种方案，且价钱为 : " + all_discounts;
        String Scheme2 = "第二种方案，且价钱为 : " + discounts;
        System.out.println(is_low_price ? Scheme1 : Scheme2);

        // 第四题  4

        // 第五题  TomasZhang

//        /*
//        * 第六题
//        * 数字6是一个真正伟大的数字，键盘录入两个整数。
//        * 如果其中一个为6，最终结果输出true。
//        * 如果它们的和为6的倍数。最终结果输出true。
//        * 其他情况都是false。*/
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        System.out.println((num1 + num2) % 6 == 0 || num1 == 6 || num2 == 6);

//        /*
//        * 第七题
//        * 需求：
//    	* 键盘录入一个三位数，求这个三位数每一位的数字和。
//    	* 举例：
//    	* 	键盘录入123。那么每一位数字相加为：1 + 2 + 3，和为：6。*/
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int ge = num % 10;
//        int shi = num / 10 % 10;
//        int bai = num / 100 % 10;
//        int sum = ge + shi + bai;
//        System.out.println("原来的数字为 : " + num + "\n" + ge + " + " + shi + " + " + bai + " = " + sum);
    }
}
