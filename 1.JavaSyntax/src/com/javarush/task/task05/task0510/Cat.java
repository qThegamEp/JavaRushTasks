package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    public static void main(String[] args){
    }

    private String name = null;
    private int age = 5;
    private int weight = 5;
    private String address = null;
    private String color;

    public void initialize(String name){
        this.name = name;
        this.color = "Grey";
    }
    public void initialize(String name,int weight,int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Gray";
    }
    public void initialize(String name,int age){
        this.name = name;
        this.age = age;
        this.color = "Gray";
    }
    public void initialize(int weight,String color){
        this.weight = weight;
        this.color = color;
    }
    public void initialize(int weight,String color,String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
}
