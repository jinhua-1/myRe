/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.business.kc.service
 * @className com.thunisoft.ArteryFirts.business.kc.service.KcService
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.business.kc.service;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thunisoft.artery.util.uuid.UUIDHelper;
import com.thunisoft.ArteryFirts.business.kc.mapper.KcMapper;
import com.thunisoft.ArteryFirts.business.kc.model.Kc;

/**
 * 课程表service接口实现类
 * 
 * @description 课程表service接口实现
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 */
@Service
public class KcService{

    /**
     * kcMapper
     */
    @Autowired
    private KcMapper kcMapper;

    /**
     * KcService
     * 
     * @description 插入一条课程表数据
     * @param kc 课程表
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public int insert(Kc kc) {
        if (StringUtils.isBlank(kc.getBh())) {
            kc.setBh(UUIDHelper.getUuid());
        }
        return kcMapper.insert(kc);
    }

    /**
     * KcService
     * 
     * @description 通过主键删除课程表数据
     * @param cbh 主键编号
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public int delete(String cbh) {
        return kcMapper.deleteByPrimaryKey(cbh);
    }

    /**
     * KcService
     * 
     * @description 通过主键修改Kc数据
     * @param kc 更新实体
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public int update(Kc kc) {
        //updateByPrimaryKeySelective：为null的字段不会受影响
        //updateByPrimaryKey：字段为null时，会将数据库对应字段置空
        return kcMapper.updateByPrimaryKeySelective(kc);
    }

    /**
     * KcService
     * 
     * @description 通过条件查询多条数据
     * @param args 参数
     * @return List<Kc>
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public List<Kc> select(Kc args) {
        return kcMapper.select(args);
    }

    /**
     * KcService
     * 
     * @description 通过主键查询课程表信息
     * @param cbh 主键编号
     * @return Kc
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public Kc selectOne(String cbh) {
        return kcMapper.selectByPrimaryKey(cbh);
    }
}