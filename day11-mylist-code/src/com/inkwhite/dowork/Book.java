package com.inkwhite.dowork;
//利用面向对象的思想设计一个图书管理系统。图书的属性有：编号，书名，作者，价格。要求提供如下功能：
//1、提供操作菜单，可以选择要进行的操作。
//2、可以添加图书，添加图书时，编号需要唯一，添加成功，返回到菜单。
//3、可以查询图书，显示所有图书信息，然后返回到菜单。
//4、可以根据书名，查询单本图书信息，显示信息后，返回到菜单。
//5、可以删除图书，通过编号删除，删除成功后，返回到菜单。
//6、可以修改图书的信息，但编号不可以修改，修改成功后，返回到菜单。
//7、可以退出系统，结束程序运行。
public class Book {
    private int book_id;
    private String book_name;
    private String book_author;
    private String book_price;

    public Book() {
    }

    public Book(int book_id, String book_name, String book_author, String book_price) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_author = book_author;
        this.book_price = book_price;
    }

    /**
     * 获取
     * @return book_id
     */
    public int getBook_id() {
        return book_id;
    }

    /**
     * 设置
     * @param book_id
     */
    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    /**
     * 获取
     * @return book_name
     */
    public String getBook_name() {
        return book_name;
    }

    /**
     * 设置
     * @param book_name
     */
    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    /**
     * 获取
     * @return book_author
     */
    public String getBook_author() {
        return book_author;
    }

    /**
     * 设置
     * @param book_author
     */
    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    /**
     * 获取
     * @return book_price
     */
    public String getBook_price() {
        return book_price;
    }

    /**
     * 设置
     * @param book_price
     */
    public void setBook_price(String book_price) {
        this.book_price = book_price;
    }

    public String toString() {
        return "Book{book_id = " + book_id + ", book_name = " + book_name + ", book_author = " + book_author + ", book_price = " + book_price + "}";
    }

    public void showInfo() {
        System.out.println(book_id + "\t\t\t" + book_name + "\t" + book_author + "\t\t" + book_price);
    }
}
