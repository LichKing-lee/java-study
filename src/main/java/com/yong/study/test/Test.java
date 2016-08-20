package com.yong.study.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ChangYong on 2016. 7. 24..
 */
public class Test {
    public static void main(String[] arg){
        Object[] arr = new String[10];
        arr[0] = 1;
        arr[1] = new Date();
    }

    public static List<?> method01(List<? extends String> stringList){
        return new ArrayList<>();
    }
}
