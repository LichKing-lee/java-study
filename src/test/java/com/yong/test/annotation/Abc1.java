package com.yong.test.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by ChangYong on 2016. 7. 24..
 */
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Abc1 {
    String value();
    int age() default 100;
}
