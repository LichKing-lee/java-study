package com.yong.study.ch11;

/**
 * Created by ChangYong on 2016. 8. 20..
 */
public class Student2 implements Comparable<Student2> {
    String name;
    int ban;
    int no;
    int kor, eng, math;

    int total;
    int schoolRank;
    Student2(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no =no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

        this.total = kor + eng + math;
    }

    int getTotal() {
        return this.total;
    }

    float getAverage() {
        return (int)((getTotal()/ 3f)*10+0.5)/10f;
    }

    public String toString() {
        return name +","+ban +","+no +","+kor+","+eng+","+math
                +","+getTotal() +","+getAverage()+","+schoolRank;
    }

    @Override
    public int compareTo(Student2 s) {
        return -(this.getTotal() - s.getTotal());
    }
}
