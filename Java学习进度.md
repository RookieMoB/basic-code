> 从2024-6-6下午开始，学习黑马程序员的Java

# 快捷键及快捷命令

## 快捷键

1、`ctrl + art l`快速格式化代码

2、`ctrl + alt + v`可以快速为带有返回值的方法名提供变量用于接受	

![image-20240614090659958](./assets/image-20240614090659958.png)`ctrl + alt + v`![image-20240614090720127](./assets/image-20240614090720127.png)

3、`ctrl + p`在函数传参的时候，如果不知道该传入什么参数，可以使用该快捷键

![image-20240614184311568](./assets/image-20240614184311568.png)`ctrl + p`![image-20240614184319919](./assets/image-20240614184319919.png)

4、`ctrl + alt + m`快捷抽取方法

5、`shift + f6`快速重命名

6、`alt + insert` 快速生成构造函数和getxxx(()、setxxx()方法，可以指定参数，也可以`ctrl + a`全选

<img src="./assets/image-20240616164559018.png" alt="image-20240616164559018" style="zoom:67%;" />**构造函数**<img src="./assets/image-20240616164641671.png" alt="image-20240616164641671" style="zoom:67%;" />

**Getter and Setter**<img src="./assets/image-20240616164716870.png" alt="image-20240616164716870" style="zoom:67%;" />

7、`ctrl + b`选中某一个函数，按此快捷键可以跳转到定义

8、`ctrl + alt + t`为选中的代码块进行语句选择

<img src="./assets/image-20240624151145769.png" alt="image-20240624151145769" style="zoom:67%;" />

9、`ctrl + n`可以在查看源码的时候使用

<img src="./assets/image-20240625080434160.png" alt="image-20240625080434160" style="zoom:67%;" /><img src="./assets/image-20240625080508824.png" alt="image-20240625080508824" style="zoom:67%;" />使用`All Places`

10、`ctrl + f12`可以查看当前包下有哪些类

<img src="./assets/image-20240625080752905.png" alt="image-20240625080752905" style="zoom:67%;" />





















## 快捷命令

1、使用`psvm`可以快捷输入👇

`public static void main(String[] args) {}`

2、使用`sout`可以快捷输入👇

`System.out.println();`

3、使用`100.fori`可以快捷输入👇

`for (int i = 0; i <= 100; i++) {}`

4、使用`100.forr`可以快捷输入👇

`for (int i = 100; i > 0; i--) {}`

5、、使用`数组名.fori`可以快捷输入👇

`for (int i = 0; i < 数组名.length; i++) { System.out.println(数组名[i]); }`



## other

1、关闭idea中的ai代码提示：

`Enable Full Line suggestions`

![](./assets/image-20240609162030918.png)

2、关于如何快速生成JavaBean

安装插件PTG

![image-20240616170300417](./assets/image-20240616170300417.png)



# 学习进度

## 第一天6.6

Java入门

Java基础概念



### 作业

A
B
BC——应修改为ABCD
BACD
CBDA

![](./assets/image-20240607214709527.png)



> 总结：编程语言基础部分大同小异，但是细追究的话，还是有区别的
>
> 本来是能给Java基础学完的，但是要去开实习动员会，只能放到明天了

## 第二天6.7

学习完成Java基础概念



> 总结：
>
> 今天课比较多，时间较紧，完成了数据库的大作业前的一个实训，已经9点了，再去做一下vue的大作业，马上就要进行答辩了



## 第三天6.8

学习了Java的运算符

判断和循环学了 4 集

> 总结：
>
> 在学习判断和循环的时候，对于
>
> ```java
> //老师的建议是 不要使用 == ，避免出现非判断而赋值的情况发生，但是之前在C++中是可以使用如下格式进行判断的，我在Java中试了一下，可以但是会报警告⚠️'true == a' can be simplified to 'a' ，意为可以简化为 a
> // 那么这种写法就可以在后面进行判断的时候进行实现，其实也是为了非判断而赋值 
> boolean a = false;
> if (true == a) {
> 	System.out.println(a);
> } else {
> 	System.out.println('a');
> }
> ```



## 第四天6.9

学习完成java的判断和循环

对于switch来说，JDK12加入了新特性

之前：

```java
int num = sc.nextInt();
switch(num) {
    case 1:
        System.out.println('a');
        break;
    case 2:
        System.out.println('b');
        break;
    case 3:
        System.out.println('c');
        break;  
    default:
        System.out.println('d');
}
```

JDK12之后：

```java
int num = sc.nextInt();
switch() {
    case 1 -> {
        System.out.println('a');
    }
    case 2 -> {
        System.out.println('b');
    }
    case 3 -> {
        System.out.println('c');
    }      
    default -> {
        System.out.println('d');
    }
}
```

对于新特性里面的case，如果case里面只有一行代码的话：

```java
int num = sc.nextInt();
switch() {
    case 1 -> System.out.println('a');
    case 2 -> System.out.println('b');
    case 3 -> System.out.println('c');
    default -> System.out.println('d');
}
```

对于switch有返回值的情况

```java
String curr_str = "";
int num = sc.nextInt();
curr_str = switch(num) {
    case 1 -> return 'a';
    case 2 -> return 'b';
    case 3 -> return 'c';
    default -> return 'd';
}
```

```java
public static String numToRomanNum(char num) {
    String str = "";
    switch (num) {
        case '0' -> str = " ";
        case '1' -> str = "Ⅰ";
        case '2' -> str = "Ⅱ";
        default -> str = "烫";
    }
    return str;
}
```

或者可以，注意要加`;`

```java
public static String numToRomanNum(char num) {
    String str = switch (num) {
        case '0' -> " ";
        case '1' -> "Ⅰ";
        case '2' -> "Ⅱ";
        default -> "烫";
    };
    return str;
}
```

`switch`和`if第三种格式`的使用场景

> `if第三种格式`：一般用于对范围的判断
>
> `switch`：把有限个数据一一列举出来，让我们任选其一

## 第五天6.13

学习完成循环高级综合练习

数组，以及方法的入门

### 随机数

生成指定范围随机数

`int num = rand.nextInt((max + 1) - min) + min`

`max + 1`:因为是包左不包右的，所以要给范围 + 1 表示包含

`(max + 1) - min`:要想使得左范围指定，那么两边必须同时加上指定区间，所以要先减

`((max + 1) - min) + min`:再加上指定范围即可

如：

```java
// 生成指定范围 3 ~ 5 的随机数
Random r = new Random();
int num = 0;
for (int i = 0; i < 10; i++) {
    num = r.nextInt((5 + 1) - 3) + 3;
    System.out.println(num);
}
```

### 地址值

对于

```java
package com.inkwhite.array;
public class demo1 {
    public static void main(String[] args) {
        int[] age_arr = new int[]{18, 19, 18, 17, 21};
        String[] name_arr = {"张三", "李四", "王五"};
        double[] height_arr = {11.1, 22.2, 33.3, 44.4};

        System.out.println(age_arr);// [I@10f87f48
        System.out.println(name_arr);// [Ljava.lang.String;@b4c966a
        System.out.println(height_arr);// [D@2f4d3709
    }
}

```

那么`[I@10f87f48`
`[Ljava.lang.String;@b4c966a`
`[D@2f4d3709`的含义是什么呢

> `[`表示数组
>
> `I、Ljava.lang.String;、D`表示数组的数据类型
>
> `10f87f48、b4c966a、2f4d3709`表示地址值

### 数组

数组默认初始化值的规律
`整数类型`：默认初始化值`0`
`小数类型`：默认初始化值`0.0`
`字符类型`：默认初始化值`'/u0000'`空格
`布尔类型`：默认初始化值`false`
`引用数据类型`：默认初始化值`null`



### 方法

小技巧

1. 我要干嘛？
2. 需要什么才能干这件事？
3. 方法的调用处，是否需要继续使用方法的结果

## 第六天6.14

学习完成方法



### 方法的内存

`基本数据类型`：变量中存储的是真实的数据

`引用数据类型`：变量中存储的是地址值

`引用`：使用了其他空间中的数据

1.方法调用的基本内存原理

2.方法传递基本数据类型的内存原理

​		传递基本数据类型时，传递的是真实的数据，形参的改变，不影响实际参数值

​        不像 `cpp`，`java` 没有`&`，只能通过 `return` 将修改的值进行返回

3.方法传递引用数据类型的内存原理

​		传递引用数据类型时，传递的是地址值，形参的改变，影响实际参数的值

## 第七天6.16

11道综合练习，对前面知识点的巩固

面向对象程序设计

### 对于封装

对象代表什么，就得封装对应的数据，并提供数据对应的行为

### 关于this

代表方法调用者的地址值

### 成员变量与局部变量的区别

![image-20240616174525935](./assets/image-20240616174525935.png)

## 第八天6.17

关于

第一套键盘录入体系

`nextInt()`接收整数

`nextDouble()`接收浮点数

`next()`接收字符串

但是以上三种情况`不接收``空格`、`制表符`

第二套键盘录入体系

`nextInt()`接收字符串，`接收``空格`、`制表符`

这两套体系不可以混用

## 第九天6-24

完成面向对象综合训练

字符串api，还剩下字符串的两个联系以及字符串的底层原理

注意`StringBuilder`和`StringJoiner`的使用

​					 一个可变的操作字符串的容器`StringBuilder`优点为==拼接字符串==和==反转字符串==相对较简洁

`JDK8`出现的一个可变的操作字符串的容器`StringJoiner`优点为拼接字符串的时候可以指定==间隔内容==和==开头==以及==结尾==的内容



## 第十天6-25

字符串api

`StringBuilder`源码分析

- 默认创建一个长度为16的字节数组
- 添加的内容长度小于16，直接存
- 添加的内容大于16会扩容（原来的容量*2+2)
- 如果扩容之后还不够，以实际长度为准

