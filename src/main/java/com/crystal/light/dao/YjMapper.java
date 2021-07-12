package com.crystal.light.dao;

import com.crystal.light.entity.YjFsXgjl;
import com.crystal.light.entity.YjKsdtk;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface YjMapper {

    List<YjFsXgjl> findFsjl(YjFsXgjl entity);

    int checkXsSct(@Param("yjKsBh") String yjKsBh, @Param("xh") String xh);

    Integer updateSjzdf(@Param("ksxxbh") String ksxxbh, @Param("yjKsBh") String yjKsBh, @Param("kgtDf") BigDecimal kgtDf, @Param("zgtDf") BigDecimal zgtDf, @Param("zzdf") BigDecimal zzdf, @Param("userId") String userId);

    List<YjKsdtk> findKsdtk(@Param("minSjzdf") BigDecimal minSjzdf, @Param("maxSjzdf")BigDecimal maxSjzdf);
}
