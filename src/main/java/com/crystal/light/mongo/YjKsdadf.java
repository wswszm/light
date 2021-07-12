package com.crystal.light.mongo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

/**
 * 阅卷考生答案得分
 *
 * @author crystal
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@Document(collection = YjKsdadf.COLLECTION_NAME)
public class YjKsdadf {

    public static final String COLLECTION_NAME = "yj_ks_dadf";

    @Id
    private String bh;

    private String yjKsBh;

    private String eduBjBh;

    private String xsxh;

    private String yjSjBh;

    private String yjDtkBh;

    private String yjXtxxBh;

    private Integer tmlxBh;

    private String yjKsxxBh;

    private String kgtda;

    private String xzda;

    private String tmlx;

    private BigDecimal zfs;

    private BigDecimal zzdf;
}
