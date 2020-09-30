/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.business.zjjl.service
 * @className com.thunisoft.ArteryFirts.business.zjjl.service.ZjjlService
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.business.zjjl.service;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thunisoft.artery.util.uuid.UUIDHelper;
import com.thunisoft.ArteryFirts.business.zjjl.mapper.ZjjlMapper;
import com.thunisoft.ArteryFirts.business.zjjl.model.Zjjl;

/**
 * 章节记录表service接口实现类
 * 
 * @description 章节记录表service接口实现
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 */
@Service
public class ZjjlService{

    /**
     * zjjlMapper
     */
    @Autowired
    private ZjjlMapper zjjlMapper;

    /**
     * ZjjlService
     * 
     * @description 插入一条章节记录表数据
     * @param zjjl 章节记录表
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public int insert(Zjjl zjjl) {
        if (StringUtils.isBlank(zjjl.getBh())) {
            zjjl.setBh(UUIDHelper.getUuid());
        }
        return zjjlMapper.insert(zjjl);
    }

    /**
     * ZjjlService
     * 
     * @description 通过主键删除章节记录表数据
     * @param cbh 主键编号
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public int delete(String cbh) {
        return zjjlMapper.deleteByPrimaryKey(cbh);
    }

    /**
     * ZjjlService
     * 
     * @description 通过主键修改Zjjl数据
     * @param zjjl 更新实体
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public int update(Zjjl zjjl) {
        //updateByPrimaryKeySelective：为null的字段不会受影响
        //updateByPrimaryKey：字段为null时，会将数据库对应字段置空
        return zjjlMapper.updateByPrimaryKeySelective(zjjl);
    }

    /**
     * ZjjlService
     * 
     * @description 通过条件查询多条数据
     * @param args 参数
     * @return List<Zjjl>
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public List<Zjjl> select(Zjjl args) {
        return zjjlMapper.select(args);
    }

    /**
     * ZjjlService
     * 
     * @description 通过主键查询章节记录表信息
     * @param cbh 主键编号
     * @return Zjjl
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public Zjjl selectOne(String cbh) {
        return zjjlMapper.selectByPrimaryKey(cbh);
    }
}