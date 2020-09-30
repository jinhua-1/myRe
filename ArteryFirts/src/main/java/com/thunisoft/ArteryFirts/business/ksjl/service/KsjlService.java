/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.business.ksjl.service
 * @className com.thunisoft.ArteryFirts.business.ksjl.service.KsjlService
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.business.ksjl.service;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thunisoft.artery.util.uuid.UUIDHelper;
import com.thunisoft.ArteryFirts.business.ksjl.mapper.KsjlMapper;
import com.thunisoft.ArteryFirts.business.ksjl.model.Ksjl;

/**
 * 课时记录表service接口实现类
 * 
 * @description 课时记录表service接口实现
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 */
@Service
public class KsjlService{

    /**
     * ksjlMapper
     */
    @Autowired
    private KsjlMapper ksjlMapper;

    /**
     * KsjlService
     * 
     * @description 插入一条课时记录表数据
     * @param ksjl 课时记录表
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public int insert(Ksjl ksjl) {
        if (StringUtils.isBlank(ksjl.getBh())) {
            ksjl.setBh(UUIDHelper.getUuid());
        }
        return ksjlMapper.insert(ksjl);
    }

    /**
     * KsjlService
     * 
     * @description 通过主键删除课时记录表数据
     * @param cbh 主键编号
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public int delete(String cbh) {
        return ksjlMapper.deleteByPrimaryKey(cbh);
    }

    /**
     * KsjlService
     * 
     * @description 通过主键修改Ksjl数据
     * @param ksjl 更新实体
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public int update(Ksjl ksjl) {
        //updateByPrimaryKeySelective：为null的字段不会受影响
        //updateByPrimaryKey：字段为null时，会将数据库对应字段置空
        return ksjlMapper.updateByPrimaryKeySelective(ksjl);
    }

    /**
     * KsjlService
     * 
     * @description 通过条件查询多条数据
     * @param args 参数
     * @return List<Ksjl>
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public List<Ksjl> select(Ksjl args) {
        return ksjlMapper.select(args);
    }

    /**
     * KsjlService
     * 
     * @description 通过主键查询课时记录表信息
     * @param cbh 主键编号
     * @return Ksjl
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public Ksjl selectOne(String cbh) {
        return ksjlMapper.selectByPrimaryKey(cbh);
    }
}