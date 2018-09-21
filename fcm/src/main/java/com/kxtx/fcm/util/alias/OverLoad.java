package com.kxtx.fcm.util.alias;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by liyx on 15-9-26.
 *
 * @author liyx
 * @date 15-9-26 下午3:46
 */
@Documented
@Target(ElementType.METHOD)//仅可用于方法头
@Retention(RetentionPolicy.CLASS)//载入编译器，但并不载入VM
public @interface OverLoad {
    String defaultMsg() default "该方法为重载方法，请注意参数";
}
