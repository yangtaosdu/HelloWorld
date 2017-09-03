package com.yangtao.test;

import com.yangtao.test.entry.Person;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World! I am yangtao");
        Person yangtao=new Person();
        yangtao.setName("yangtao");
        yangtao.setAge(20);
        System.out.println("Name: "+ yangtao.getName()+" Age: "+yangtao.getAge());
    }
}
