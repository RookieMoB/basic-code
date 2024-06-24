package com.inkwhite.test5_1;

//定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
//学生的属性：学号，姓名，年龄。
//要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
//要求2：添加完毕之后，遍历所有学生信息。
//要求3：通过id删除学生信息
//如果存在，则删除，如果不存在，则提示删除失败。
//要求4：删除完毕之后，遍历所有学生信息。
//要求5：查询数组id为"heima002”的学生，如果存在，则将他的年龄+1岁
public class StudentTest {
    public static void main(String[] args) {
        //定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
        Student[] stus = new Student[3];

        Student s1 = new Student(1, "InkWhite", 24);
        Student s2 = new Student(2, "ink", 20);
        Student s3 = new Student(3, "white", 18);

        stus[0] = s1;
        stus[1] = s2;
        stus[2] = s3;

        Student s4 = new Student(4, "墨白", 28);

        // 唯一性判断
        // 已存在 --- 不用添加
        // 不存在 --- 就可以把学生对象添加进数组
        int count = getCount(stus);
        Student[] newArr = new Student[1];
        if (!contains(stus, s4.getStu_id(), count)) {  // 不存在
            if (count == stus.length) {// 1、数组已经存满 --- 只能创建一个新的数组，新数组的长度 = 老数组 + 1
                newArr = createNewArr(stus, s4);
                printArr(newArr);

                //要求3：通过id删除学生信息
                int index = getIndex(newArr, s4.getStu_id());
                if (index != -1) {  // 找到了对应的索引
                    newArr[index] = null;
                    System.out.println("删除成功");
                    printArr(newArr);//要求4：删除完毕之后，遍历所有学生信息。
                } else {
                    System.out.println("要进行删除的学生 id 不存在");
                }
                //要求5：查询数组id为 2 的学生，如果存在，则将他的年龄+1岁
                int index1 = getIndex(newArr, 2);
                if (index1 != -1) {  // 找到了对应的索引
                    System.out.println("找到对应索引 | 修改之前为 : " + newArr[index1].getStu_age());
                    newArr[index1].setStu_age(newArr[index1].getStu_age() + 1);
                    System.out.println("年龄修改成功 | 修改之后为 : " + newArr[index1].getStu_age());
                } else {
                    System.out.println("要进行查询的学生 id 不存在");
                }
            } else {// 2、数组没有存满 --- 直接添加
                stus[count] = s4;
                printArr(stus);
                //要求3：通过id删除学生信息
                int index = getIndex(stus, s4.getStu_id());
                if (index != -1) {  // 找到了对应的索引
                    stus[index] = null;
                    System.out.println("删除成功");
                    printArr(stus);//要求4：删除完毕之后，遍历所有学生信息。
                } else {
                    System.out.println("要进行删除的学生 id 不存在");
                }

                //要求5：查询数组id为 2 的学生，如果存在，则将他的年龄+1岁
                int index1 = getIndex(stus, 2);
                if (index1 != -1) {  // 找到了对应的索引
                    System.out.println("找到对应索引 | 修改之前为 : " + stus[index1].getStu_age());
                    stus[index1].setStu_age(stus[index1].getStu_age() + 1);
                    System.out.println("年龄修改成功 | 修改之后为 : " + stus[index1].getStu_age());
                } else {
                    System.out.println("要进行查询的学生 id 不存在");
                }
            }
        } else {
            System.out.println("当前 🆔 重复，请修改后进行添加");
        }
    }

    public static int getIndex(Student[] arr, int id) {   // 找到 id 在数组中的索引
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (id == arr[i].getStu_id()) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static Student[] createNewArr(Student[] arr, Student s) {
        Student[] stus_new = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            stus_new[i] = arr[i];
        }
        stus_new[stus_new.length - 1] = s;
        System.out.println("添加成功");
        return stus_new;
    }

    public static int getCount(Student[] arr) {   // 判断数组内当前已经存放了几个元素
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    public static boolean contains(Student[] arr, int id, int count) { // 判断数组内是否包含要进行添加的学生id
        boolean isContains = false;
        for (int i = 0; i < count; i++) {
            // 依次获取数组里面的每一个学生对象
            if (id == arr[i].getStu_id()) {     // 进行添加的id包含在当前数组内
                isContains = true;
            }
        }
        return isContains;
    }

    public static void printArr(Student[] stu) {
        for (Student student : stu) {
            if (student != null) {
                student.showInfo();
            }
        }
    }
}
