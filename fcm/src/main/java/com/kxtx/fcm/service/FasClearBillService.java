package com.kxtx.fcm.service;

import com.kxtx.fcm.entity.FasClearBill;

/**
 * @Auther: jiankun.liu
 * @Date: 2018/8/22 16:57
 * @Description:
 */
public interface FasClearBillService {
    /**
     * 根据结算单号查询清算单
     * @return
     */
    FasClearBill queryBySettlebillNo(String settleBillNo);
}
