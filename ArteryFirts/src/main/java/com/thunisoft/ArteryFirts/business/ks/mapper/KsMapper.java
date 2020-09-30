/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.business.ks.mapper
 * @className com.thunisoft.ArteryFirts.business.ks.mapper.KsMapper
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.business.ks.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.thunisoft.artery.data.mybatis.page.BaseMapper;
import com.thunisoft.ArteryFirts.business.ks.model.Ks;

/**
 * KsMapper
 * 
 * @description 课时表
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 */
@Mapper
public interface KsMapper extends BaseMapper<Ks, String> {

}