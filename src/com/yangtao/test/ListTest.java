package com.yangtao.test;

import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList();
        arrayList.add("zhangsan");
        arrayList.add("lisi");
        arrayList.add("wangwu");
        for (String str: arrayList){
            System.out.println(str);
        }
    }
}
