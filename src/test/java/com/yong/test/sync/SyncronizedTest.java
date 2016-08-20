package com.yong.test.sync;


import org.junit.Test;

/**
 * Created by ChangYong on 2016. 7. 31..
 */
public class SyncronizedTest {
    @Test
    public void 동기화_테스트(){
        Abc abc = new Abc();

        Thread th1 = new Thread(() -> abc.getString());
        Thread th2 = new Thread(() -> abc.getString());

        th1.start();
        th2.start();

        Thread th3 = new Thread(() -> {
            Abc abc1 = new Abc();
            abc1.getString();
        });
        Thread th4 = new Thread(() -> {
            Abc abc2 = new Abc();
            abc2.getString();
        });
    }

    class Abc{
        public String getString(){
            synchronized (Abc.class){
                if(true){

                }
            }

            return "hello world";
        }
    }
}
