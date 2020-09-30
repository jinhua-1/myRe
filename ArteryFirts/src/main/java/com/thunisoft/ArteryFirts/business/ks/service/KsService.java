/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.business.ks.service
 * @className com.thunisoft.ArteryFirts.business.ks.service.KsService
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.business.ks.service;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thunisoft.artery.util.uuid.UUIDHelper;
import com.thunisoft.ArteryFirts.business.ks.mapper.KsMapper;
import com.thunisoft.ArteryFirts.business.ks.model.Ks;

/**
 * 课时表service接口实现类
 * 
 * @description 课时表service接口实现
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 */
@Service
public class KsService{

    /**
     * ksMapper
     */
    @Autowired
    private KsMapper ksMapper;

    /**
     * KsService
     * 
     * @description 插入一条课时表数据
     * @param ks 课时表
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public int insert(Ks ks) {
        if (StringUtils.isBlank(ks.getBh())) {
            ks.setBh(UUIDHelper.getUuid());
        }
        return ksMapper.insert(ks);
    }

    /**
     * KsService
     * 
     * @description 通过主键删除课时表数据
     * @param cbh 主键编号
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public int delete(String cbh) {
        return ksMapper.deleteByPrimaryKey(cbh);
    }

    /**
     * KsService
     * 
     * @description 通过主键修改Ks数据
     * @param ks 更新实体
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public int update(Ks ks) {
        //updateByPrimaryKeySelective：为null的字段不会受影响
        //updateByPrimaryKey：字段为null时，会将数据库对应字段置空
        return ksMapper.updateByPrimaryKeySelective(ks);
    }

    /**
     * KsService
     * 
     * @description 通过条件查询多条数据
     * @param args 参数
     * @return List<Ks>
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public List<Ks> select(Ks args) {
        return ksMapper.select(args);
    }

    /**
     * KsService
     * 
     * @description 通过主键查询课时表信息
     * @param cbh 主键编号
     * @return Ks
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public Ks selectOne(String cbh) {
        return ksMapper.selectByPrimaryKey(cbh);
    }
}