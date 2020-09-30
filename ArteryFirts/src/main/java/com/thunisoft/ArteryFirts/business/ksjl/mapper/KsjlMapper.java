/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.business.ksjl.mapper
 * @className com.thunisoft.ArteryFirts.business.ksjl.mapper.KsjlMapper
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.business.ksjl.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.thunisoft.artery.data.mybatis.page.BaseMapper;
import com.thunisoft.ArteryFirts.business.ksjl.model.Ksjl;

/**
 * KsjlMapper
 * 
 * @description 课时记录表
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 */
@Mapper
public interface KsjlMapper extends BaseMapper<Ksjl, String> {

}