package com.kxtx.fcm.util.alias;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by liyx on 15-9-1.
 * 自定义注解，用于解释常量的时候用。
 * @author liyx
 * @date 15-9-1 上午11:15
 */
@Documented
@Target({ElementType.TYPE,ElementType.FIELD})//注解可用于类、接口、以及常量
@Retention(RetentionPolicy.RUNTIME)//注解加载到类中，但是并没有到VM中
public @interface ConstantAnnotation {
    String defaultMsg() default "";//默认信息
    String aliasName() default "";
    String keyString() default "";
}
