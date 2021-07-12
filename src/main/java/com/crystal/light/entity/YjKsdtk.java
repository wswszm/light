package com.crystal.light.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author  gtl
 * @date  2020/8/26  9:49
 * @version  1.0
 */

/**
 * 考生答题卡关系表
 */
public class YjKsdtk {
    /**
     * bh : 编号
     */
    private String bh;

    /**
     * edu_xx_bh : 学校编号
     */
    private String eduXxBh;

    /**
     * yj_ksxx_bh : 考生编号
     */
    private String yjKsxxBh;

    /**
     * yj_dtk_bh : 答题卡编号
     */
    private String yjDtkBh;

    /**
     * yj_ks_bh : 考试编号
     */
    private String yjKsBh;

    /**
     * yj_ks_sj_bh : 试卷编号
     */
    private String yjKsSjBh;

    /**
     * kszt : 考生状态 1 正常 2缺考 3作弊 4异常 5无法识别（问题）
     */
    private String kszt;

    /**
     * sjzdf : 试卷最终得分
     */
    private BigDecimal sjzdf;

    /**
     * cjr : 创建人
     */
    private String cjr;

    /**
     * cjsj : 创建时间
     */
    private Date cjsj;

    /**
     * gxr : 更新人
     */
    private String gxr;

    /**
     * gxsj : 更新时间
     */
    private Date gxsj;

    /**
     * scbj : 删除标记
     */
    private String scbj;

    /**
     * xxbj : 学校标记
     */
    private Integer xxbj;

    /**
     * xqbj : 学期标记
     */
    private Integer xqbj;

    /**
     * kgtdf : 客观题最终得分
     */
    private BigDecimal kgtdf;

    /**
     * kgtdf : 主观题最终得分
     */
    private BigDecimal zgtdf;

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
     * 获取edu_xx_bh : 学校编号
     *
     * @return edu_xx_bh - edu_xx_bh : 学校编号
     */
    public String getEduXxBh() {
        return eduXxBh;
    }

    /**
     * 设置edu_xx_bh : 学校编号
     *
     * @param eduXxBh edu_xx_bh : 学校编号
     */
    public void setEduXxBh(String eduXxBh) {
        this.eduXxBh = eduXxBh;
    }

    /**
     * 获取yj_ksxx_bh : 考生编号
     *
     * @return yj_ksxx_bh - yj_ksxx_bh : 考生编号
     */
    public String getYjKsxxBh() {
        return yjKsxxBh;
    }

    /**
     * 设置yj_ksxx_bh : 考生编号
     *
     * @param yjKsxxBh yj_ksxx_bh : 考生编号
     */
    public void setYjKsxxBh(String yjKsxxBh) {
        this.yjKsxxBh = yjKsxxBh;
    }

    /**
     * 获取yj_dtk_bh : 答题卡编号
     *
     * @return yj_dtk_bh - yj_dtk_bh : 答题卡编号
     */
    public String getYjDtkBh() {
        return yjDtkBh;
    }

    /**
     * 设置yj_dtk_bh : 答题卡编号
     *
     * @param yjDtkBh yj_dtk_bh : 答题卡编号
     */
    public void setYjDtkBh(String yjDtkBh) {
        this.yjDtkBh = yjDtkBh;
    }

    /**
     * 获取yj_ks_bh : 考试编号
     *
     * @return yj_ks_bh - yj_ks_bh : 考试编号
     */
    public String getYjKsBh() {
        return yjKsBh;
    }

    /**
     * 设置yj_ks_bh : 考试编号
     *
     * @param yjKsBh yj_ks_bh : 考试编号
     */
    public void setYjKsBh(String yjKsBh) {
        this.yjKsBh = yjKsBh;
    }

    /**
     * 获取yj_ks_sj_bh : 试卷编号
     *
     * @return yj_ks_sj_bh - yj_ks_sj_bh : 试卷编号
     */
    public String getYjKsSjBh() {
        return yjKsSjBh;
    }

    /**
     * 设置yj_ks_sj_bh : 试卷编号
     *
     * @param yjKsSjBh yj_ks_sj_bh : 试卷编号
     */
    public void setYjKsSjBh(String yjKsSjBh) {
        this.yjKsSjBh = yjKsSjBh;
    }

    /**
     * 获取kszt : 考生状态 1 正常 2缺考 3作弊 4异常 5无法识别（问题）
     *
     * @return kszt - kszt : 考生状态 1 正常 2缺考 3作弊 4异常 5无法识别（问题）
     */
    public String getKszt() {
        return kszt;
    }

    /**
     * 设置kszt : 考生状态 1 正常 2缺考 3作弊 4异常 5无法识别（问题）
     *
     * @param kszt kszt : 考生状态 1 正常 2缺考 3作弊 4异常 5无法识别（问题）
     */
    public void setKszt(String kszt) {
        this.kszt = kszt;
    }

    /**
     * 获取sjzdf : 试卷最终得分
     *
     * @return sjzdf - sjzdf : 试卷最终得分
     */
    public BigDecimal getSjzdf() {
        return sjzdf;
    }

    /**
     * 设置sjzdf : 试卷最终得分
     *
     * @param sjzdf sjzdf : 试卷最终得分
     */
    public void setSjzdf(BigDecimal sjzdf) {
        this.sjzdf = sjzdf;
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
     * 获取gxr : 更新人
     *
     * @return gxr - gxr : 更新人
     */
    public String getGxr() {
        return gxr;
    }

    /**
     * 设置gxr : 更新人
     *
     * @param gxr gxr : 更新人
     */
    public void setGxr(String gxr) {
        this.gxr = gxr;
    }

    /**
     * 获取gxsj : 更新时间
     *
     * @return gxsj - gxsj : 更新时间
     */
    public Date getGxsj() {
        return gxsj;
    }

    /**
     * 设置gxsj : 更新时间
     *
     * @param gxsj gxsj : 更新时间
     */
    public void setGxsj(Date gxsj) {
        this.gxsj = gxsj;
    }

    /**
     * 获取scbj : 删除标记
     *
     * @return scbj - scbj : 删除标记
     */
    public String getScbj() {
        return scbj;
    }

    /**
     * 设置scbj : 删除标记
     *
     * @param scbj scbj : 删除标记
     */
    public void setScbj(String scbj) {
        this.scbj = scbj;
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

    /**
     * 获取kgtdf : 客观题最终得分
     *
     * @return kgtdf - kgtdf : 客观题最终得分
     */
    public BigDecimal getKgtdf() {
        return kgtdf;
    }

    /**
     * 设置kgtdf : 客观题最终得分
     *
     * @param kgtdf kgtdf : 客观题最终得分
     */
    public void setKgtdf(BigDecimal kgtdf) {
        this.kgtdf = kgtdf;
    }

    /**
     * 获取kgtdf : 主观题最终得分
     *
     * @return zgtdf - kgtdf : 主观题最终得分
     */
    public BigDecimal getZgtdf() {
        return zgtdf;
    }

    /**
     * 设置kgtdf : 主观题最终得分
     *
     * @param zgtdf kgtdf : 主观题最终得分
     */
    public void setZgtdf(BigDecimal zgtdf) {
        this.zgtdf = zgtdf;
    }
}