package com.yangtao.test.entry;

public class Person {
    private String name;
    private int age;
    private String userName;

    public Person() {
    }

    public Person(String name, int age, String userName) {
        this.name = name;
        this.age = age;
        this.userName = userName;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
