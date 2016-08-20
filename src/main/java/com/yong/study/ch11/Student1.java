package com.yong.study.ch11;

/**
 * Created by ChangYong on 2016. 8. 20..
 */
public class Student1 {
    String name;
    int ban;
    int no;
    int kor, eng, math;
    Student1(String name, int ban, int no, int kor, int eng, int math) {
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
}
