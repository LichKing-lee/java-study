package com.yong.study.ch11;

/**
 * Created by ChangYong on 2016. 8. 20..
 */
public class Student implements Comparable<Student> {
    String name;
    int ban;
    int no;
    int kor, eng, math;
    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no =no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor+eng+math;
    }

    float getAverage() {
        return (int)((getTotal()/ 3f)*10+0.5)/10f;
    }

    public String toString() {
        return name +","+ban +","+no +","+kor+","+eng+","+math
                +","+getTotal() +","+getAverage();
    }

    @Override
    public int compareTo(Student s) {
        return this.name.compareTo(s.name);
    }
}
