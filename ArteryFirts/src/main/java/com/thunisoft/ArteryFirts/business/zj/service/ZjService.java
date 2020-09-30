/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.business.zj.service
 * @className com.thunisoft.ArteryFirts.business.zj.service.ZjService
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.business.zj.service;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thunisoft.artery.util.uuid.UUIDHelper;
import com.thunisoft.ArteryFirts.business.zj.mapper.ZjMapper;
import com.thunisoft.ArteryFirts.business.zj.model.Zj;

/**
 * 章节表service接口实现类
 * 
 * @description 章节表service接口实现
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 */
@Service
public class ZjService{

    /**
     * zjMapper
     */
    @Autowired
    private ZjMapper zjMapper;

    /**
     * ZjService
     * 
     * @description 插入一条章节表数据
     * @param zj 章节表
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public int insert(Zj zj) {
        if (StringUtils.isBlank(zj.getBh())) {
            zj.setBh(UUIDHelper.getUuid());
        }
        return zjMapper.insert(zj);
    }

    /**
     * ZjService
     * 
     * @description 通过主键删除章节表数据
     * @param cbh 主键编号
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public int delete(String cbh) {
        return zjMapper.deleteByPrimaryKey(cbh);
    }

    /**
     * ZjService
     * 
     * @description 通过主键修改Zj数据
     * @param zj 更新实体
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public int update(Zj zj) {
        //updateByPrimaryKeySelective：为null的字段不会受影响
        //updateByPrimaryKey：字段为null时，会将数据库对应字段置空
        return zjMapper.updateByPrimaryKeySelective(zj);
    }

    /**
     * ZjService
     * 
     * @description 通过条件查询多条数据
     * @param args 参数
     * @return List<Zj>
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public List<Zj> select(Zj args) {
        return zjMapper.select(args);
    }

    /**
     * ZjService
     * 
     * @description 通过主键查询章节表信息
     * @param cbh 主键编号
     * @return Zj
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public Zj selectOne(String cbh) {
        return zjMapper.selectByPrimaryKey(cbh);
    }
}