package com.inkwhite.demo3;

public class Chef extends Employee {
    public Chef() {
    }

    public Chef(int id, String name, String wages) {
        super(id, name, wages);
    }

    @Override
    public void work() {
        System.out.println("炒菜");
    }

    public String toString() {
        return "Chef{}";
    }
}
