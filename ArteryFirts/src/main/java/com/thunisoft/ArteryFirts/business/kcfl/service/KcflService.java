/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.business.kcfl.service
 * @className com.thunisoft.ArteryFirts.business.kcfl.service.KcflService
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.business.kcfl.service;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thunisoft.artery.util.uuid.UUIDHelper;
import com.thunisoft.ArteryFirts.business.kcfl.mapper.KcflMapper;
import com.thunisoft.ArteryFirts.business.kcfl.model.Kcfl;

/**
 * 课程分类service接口实现类
 * 
 * @description 课程分类service接口实现
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 */
@Service
public class KcflService{

    /**
     * kcflMapper
     */
    @Autowired
    private KcflMapper kcflMapper;

    /**
     * KcflService
     * 
     * @description 插入一条课程分类数据
     * @param kcfl 课程分类
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public int insert(Kcfl kcfl) {
        if (StringUtils.isBlank(kcfl.getBh())) {
            kcfl.setBh(UUIDHelper.getUuid());
        }
        return kcflMapper.insert(kcfl);
    }

    /**
     * KcflService
     * 
     * @description 通过主键删除课程分类数据
     * @param cbh 主键编号
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public int delete(String cbh) {
        return kcflMapper.deleteByPrimaryKey(cbh);
    }

    /**
     * KcflService
     * 
     * @description 通过主键修改Kcfl数据
     * @param kcfl 更新实体
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public int update(Kcfl kcfl) {
        //updateByPrimaryKeySelective：为null的字段不会受影响
        //updateByPrimaryKey：字段为null时，会将数据库对应字段置空
        return kcflMapper.updateByPrimaryKeySelective(kcfl);
    }

    /**
     * KcflService
     * 
     * @description 通过条件查询多条数据
     * @param args 参数
     * @return List<Kcfl>
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public List<Kcfl> select(Kcfl args) {
        return kcflMapper.select(args);
    }

    /**
     * KcflService
     * 
     * @description 通过主键查询课程分类信息
     * @param cbh 主键编号
     * @return Kcfl
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public Kcfl selectOne(String cbh) {
        return kcflMapper.selectByPrimaryKey(cbh);
    }
}