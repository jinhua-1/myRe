/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.business.kcjl.service
 * @className com.thunisoft.ArteryFirts.business.kcjl.service.KcjlService
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.business.kcjl.service;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thunisoft.artery.util.uuid.UUIDHelper;
import com.thunisoft.ArteryFirts.business.kcjl.mapper.KcjlMapper;
import com.thunisoft.ArteryFirts.business.kcjl.model.Kcjl;

/**
 * 课程记录表service接口实现类
 * 
 * @description 课程记录表service接口实现
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 */
@Service
public class KcjlService{

    /**
     * kcjlMapper
     */
    @Autowired
    private KcjlMapper kcjlMapper;

    /**
     * KcjlService
     * 
     * @description 插入一条课程记录表数据
     * @param kcjl 课程记录表
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public int insert(Kcjl kcjl) {
        if (StringUtils.isBlank(kcjl.getBh())) {
            kcjl.setBh(UUIDHelper.getUuid());
        }
        return kcjlMapper.insert(kcjl);
    }

    /**
     * KcjlService
     * 
     * @description 通过主键删除课程记录表数据
     * @param cbh 主键编号
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public int delete(String cbh) {
        return kcjlMapper.deleteByPrimaryKey(cbh);
    }

    /**
     * KcjlService
     * 
     * @description 通过主键修改Kcjl数据
     * @param kcjl 更新实体
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public int update(Kcjl kcjl) {
        //updateByPrimaryKeySelective：为null的字段不会受影响
        //updateByPrimaryKey：字段为null时，会将数据库对应字段置空
        return kcjlMapper.updateByPrimaryKeySelective(kcjl);
    }

    /**
     * KcjlService
     * 
     * @description 通过条件查询多条数据
     * @param args 参数
     * @return List<Kcjl>
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public List<Kcjl> select(Kcjl args) {
        return kcjlMapper.select(args);
    }

    /**
     * KcjlService
     * 
     * @description 通过主键查询课程记录表信息
     * @param cbh 主键编号
     * @return Kcjl
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public Kcjl selectOne(String cbh) {
        return kcjlMapper.selectByPrimaryKey(cbh);
    }
}