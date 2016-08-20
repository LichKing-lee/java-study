package com.yong.study.ch11;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by ChangYong on 2016. 8. 20..
 */
public class Exercise11_6 {
    static int getGroupCount(TreeSet tset, int from, int to) {
        return tset.subSet(new Student("", 1, 1, from, from, from), new Student("", 1, 1, to, to, to)).size();
    }

    public static void main(String[] args) {
        TreeSet set = new TreeSet(new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                if(o1.getAverage() > o2.getAverage()){
                    return 1;
                }

                if(o1.getAverage() < o2.getAverage()){
                    return -1;
                }

                return 0;
            }
        });

        Student s1 = new Student("홍길동",1,1,100,100,100);
        Student s2 = new Student("남궁성",1,2,90,70,80);
        Student s3 = new Student("김자바",1,3,80,80,90);
        Student s4 = new Student("이자바",1,4,70,90,70);
        Student s5 = new Student("안자바",1,5,60,100,80);

        System.out.println(s1.getAverage() > s2.getAverage());

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);

        Iterator it = set.iterator();

        while(it.hasNext()) System.out.println(it.next());

        System.out.println("[60~69] :"+getGroupCount(set,60,70));
        System.out.println("[70~79] :"+getGroupCount(set,70,80));
        System.out.println("[80~89] :"+getGroupCount(set,80,90));
        System.out.println("[90~100] :"+getGroupCount(set,90,101));
    }
}