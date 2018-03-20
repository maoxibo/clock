package com.mao.controller;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by x on 2018/3/9.
 * 自定义注解
 */
@Target(value={ElementType.METHOD,ElementType.TYPE})
@Retention(value= RetentionPolicy.RUNTIME)
public @interface Annotation {

    public String name() default "";
}
