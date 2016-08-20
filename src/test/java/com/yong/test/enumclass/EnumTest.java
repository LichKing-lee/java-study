package com.yong.test.enumclass;

import org.junit.Test;

/**
 * Created by ChangYong on 2016. 7. 24..
 */
public class EnumTest {
    @Test
    public void 이넘_테스트(){
        String code = "";

        System.out.println(ExposureCode.getName(code));


    }

    enum ExposureCode{
        ABSOLUTE("절대우위"), A("A"), ASD("B");

        private ExposureCode(String name){
            this.name = name;
        }

        private String name;

        public static String getName(String code){
            ExposureCode[] codes = ExposureCode.values();
            for(ExposureCode code1 : codes)
                if(code1.name().equals(code))
                    return code1.name;



            return "";
        }
    }

}
