package com.kxtx.fcm.vo;


import com.kxtx.fcm.common.BaseConstant;

/**
 * Created by shiwei.xie on 2017/7/12.
 */
public class Response<T>  {
    /**
     * 处理状态
     */
    private Integer status;
    /**
     *异常编码
     */
    private String errorCode;
    /**
     * 异常信息
     */
    private String errorMessage;

    /**
     * 返回数据
     */
    private T Data;


    public static Response successRep(){
        return new Response( BaseConstant.ApiResult.STATUS_SUCCESS, BaseConstant.ApiResult.SUCCESS_CODE, BaseConstant.ApiResult.SUCCESS_MSG);
    }


    public static Response failureRep(){
        return new Response( BaseConstant.ApiResult.STATUS_FAILURE, BaseConstant.ApiResult.FAILURE_CODE, BaseConstant.ApiResult.FAILURE_MSG);
    }

    public static Response failureRep(String failureMsg){
        return new Response( BaseConstant.ApiResult.STATUS_FAILURE, BaseConstant.ApiResult.FAILURE_CODE,failureMsg);
    }
    public static Response failureRep(String failureCode,String failureMsg){
        return new Response( BaseConstant.ApiResult.STATUS_FAILURE,failureCode, failureMsg);
    }

    public Response(Integer status, String errorCode, String errorMessage) {
        this.status = status;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public Response() {
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public T getData() {
        return Data;
    }

    public void setData(T data) {
        Data = data;
    }
}
