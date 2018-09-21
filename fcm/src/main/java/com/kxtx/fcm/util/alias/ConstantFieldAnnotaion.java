package com.kxtx.fcm.util.alias;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by liyx on 15-9-1.
 * 自定义注解，用于解释常量的时候用，仅可用于常量
 * @author liyx
 * @date 15-9-1 上午11:22
 */
@Documented
@Target(ElementType.FIELD)//仅可用于常量
@Retention(RetentionPolicy.RUNTIME)//载入编译器，但并不载入VM
public @interface ConstantFieldAnnotaion {
    String defaultMsg() default "";
}
