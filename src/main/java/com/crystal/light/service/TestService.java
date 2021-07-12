package com.crystal.light.service;

import com.alibaba.fastjson.JSONObject;
import com.crystal.light.dao.SysUserMapper;
import com.crystal.light.dao.YjMapper;
import com.crystal.light.entity.SysUser;
import com.crystal.light.entity.YjFsXgjl;
import com.crystal.light.entity.YjKsdtk;
import com.crystal.light.mongo.YjFsjl;
import com.crystal.light.mongo.YjKsdadf;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author crystalzhao
 * @version V1.0
 * @date 2019/2/19
 */
@Service
public class TestService {

    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private YjMapper yjMapper;

    @Autowired
    private SysUserMapper sysUserMapper;
    public void save(SysUser sysUser){
        sysUserMapper.insertSelective(sysUser);
    }

    public void testFen() {
        Query query = new Query();
        //拿复评
        query.addCriteria(new Criteria().and("dflx").is("11"));
        List<YjFsjl> yjFsjls = mongoTemplate.find(query, YjFsjl.class);
        yjFsjls.forEach(fsjl ->{
            Query dadfQuery = new Query();
            dadfQuery.addCriteria(new Criteria().and("yjKsxxBh").is(fsjl.getYjKsxxBh()).and("yjXtxxBh").is(fsjl.getYjXtxxBh()));
            YjKsdadf dadf = mongoTemplate.findOne(dadfQuery, YjKsdadf.class);
            System.out.println("学号：" + dadf.getXsxh());
            System.out.println("答案得分："+dadf.getZzdf());
            System.out.println("复评分："+fsjl.getFs());
            if(dadf.getZzdf().compareTo(fsjl.getFs()) != 0){
                BigDecimal zzdf = new BigDecimal(0);
                YjFsXgjl xgjlParam = new YjFsXgjl();
                xgjlParam.setYjKsxxBh(fsjl.getYjKsxxBh());
                xgjlParam.setYjXtxxBh(fsjl.getYjXtxxBh());
                List<YjFsXgjl> xgjlList = yjMapper.findFsjl(xgjlParam);
                //存在修改记录
                if(xgjlList.size() > 0){
                    YjFsXgjl xgjl = xgjlList.get(0);
                    if(dadf.getZzdf().compareTo(xgjl.getXgfs()) == 0){
                        //修改记录和其分数相同
                        return;
                    }else{
                        //改分为修改记录分数
                        zzdf = xgjl.getXgfs();
                    }
                }else{
                    //改分为仲裁分数
                    zzdf = fsjl.getFs();
                }
                //更新最终得分
                Query updateQuery = new Query();
                updateQuery.addCriteria(new Criteria().and("yjKsxxBh").is(fsjl.getYjKsxxBh()).and("yjXtxxBh").is(fsjl.getYjXtxxBh()));
                Update update = new Update().set("zzdf",zzdf);
                mongoTemplate.updateFirst(updateQuery,update,YjKsdadf.class);
            }
        });
    }

    public void gaifen(String yjKsBh) {
        Query query = new Query();
        String[] notin = {"singleChoice","object","multipleChoice"};
        query.addCriteria(new Criteria().and("yjKsBh").is(yjKsBh).and("tmlx").nin(notin));
        List<YjKsdadf> dadfs = mongoTemplate.find(query, YjKsdadf.class);
        int i = dadfs.size();
        for (YjKsdadf dadf : dadfs) {
            System.out.println("ksxxBh:" + dadf.getYjKsxxBh());
            System.out.println("xtxxBh:" + dadf.getYjXtxxBh());
            Query fsjlQuery = new Query();
            fsjlQuery.addCriteria(new Criteria().and("yjKsxxBh").is(dadf.getYjKsxxBh()).and("yjXtxxBh").is(dadf.getYjXtxxBh()));
            List<YjFsjl> fsjls = mongoTemplate.find(fsjlQuery, YjFsjl.class);
            Boolean haveFp = false;
            BigDecimal maxFz = new BigDecimal(0);
            for (YjFsjl fsjl : fsjls) {
                if(StringUtils.equals(fsjl.getDflx(), "11")){
                    haveFp = true;
                    break;
                }
                System.out.println("fs:" + fsjl.getFs());
                maxFz = maxFz.compareTo(fsjl.getFs()) == -1 ? fsjl.getFs() : maxFz;
            }
            if(haveFp){
                continue;
            }else{
                System.out.println("maxFz:" + maxFz);
                if(dadf.getZzdf() == null || maxFz.compareTo(dadf.getZzdf()) != 0){
                    Query updateQuery = new Query();
                    updateQuery.addCriteria(new Criteria().and("yjKsxxBh").is(dadf.getYjKsxxBh()).and("yjXtxxBh").is(dadf.getYjXtxxBh()));
                    Update update = new Update().set("zzdf",maxFz);
                    mongoTemplate.updateFirst(updateQuery,update,YjKsdadf.class);
                }
            }
            System.out.println("人员题目数：" + i--);
        }
        /*List<YjKsdtk> ksdtks = yjMapper.findKsdtk(new BigDecimal("57"), new BigDecimal("60"));
        String[] notin = {"singleChoice","object","multipleChoice"};
        for (YjKsdtk yjKsdtk : ksdtks) {
            BigDecimal jgfc = new BigDecimal(60).subtract(yjKsdtk.getSjzdf());
            Query query = new Query();
            query.addCriteria(new Criteria().and("yjKsxxBh").is(yjKsdtk.getYjKsxxBh()).and("tmlx").nin(notin));
            List<YjKsdadf> dadfs = mongoTemplate.find(query, YjKsdadf.class);
            for (YjKsdadf dadf : dadfs) {
                if(dadf.getZzdf().compareTo(dadf.getZfs()) == -1){
                    BigDecimal fc = dadf.getZfs().subtract(dadf.getZzdf());
                    if(jgfc.compareTo(fc) == 0){
                        //及格分差等于小题分差
                        break;
                    }else if(jgfc.compareTo(fc) == -1){
                        //及格分差小于小题分差
                    }
                }
            }
        }*/

    }

    /*public void totalScore(String xh, String ksxxbh, String yjKsBh, String xxbj, String xqbj, String userId) {
        // 1.检查这场考试这个学生task是否全部打完
        int check = yjMapper.checkXsSct(yjKsBh, xh);
        if (check > 0) {
            // 如果还存在没打分完成的则返回
            return;
        }
        // 2.查询mongo计算学生总分
        Query query = new Query(Criteria.where("yjKsBh").is(yjKsBh).and("xsxh").is(xh));
        query.fields().include("tmlxBh").include("zzdf");
        List<YjKsdadf> yjKsdadfs = mongoTemplate.find(query, YjKsdadf.class);
        BigDecimal zzdf = yjKsdadfs.stream().map(YjKsdadf::getZzdf).reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal kgtDf = yjKsdadfs.stream().filter(yjKsdadf -> StringUtils.equalsAny(yjKsdadf.getTmlx(), "singleChoice", "multipleChoice"))
                .map(YjKsdadf::getZzdf).reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal zgtDf = yjKsdadfs.stream().filter(yjKsdadf -> !StringUtils.equalsAny(yjKsdadf.getTmlx(), "singleChoice", "multipleChoice"))
                .map(YjKsdadf::getZzdf).reduce(BigDecimal.ZERO, BigDecimal::add);
        // 3.修改学生总分
        yjMapper.updateSjzdf(ksxxbh, yjKsBh, kgtDf, zgtDf, zzdf, userService.getUserId());
    }*/
}
