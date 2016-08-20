package com.yong.study.ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ChangYong on 2016. 8. 20..
 */
public class Exercise11_8 {
    public static void calculateSchoolRank(List list) {
        Collections.sort(list); // 먼저 list를 총점기준 내림차순으로 정렬한다.
        int prevRank = -1; // 이전 전교등수
        int prevTotal = -1; // 이전 총점
        int length = list.size();

        int i = 0;
        for(Iterator iter = list.iterator(); iter.hasNext();){
            Student2 stu = (Student2) iter.next();

            if(stu.getTotal() == prevTotal){
                stu.schoolRank = prevRank;
            }else if(stu.getTotal() > prevTotal){
                stu.schoolRank = 1;
            }else {
                stu.schoolRank = i + 1;
            }

            prevRank = stu.schoolRank;
            prevTotal = stu.getTotal();
            i++;
        }

        Collections.sort(list, (Object obj1, Object obj2) -> {
            Student2 stu1 = (Student2) obj1;
            Student2 stu2 = (Student2) obj2;

            return (stu1.schoolRank - stu2.schoolRank);
        });
/*
(2) 아래의 로직에 맞게 코드를 작성하시오.
1. 반복문을 이용해서 list에 저장된 Student객체를 하나씩 읽는다.
*/
    }

    public static void main(String[] arg){
        ArrayList list = new ArrayList();
        list.add(new Student2("이자바",2,1,70,90,70));
        list.add(new Student2("안자바",2,2,60,100,80));
        list.add(new Student2("홍길동",1,3,100,100,100));
        list.add(new Student2("남궁성",1,1,90,70,80));
        list.add(new Student2("김자바",1,2,80,80,90));

        calculateSchoolRank(list);
        Iterator it = list.iterator();
        while(it.hasNext()) System.out.println(it.next());
    }
}
