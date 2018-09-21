package com.kxtx.fcm.controller;

import com.kxtx.fcm.entity.FasClearBill;
import com.kxtx.fcm.exception.BusinessRuntimeException;
import com.kxtx.fcm.service.FasClearBillService;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * @Auther: jiankun.liu
 * @Date: 2018/8/22 17:06
 * @Description:
 */
@RestController
@RequestMapping("/clearBill")
public class FasClearBillController {

    @Autowired
    private FasClearBillService fasClearBillService;

   @RequestMapping(value = "/{settleBillNo}",method = RequestMethod.GET)
    public FasClearBill query(@PathVariable String settleBillNo){
       if("io".equals(settleBillNo)){
           try {
               throw new IOException(" IO异常测试");
           } catch (IOException e) {
               e.printStackTrace();
           }
       }else if("rt".equals(settleBillNo)){
           throw new RuntimeException("运行时异常");
       }else if("me".equals(settleBillNo)){
           throw new MyBatisSystemException(new Throwable("mybatis"));
       }

       return fasClearBillService.queryBySettlebillNo(settleBillNo);
    }


}
