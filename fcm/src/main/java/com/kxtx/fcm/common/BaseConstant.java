package com.kxtx.fcm.common;

import com.kxtx.fcm.util.alias.ConstantAnnotation;
import com.kxtx.fcm.util.alias.ConstantFieldAnnotaion;

/**
 * @Auther: jiankun.liu
 * @Date: 2018/9/21 14:23
 * @Description: 基础常量
 */
public class BaseConstant {

    @ConstantAnnotation(defaultMsg = "apiResult", aliasName = "接口执行结果", keyString = "API_RESULT")
    public static final class ApiResult {
        @ConstantFieldAnnotaion(defaultMsg = "执行状态成功")
        public static final Integer STATUS_SUCCESS = 0;
        @ConstantFieldAnnotaion(defaultMsg = "执行状态失败")
        public static final Integer STATUS_FAILURE = 1;
        @ConstantFieldAnnotaion(defaultMsg = "执行失败代码")
        public static final String FAILURE_CODE = "5104000";
        @ConstantFieldAnnotaion(defaultMsg = "执行sqk代码错误")
        public static final String FAILURE_SQL_CODE = "5104001";

        @ConstantFieldAnnotaion(defaultMsg = "执行失败信息")
        public static final String FAILURE_MSG = "处理失败";
        @ConstantFieldAnnotaion(defaultMsg = "执行成功代码")
        public static final String SUCCESS_CODE = "2000000";
        @ConstantFieldAnnotaion(defaultMsg = "执行成功信息")
        public static final String SUCCESS_MSG = "处理成功";
    }

}