再进行测试的时候，对于扩容会有`两次`，因为我使用的是`JDK22`，在第一次扩容为`32`的时候，如果超出范围，则同样规则扩容为`70`，再之后才是`以实际长度为准`

也不全是，如下：

第一种情况

```java
package com.inkwhite.stringbuliderdemo;

public class StringBuilderDemo4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("abc");
        System.out.println();
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("defghijklmnopqrstuvwxyz");
        System.out.println();
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("defghijklmnopqrstuvwxyz012345678900000000000000000");
        System.out.println();
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("defghijkl000");
        System.out.println();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}

```



第二种情况，每次都创建一个新的StringBuilder的话，容量的却和源码分析一致

```java
package com.inkwhite.stringbuliderdemo;

public class StringBuilderDemo4 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();

        System.out.println(sb1.capacity());
        System.out.println(sb1.length());

        StringBuilder sb2 = new StringBuilder();
        sb2.append("abc");
        System.out.println();
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());

        StringBuilder sb3 = new StringBuilder();
        sb3.append("abcdefghijklmnopqrstuvwxyz");
        System.out.println();
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());

        StringBuilder sb4 = new StringBuilder();
        sb4.append("abcdefghijklmnopqrstuvwxyz0123456789");
        System.out.println();
        System.out.println(sb4.capacity());
        System.out.println(sb4.length());

        StringBuilder sb5 = new StringBuilder();
        sb5.append("abcdefghijklmnopqrstuvwxyz01234567890000");
        System.out.println();
        System.out.println(sb5.capacity());
        System.out.println(sb5.length());

        StringBuilder sb6 = new StringBuilder();
        sb6.append("abcdefghijklmnopqrstuvwxyz012345678900000000000000000000000000000000");
        System.out.println();
        System.out.println(sb6.capacity());
        System.out.println(sb6.length());
    }
}

```

> 总结：
>
> ​	其实对比而言，源码分析是完全正确的，都是在16的基础上，进行分叉选择，即半倍扩容还是以实际长度为准

 





















































































