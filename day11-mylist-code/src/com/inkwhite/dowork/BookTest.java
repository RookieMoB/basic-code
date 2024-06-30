package com.inkwhite.dowork;

import java.beans.beancontext.BeanContext;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//利用面向对象的思想设计一个图书管理系统。图书的属性有：编号，书名，作者，价格。要求提供如下功能：
//1、提供操作菜单，可以选择要进行的操作。
//2、可以添加图书，添加图书时，编号需要唯一，添加成功，返回到菜单。
//3、可以查询图书，显示所有图书信息，然后返回到菜单。
//4、可以根据书名，查询单本图书信息，显示信息后，返回到菜单。
//5、可以删除图书，通过编号删除，删除成功后，返回到菜单。
//6、可以修改图书的信息，但编号不可以修改，修改成功后，返回到菜单。
//7、可以退出系统，结束程序运行。
public class BookTest {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        Book book1 = new Book(1, "Java入门到起飞", "阿伟", "299.99");
        Book book2 = new Book(2, "C++入门到起飞", "阿伟", "799.99");
        Book book3 = new Book(3, "Python入门到起飞", "阿伟", "99.99");

        books.add(book1);
        books.add(book2);
        books.add(book3);

        int choose = -1;
        Scanner sc = new Scanner(System.in);

        loop:
        while (true) {
            showMenu();
            choose = sc.nextInt();
            switch (choose) {
                case 1 -> {
                    boolean add = isAdd(books);
                    System.out.println(add ? "添加成功" : "添加失败");
                    break;
                }
                case 2 -> {
                    showAllBookInfo(books);
                    break;
                }
                case 3 -> {
                    System.out.println("请输入你想要进行查询的图书的名称");
                    String name = sc.next();
                    showSingle(books, name);
                    break;
                }
                case 4 -> {
                    while (true) {
                        System.out.println("请输入您想要进行删除的学生🆔:");
                        int id = sc.nextInt();
                        boolean del = isDel(books, id);
                        if (del) {
                            System.out.println("删除成功");
                            break;
                        } else {
                            System.out.println("删除失败，当前🆔不存在");
                        }
                    }
                    break;
                }
                case 5 -> {
                    System.out.println("请输入要进行修改的图书🆔");
                    int id = sc.nextInt();
                    isModify(books, id);
                    break;
                }
                case 6 -> {
                    System.out.println("成功退出系统");
                    break loop;
                }
                default -> {
                    System.out.println("输入错误，请重试");
                    break;
                }
            }
        }
    }

    // 修改图书信息
    public static void isModify(ArrayList<Book> books, int id) {
        Scanner sc = new Scanner(System.in);
        boolean isExist = false;
        if (books.isEmpty()) {
            System.out.println("当前藏书为 0，删除失败！");
            return;
        }

        int index = 0;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBook_id() == id) {
                index = i;
                isExist = true;
            }
        }

        while (true) {
            if (isExist) {
                System.out.println("请输入要修改的图书的名称");
                String book_name = sc.next();
                System.out.println("请输入要修改的图书的作者");
                String book_author = sc.next();
                System.out.println("请输入要修改的图书的价格");
                String book_price = sc.next();
                books.get(index).setBook_name(book_name);
                books.get(index).setBook_author(book_author);
                books.get(index).setBook_price(book_price);
                break;
            } else {
                System.out.println("当前图书不存在，删除失败");
            }
        }
    }

    // 删除图书信息
    public static boolean isDel(ArrayList<Book> books, int id) {
        boolean isExist = false;
        if (books.isEmpty()) {
            System.out.println("当前藏书为 0，删除失败！");
            return false;
        }

        int index = 0;

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBook_id() == id) {
                index = i;
                isExist = true;
                break;
            }
        }

        if (isExist) {
            books.remove(index);
            return true;
        } else {
            return false;
        }
    }

    // 查询单个图书的信息
    public static void showSingle(ArrayList<Book> books, String name) {
        boolean isExist = false;
        System.out.println("--------------------------------------------------");
        System.out.println("图书编号\t\t图书名称\t\t\t图书作者\t\t图书价格");
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBook_name().equals(name)) {
                isExist = true;
                books.get(i).showInfo();
            }
        }
        System.out.println("--------------------------------------------------");

        if (!isExist) {
            System.out.println("当前查询的图书信息不存在");
        }
    }

    // 查询全部图书的信息
    public static void showAllBookInfo(ArrayList<Book> books) {
        if (books.isEmpty()) {
            System.out.println("当前藏书为 0，请添加后进行查询");
        }

        System.out.println("--------------------------------------------------");
        System.out.println("图书编号\t\t图书名称\t\t\t图书作者\t\t图书价格");
        for (Book book : books) {
            book.showInfo();
        }
        System.out.println("--------------------------------------------------");
    }

    // 添加图书
    public static boolean isAdd(ArrayList<Book> books) {
        Scanner sc = new Scanner(System.in);
        int id;
        while (true) {
            boolean isExist = false;
            System.out.println("请输入图书编号");
            id = sc.nextInt();
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).getBook_id() == id) {
                    System.out.println("当前学生编号已存在,请重新输入");
                    isExist = true;
                    break;
                }
            }

            if (!isExist) {
                break;
            }
        }
        System.out.println("请输入图书名称");
        String book_name = sc.next();
        System.out.println("请输入图书作者");
        String book_author = sc.next();
        System.out.println("请输入图书价格");
        String book_price = sc.next();
        Book book = new Book(id, book_name, book_author, book_price);
        books.add(book);
        return true;
    }

    // 菜单展示
    public static void showMenu() {
        System.out.println("------ 欢迎来到 InkWhite 图书馆 ------");
        System.out.println("------------ 1、添加图书 ------------");
        System.out.println("---------- 2、查询全部图书 ----------");
        System.out.println("---------- 3、查询单本图书 ----------");
        System.out.println("------------ 4、删除图书 ------------");
        System.out.println("---------- 5、修改图书信息 ----------");
        System.out.println("------------ 6、退出系统 ------------");
        System.out.println("-------------------------------------");
    }
}
