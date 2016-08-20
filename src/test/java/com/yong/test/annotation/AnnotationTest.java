package com.yong.test.annotation;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.util.Date;

/**
 * Created by ChangYong on 2016. 7. 24..
 */
public class AnnotationTest {
    @Test
    public void 애노테이션_테스트() throws Exception{
        Annotation[] annotation = BBB.class.getAnnotations();
        Annotation[] an = BBB.class.getMethod("get").getAnnotations();

        System.out.println(an.length);

        Date date = new Date(1, 2, 3);
    }
}