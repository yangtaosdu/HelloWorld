package com.yangtao.test;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.yangtao.test.entry.Person;

import java.util.Map;

public class GsonTest {
    public static void main(String[] args) {
        Person person=new Person("zhangsan",18,"sansan");
        Gson gson=new Gson();

        String json=gson.toJson(person);
        System.out.println(json);
        Person person1=gson.fromJson(json,Person.class);
        System.out.println("age: "+person1.getAge()+"   Name: "+person1.getName());
        Map<String, Object> retMap = gson.fromJson(json,
                new TypeToken<Map<String, Object>>() {
                }.getType());
        for (Map.Entry<String,Object> entry:retMap.entrySet()){
            System.out.println(entry.getKey()+":  "+entry.getValue());
        }

    }
}
