/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 */
package com.icinfo.ndrc.credit.model;

import com.icinfo.framework.mybatis.mapper.annotation.Before;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 描述:    temp_supervise_inspect_deception_info 对应的实体类.<br>
 * WARNING：不是表中字段的属性必须加@Transient注解
 * @author framework generator
 * @date 2017年06月30日
 */
@Table(name = "temp_supervise_inspect_deception_info")
public class TempSuperviseInspectDeceptionInfo implements Serializable {
    @Id
    @Column(name = "id")
    private Integer id;

    /**
     * uid
     */
    @Before
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator="select replace(uuid(), '-', '')")
    @Column(name = "uid")
    private String uid;

    /**
     * 单位（组织）名称
     */
    @Column(name = "UnitName")
    private String unitName;

    /**
     * 社会信用代码/组织机构代码/工商注册号
     */
    @Column(name = "Uniscid")
    private String uniscid;

    /**
     * 查处时间
     */
    @Column(name = "DealTime")
    private Date dealTime;

    /**
     * 查处情况
     */
    @Column(name = "DealSituation")
    private String dealSituation;

    /**
     * 导入部门
     */
    @Column(name = "ImportDept")
    private String importDept;

    /**
     * 导入日期
     */
    @Column(name = "ImportTime")
    private Date importTime;

    /**
     * 批次号
     */
    @Column(name = "BatchNO")
    private String batchNO;

    /**
     * 0:未删除，1:已删除
     */
    @Column(name = "IsUse")
    private String isUse;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取uid
     *
     * @return uid - uid
     */
    public String getUid() {
        return uid;
    }

    /**
     * 设置uid
     *
     * @param uid uid
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * 获取单位（组织）名称
     *
     * @return UnitName - 单位（组织）名称
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * 设置单位（组织）名称
     *
     * @param unitName 单位（组织）名称
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    /**
     * 获取社会信用代码/组织机构代码/工商注册号
     *
     * @return Uniscid - 社会信用代码/组织机构代码/工商注册号
     */
    public String getUniscid() {
        return uniscid;
    }

    /**
     * 设置社会信用代码/组织机构代码/工商注册号
     *
     * @param uniscid 社会信用代码/组织机构代码/工商注册号
     */
    public void setUniscid(String uniscid) {
        this.uniscid = uniscid;
    }

    /**
     * 获取查处时间
     *
     * @return DealTime - 查处时间
     */
    public Date getDealTime() {
        return dealTime;
    }

    /**
     * 设置查处时间
     *
     * @param dealTime 查处时间
     */
    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    /**
     * 获取查处情况
     *
     * @return DealSituation - 查处情况
     */
    public String getDealSituation() {
        return dealSituation;
    }

    /**
     * 设置查处情况
     *
     * @param dealSituation 查处情况
     */
    public void setDealSituation(String dealSituation) {
        this.dealSituation = dealSituation;
    }

    /**
     * 获取导入部门
     *
     * @return ImportDept - 导入部门
     */
    public String getImportDept() {
        return importDept;
    }

    /**
     * 设置导入部门
     *
     * @param importDept 导入部门
     */
    public void setImportDept(String importDept) {
        this.importDept = importDept;
    }

    /**
     * 获取导入日期
     *
     * @return ImportTime - 导入日期
     */
    public Date getImportTime() {
        return importTime;
    }

    /**
     * 设置导入日期
     *
     * @param importTime 导入日期
     */
    public void setImportTime(Date importTime) {
        this.importTime = importTime;
    }

    /**
     * 获取批次号
     *
     * @return BatchNO - 批次号
     */
    public String getBatchNO() {
        return batchNO;
    }

    /**
     * 设置批次号
     *
     * @param batchNO 批次号
     */
    public void setBatchNO(String batchNO) {
        this.batchNO = batchNO;
    }

    /**
     * 获取0:未删除，1:已删除
     *
     * @return IsUse - 0:未删除，1:已删除
     */
    public String getIsUse() {
        return isUse;
    }

    /**
     * 设置0:未删除，1:已删除
     *
     * @param isUse 0:未删除，1:已删除
     */
    public void setIsUse(String isUse) {
        this.isUse = isUse;
    }
}