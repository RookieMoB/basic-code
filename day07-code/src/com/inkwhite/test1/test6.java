package com.inkwhite.test1;

// 数字加密
// 某系统的数字密码（大于0)，比如1983，采用加密方式进行传输。
//规则如下：
//先得到每位数，然后每位数都加上5，再对10求余，最后将所有数字反转，得到一串新数。
public class test6 {
    public static void main(String[] args) {

        int[] new_num = numEncryption(7895);
        System.out.println("初始数字为 : 7895");

        System.out.print("加密之后的数字为 : ");
        for (int i = 0; i < new_num.length; i++) {
            System.out.print(new_num[i]);
        }

        System.out.println();

        int[] decode = numDecode(new_num);
        System.out.print("解密之后的数字为 : ");
        for (int i = 0; i < decode.length; i++) {
            System.out.print(decode[i]);
        }
    }

    public static int[] numDecode(int[] arr) {    // 给数字解密
        // 1.将数组进行反转
        // 1.1定义一个新数组用于接收
        int[] new_arr = new int[arr.length];
        // 1.2将传入进来的数组进行反转添加到新数组内
        int index = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            new_arr[index] = arr[i];
            index--;
        }
        // 验证反转之后的数组
//        printArr(new_arr);
        // 因为之前的加密是将数字进行 +5 所以解密就要先 -5
        for (int i = 0; i < new_arr.length; i++) {
            new_arr[i] -= 5;
            // 如果该数字 -5之后小于 0的话，给他 + 10
            if (new_arr[i] < 0) {
                new_arr[i] += 10;
            }
        }
        // 验证解密之后的数组
//        printArr(new_arr);  //成功
        return new_arr;
    }


    public static int[] numEncryption(int num) {// 给数字加密
        int temp1 = num;
        int temp2 = num;
        int length = 0;
        while (temp1 != 0) {        // 得到之前数字的长度
            temp1 /= 10;
            length++;
        }
        int[] new_num = new int[length];        // 创建一个与之匹配的数组
        int exchange_temp = 0;                  // 用于交换的临时变量
        for (int i = 0; i < length; i++) {      // 对数组元素进行反转
            if (temp2 != 0) {
                exchange_temp = temp2 % 10;
                new_num[i] = exchange_temp;
                temp2 /= 10;
            }
        }

        for (int i = 0; i < length; i++) {     // 对数组内每个元素进行 +5、对 10 取余
            new_num[i] += 5;
            new_num[i] %= 10;
        }
        return new_num;
    }


    public static void printArr(int[] arr) {
        System.out.print("\n[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
