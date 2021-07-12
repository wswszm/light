package com.crystal.light.mongo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 分数记录
 *
 * @author crystal
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@Document(collection = YjFsjl.COLLECTION_NAME)
public class YjFsjl {

    public static final String COLLECTION_NAME = "yj_fsjl";

    /**
     * 分数记录唯一标识规则：任务编号+小题信息编号
     */
    @Id
    private String bh;

    private String yjTaskBh;

    private String yjKsBh;

    private String yjzBh;

    private String eduBjBh;

    private String yjKsxxBh;

    private String xsXh;

    private String xsXm;

    private String yjXtxxBh;

    private Integer tmlxBh;

    private String eduYhBh;

    private String yjYjryBh;

    private String yjryXm;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date dfsj;

    private String dfsjStr;

    private String dflx;

    private BigDecimal fs;

    private String wtjyy;

    private long count;
}
