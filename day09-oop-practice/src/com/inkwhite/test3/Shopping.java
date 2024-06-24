package com.inkwhite.test3;
//定义数组存储3个商品对象。
//商品的属性：商品的id,名字，价格，库存。
//创建三个商品对象，并把商品对象存入到数组当中
public class Shopping {
    private String id;         // 商品id
    private String name;    // 商品名称
    private double price;    // 商品名称
    private int inventory;  // 库存

    public Shopping() {
    }

    public Shopping(String id, String name, double price, int inventory) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inventory = inventory;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return inventory
     */
    public int getInventory() {
        return inventory;
    }

    /**
     * 设置
     * @param inventory
     */
    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public String toString() {
        return "Shopping{id = " + id + ", name = " + name + ", price = " + price + ", inventory = " + inventory + "}";
    }
}
