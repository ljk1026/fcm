package com.kxtx.fcm.util.alias;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by liyx on 15-9-24.
 * 用于变量的Annotaion
 * @author liyx
 * @date 15-9-24 下午6:36
 */
@Documented
@Target(ElementType.FIELD)//仅可用于变量
@Retention(RetentionPolicy.CLASS)//载入编译器，但并不载入VM
public @interface ParameterAnnotation {
    String defaultMsg() default "";
}
