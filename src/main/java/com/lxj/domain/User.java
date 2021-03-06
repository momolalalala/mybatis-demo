package com.lxj.domain;

/**
 * Created by lxj on 2016/7/12.
 */
public class User {
    private int id;
    private String name;
    private int age;

    public User(){}

    public User(String name,int age) {
        this.age = age;
        this.name = name;
    }

    public User(int id, String name,int age) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User [ id = " + id + " , name = " + name + " , age = " + age + " ]";
    }
}
