/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.business.wz.service
 * @className com.thunisoft.ArteryFirts.business.wz.service.WzService
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.business.wz.service;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thunisoft.artery.util.uuid.UUIDHelper;
import com.thunisoft.ArteryFirts.business.wz.mapper.WzMapper;
import com.thunisoft.ArteryFirts.business.wz.model.Wz;

/**
 * 文章表service接口实现类
 * 
 * @description 文章表service接口实现
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 */
@Service
public class WzService{

    /**
     * wzMapper
     */
    @Autowired
    private WzMapper wzMapper;

    /**
     * WzService
     * 
     * @description 插入一条文章表数据
     * @param wz 文章表
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public int insert(Wz wz) {
        if (StringUtils.isBlank(wz.getBh())) {
            wz.setBh(UUIDHelper.getUuid());
        }
        return wzMapper.insert(wz);
    }

    /**
     * WzService
     * 
     * @description 通过主键删除文章表数据
     * @param cbh 主键编号
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public int delete(String cbh) {
        return wzMapper.deleteByPrimaryKey(cbh);
    }

    /**
     * WzService
     * 
     * @description 通过主键修改Wz数据
     * @param wz 更新实体
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public int update(Wz wz) {
        //updateByPrimaryKeySelective：为null的字段不会受影响
        //updateByPrimaryKey：字段为null时，会将数据库对应字段置空
        return wzMapper.updateByPrimaryKeySelective(wz);
    }

    /**
     * WzService
     * 
     * @description 通过条件查询多条数据
     * @param args 参数
     * @return List<Wz>
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public List<Wz> select(Wz args) {
        return wzMapper.select(args);
    }

    /**
     * WzService
     * 
     * @description 通过主键查询文章表信息
     * @param cbh 主键编号
     * @return Wz
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    public Wz selectOne(String cbh) {
        return wzMapper.selectByPrimaryKey(cbh);
    }
}