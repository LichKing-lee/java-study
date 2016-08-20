package com.yong.test.generic;

import org.junit.Ignore;
import org.junit.Test;

import java.util.*;

/**
 * Created by ChangYong on 2016. 7. 24..
 */
public class GenericTest1 {
    @Test
    @Ignore
    public void 제네릭_테스트() {
        Abc<Abc1> abc = new Abc<>();
    }

    @Test
    public void 제네릭_메서드(){
        Abc1 abc = new Abc1();

        abc.setString("abc");
        int num = abc.<Integer>getString();
    }
}

class Abc<T extends Abc1>{
    private String title;
    private String recommend;

    public String getTitle(){
        return "hello";
    }
}

class Abc2 extends Abc1{

}

class Abc1{
    Object obj;

    public <T> void setString(T t){
        obj = t;
    }

    public <T> T getString(){
        return (T) obj;
    }
}