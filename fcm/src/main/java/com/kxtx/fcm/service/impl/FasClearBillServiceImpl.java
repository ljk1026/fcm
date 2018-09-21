package com.kxtx.fcm.service.impl;

import com.kxtx.fcm.dao.FasClearBillMapper;
import com.kxtx.fcm.entity.FasClearBill;
import com.kxtx.fcm.service.FasClearBillService;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.io.IOException;
import java.util.List;

/**
 * @Auther: jiankun.liu
 * @Date: 2018/8/22 16:57
 * @Description:
 */
@Service("fasClearBillService")
public class FasClearBillServiceImpl implements FasClearBillService {

    @Autowired
    private FasClearBillMapper fasClearBillMapper;

    @Override
    public FasClearBill queryBySettlebillNo(String settleBillNo) {



        Example example = new Example(FasClearBill.class);
        example.createCriteria().andEqualTo("settleBillNo",settleBillNo)
                .andEqualTo("isDelete",0);

       List<FasClearBill> list = fasClearBillMapper.selectByExample(example);
       if(null != list && list.size()>0){
           return list.get(0);
       }
      return null;
    }
}
