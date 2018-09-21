package com.kxtx.fcm.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "fas_clear_bill")
public class FasClearBill {
    /**
     * 清算单ID
     */
    @Id
    private String id;

    /**
     * 结算单NO
     */
    @Column(name = "settle_bill_no")
    private String settleBillNo;

    /**
     * 清算批次号
     */
    @Column(name = "clear_batch_no")
    private String clearBatchNo;

    /**
     * 付款人id
     */
    @Column(name = "payer_id")
    private String payerId;

    /**
     * 收款人id
     */
    @Column(name = "payee_id")
    private String payeeId;

    /**
     * 结算金额
     */
    @Column(name = "clear_amount")
    private Integer clearAmount;

    /**
     * 清算时间
     */
    @Column(name = "clear_date")
    private Date clearDate;

    /**
     * 清算状态 1待清算 ; 2清算中 ; 3清算成功  ;4清算失败 ;5清算超时
     */
    @Column(name = "clear_status")
    private Byte clearStatus;

    /**
     * 支付完成时间
     */
    @Column(name = "ga_paid_time")
    private Date gaPaidTime;

    /**
     * 清算申请编号
     */
    @Column(name = "ga_apply_no")
    private String gaApplyNo;

    /**
     * 是否自动清算 0：否 1 ：是
     */
    @Column(name = "is_auto_balance")
    private Byte isAutoBalance;

    /**
     * 是否删除 0：否 1 ：是
     */
    @Column(name = "is_delete")
    private Byte isDelete;

    /**
     * 创建者ID
     */
    @Column(name = "creater_id")
    private String createrId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改者ID
     */
    @Column(name = "updater_id")
    private String updaterId;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 版本号
     */
    @Column(name = "record_version")
    private Integer recordVersion;

    /**
     * 日切时间
     */
    @Column(name = "book_date")
    private Date bookDate;

    /**
     * 获取清算单ID
     *
     * @return id - 清算单ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置清算单ID
     *
     * @param id 清算单ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取结算单NO
     *
     * @return settle_bill_no - 结算单NO
     */
    public String getSettleBillNo() {
        return settleBillNo;
    }

    /**
     * 设置结算单NO
     *
     * @param settleBillNo 结算单NO
     */
    public void setSettleBillNo(String settleBillNo) {
        this.settleBillNo = settleBillNo;
    }

    /**
     * 获取清算批次号
     *
     * @return clear_batch_no - 清算批次号
     */
    public String getClearBatchNo() {
        return clearBatchNo;
    }

    /**
     * 设置清算批次号
     *
     * @param clearBatchNo 清算批次号
     */
    public void setClearBatchNo(String clearBatchNo) {
        this.clearBatchNo = clearBatchNo;
    }

    /**
     * 获取付款人id
     *
     * @return payer_id - 付款人id
     */
    public String getPayerId() {
        return payerId;
    }

    /**
     * 设置付款人id
     *
     * @param payerId 付款人id
     */
    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }

    /**
     * 获取收款人id
     *
     * @return payee_id - 收款人id
     */
    public String getPayeeId() {
        return payeeId;
    }

    /**
     * 设置收款人id
     *
     * @param payeeId 收款人id
     */
    public void setPayeeId(String payeeId) {
        this.payeeId = payeeId;
    }

    /**
     * 获取结算金额
     *
     * @return clear_amount - 结算金额
     */
    public Integer getClearAmount() {
        return clearAmount;
    }

    /**
     * 设置结算金额
     *
     * @param clearAmount 结算金额
     */
    public void setClearAmount(Integer clearAmount) {
        this.clearAmount = clearAmount;
    }

    /**
     * 获取清算时间
     *
     * @return clear_date - 清算时间
     */
    public Date getClearDate() {
        return clearDate;
    }

    /**
     * 设置清算时间
     *
     * @param clearDate 清算时间
     */
    public void setClearDate(Date clearDate) {
        this.clearDate = clearDate;
    }

    /**
     * 获取清算状态 1待清算 ; 2清算中 ; 3清算成功  ;4清算失败 ;5清算超时
     *
     * @return clear_status - 清算状态 1待清算 ; 2清算中 ; 3清算成功  ;4清算失败 ;5清算超时
     */
    public Byte getClearStatus() {
        return clearStatus;
    }

    /**
     * 设置清算状态 1待清算 ; 2清算中 ; 3清算成功  ;4清算失败 ;5清算超时
     *
     * @param clearStatus 清算状态 1待清算 ; 2清算中 ; 3清算成功  ;4清算失败 ;5清算超时
     */
    public void setClearStatus(Byte clearStatus) {
        this.clearStatus = clearStatus;
    }

    /**
     * 获取支付完成时间
     *
     * @return ga_paid_time - 支付完成时间
     */
    public Date getGaPaidTime() {
        return gaPaidTime;
    }

    /**
     * 设置支付完成时间
     *
     * @param gaPaidTime 支付完成时间
     */
    public void setGaPaidTime(Date gaPaidTime) {
        this.gaPaidTime = gaPaidTime;
    }

    /**
     * 获取清算申请编号
     *
     * @return ga_apply_no - 清算申请编号
     */
    public String getGaApplyNo() {
        return gaApplyNo;
    }

    /**
     * 设置清算申请编号
     *
     * @param gaApplyNo 清算申请编号
     */
    public void setGaApplyNo(String gaApplyNo) {
        this.gaApplyNo = gaApplyNo;
    }

    /**
     * 获取是否自动清算 0：否 1 ：是
     *
     * @return is_auto_balance - 是否自动清算 0：否 1 ：是
     */
    public Byte getIsAutoBalance() {
        return isAutoBalance;
    }

    /**
     * 设置是否自动清算 0：否 1 ：是
     *
     * @param isAutoBalance 是否自动清算 0：否 1 ：是
     */
    public void setIsAutoBalance(Byte isAutoBalance) {
        this.isAutoBalance = isAutoBalance;
    }

    /**
     * 获取是否删除 0：否 1 ：是
     *
     * @return is_delete - 是否删除 0：否 1 ：是
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除 0：否 1 ：是
     *
     * @param isDelete 是否删除 0：否 1 ：是
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取创建者ID
     *
     * @return creater_id - 创建者ID
     */
    public String getCreaterId() {
        return createrId;
    }

    /**
     * 设置创建者ID
     *
     * @param createrId 创建者ID
     */
    public void setCreaterId(String createrId) {
        this.createrId = createrId;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改者ID
     *
     * @return updater_id - 修改者ID
     */
    public String getUpdaterId() {
        return updaterId;
    }

    /**
     * 设置修改者ID
     *
     * @param updaterId 修改者ID
     */
    public void setUpdaterId(String updaterId) {
        this.updaterId = updaterId;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取版本号
     *
     * @return record_version - 版本号
     */
    public Integer getRecordVersion() {
        return recordVersion;
    }

    /**
     * 设置版本号
     *
     * @param recordVersion 版本号
     */
    public void setRecordVersion(Integer recordVersion) {
        this.recordVersion = recordVersion;
    }

    /**
     * 获取日切时间
     *
     * @return book_date - 日切时间
     */
    public Date getBookDate() {
        return bookDate;
    }

    /**
     * 设置日切时间
     *
     * @param bookDate 日切时间
     */
    public void setBookDate(Date bookDate) {
        this.bookDate = bookDate;
    }
}