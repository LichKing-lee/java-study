package com.yong.study.ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Created by ChangYong on 2016. 8. 20..
 */
public class Exercise11_7 {
    public static void main(String[] arg){
        ArrayList list = new ArrayList();
        list.add(new Student1("이자바",2,1,70,90,70));
        list.add(new Student1("안자바",2,2,60,100,80));
        list.add(new Student1("홍길동",1,3,100,100,100));
        list.add(new Student1("남궁성",1,1,90,70,80));
        list.add(new Student1("김자바",1,2,80,80,90));

        Collections.sort(list, new BanNoAscending());
        Iterator it = list.iterator();
        while(it.hasNext()) System.out.println(it.next());
    }
}

class BanNoAscending implements Comparator<Student1> {
    @Override
    public int compare(Student1 o1, Student1 o2) {
        if(o1.ban == o2.ban){
            return o1.no - o2.no;
        }

        return o1.ban - o2.ban;
    }
}