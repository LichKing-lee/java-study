package com.yong.test;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by ChangYong on 2016. 7. 28..
 */
public class custom {
    @Test
    public void error_test(){
        int[] numbers = new int[999999999];
    }

    @Test
    public void abc(){
        Vector<String> vector = new Vector<String>();

        List<String> list1 = new ArrayList<String>();
        List<String> list2 = Collections.synchronizedList(list1);
        List<String> list3 = new CopyOnWriteArrayList<String>();
    }
}
