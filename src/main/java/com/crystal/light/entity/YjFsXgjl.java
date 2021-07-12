package com.crystal.light.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author  gtl
 * @date  2020/7/27  14:43
 * @version  1.0
 */

/**
    * 小工具分数修改记录
    */
public class YjFsXgjl {
    /**
     * bh : 编号
     */
    private String bh;

    /**
     * yj_xtxx_bh : 小题信息编号
     */
    private String yjXtxxBh;

    /**
     * yj_ksxx_bh : 考生信息编号
     */
    private String yjKsxxBh;

    /**
     * tmlxbh : 题目类型编号
     */
    private String tmlxbh;

    /**
     * ysfs : 原始分数
     */
    private BigDecimal ysfs;

    /**
     * xgfs : 修改分数
     */
    private BigDecimal xgfs;

    /**
     * xgcs : 修改次数
     */
    private Integer xgcs;

    /**
     * cjr : 创建人
     */
    private String cjr;

    /**
     * cjsj : 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date cjsj;

    /**
     * xxbj : 学校标记
     */
    private Integer xxbj;

    /**
     * xqbj : 学期标记
     */
    private Integer xqbj;

    /**
     * 获取bh : 编号
     *
     * @return bh - bh : 编号
     */
    public String getBh() {
        return bh;
    }

    /**
     * 设置bh : 编号
     *
     * @param bh bh : 编号
     */
    public void setBh(String bh) {
        this.bh = bh;
    }

    /**
     * 获取yj_xtxx_bh : 小题信息编号
     *
     * @return yj_xtxx_bh - yj_xtxx_bh : 小题信息编号
     */
    public String getYjXtxxBh() {
        return yjXtxxBh;
    }

    /**
     * 设置yj_xtxx_bh : 小题信息编号
     *
     * @param yjXtxxBh yj_xtxx_bh : 小题信息编号
     */
    public void setYjXtxxBh(String yjXtxxBh) {
        this.yjXtxxBh = yjXtxxBh;
    }

    /**
     * 获取yj_ksxx_bh : 考生信息编号
     *
     * @return yj_ksxx_bh - yj_ksxx_bh : 考生信息编号
     */
    public String getYjKsxxBh() {
        return yjKsxxBh;
    }

    /**
     * 设置yj_ksxx_bh : 考生信息编号
     *
     * @param yjKsxxBh yj_ksxx_bh : 考生信息编号
     */
    public void setYjKsxxBh(String yjKsxxBh) {
        this.yjKsxxBh = yjKsxxBh;
    }

    /**
     * 获取tmlxbh : 题目类型编号
     *
     * @return tmlxbh - tmlxbh : 题目类型编号
     */
    public String getTmlxbh() {
        return tmlxbh;
    }

    /**
     * 设置tmlxbh : 题目类型编号
     *
     * @param tmlxbh tmlxbh : 题目类型编号
     */
    public void setTmlxbh(String tmlxbh) {
        this.tmlxbh = tmlxbh;
    }

    /**
     * 获取ysfs : 原始分数
     *
     * @return ysfs - ysfs : 原始分数
     */
    public BigDecimal getYsfs() {
        return ysfs;
    }

    /**
     * 设置ysfs : 原始分数
     *
     * @param ysfs ysfs : 原始分数
     */
    public void setYsfs(BigDecimal ysfs) {
        this.ysfs = ysfs;
    }

    /**
     * 获取xgfs : 修改分数
     *
     * @return xgfs - xgfs : 修改分数
     */
    public BigDecimal getXgfs() {
        return xgfs;
    }

    /**
     * 设置xgfs : 修改分数
     *
     * @param xgfs xgfs : 修改分数
     */
    public void setXgfs(BigDecimal xgfs) {
        this.xgfs = xgfs;
    }

    /**
     * 获取xgcs : 修改次数
     *
     * @return xgcs - xgcs : 修改次数
     */
    public Integer getXgcs() {
        return xgcs;
    }

    /**
     * 设置xgcs : 修改次数
     *
     * @param xgcs xgcs : 修改次数
     */
    public void setXgcs(Integer xgcs) {
        this.xgcs = xgcs;
    }

    /**
     * 获取cjr : 创建人
     *
     * @return cjr - cjr : 创建人
     */
    public String getCjr() {
        return cjr;
    }

    /**
     * 设置cjr : 创建人
     *
     * @param cjr cjr : 创建人
     */
    public void setCjr(String cjr) {
        this.cjr = cjr;
    }

    /**
     * 获取cjsj : 创建时间
     *
     * @return cjsj - cjsj : 创建时间
     */
    public Date getCjsj() {
        return cjsj;
    }

    /**
     * 设置cjsj : 创建时间
     *
     * @param cjsj cjsj : 创建时间
     */
    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }

    /**
     * 获取xxbj : 学校标记
     *
     * @return xxbj - xxbj : 学校标记
     */
    public Integer getXxbj() {
        return xxbj;
    }

    /**
     * 设置xxbj : 学校标记
     *
     * @param xxbj xxbj : 学校标记
     */
    public void setXxbj(Integer xxbj) {
        this.xxbj = xxbj;
    }

    /**
     * 获取xqbj : 学期标记
     *
     * @return xqbj - xqbj : 学期标记
     */
    public Integer getXqbj() {
        return xqbj;
    }

    /**
     * 设置xqbj : 学期标记
     *
     * @param xqbj xqbj : 学期标记
     */
    public void setXqbj(Integer xqbj) {
        this.xqbj = xqbj;
    }
}