/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.business.wz.mapper
 * @className com.thunisoft.ArteryFirts.business.wz.mapper.WzMapper
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.business.wz.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.thunisoft.artery.data.mybatis.page.BaseMapper;
import com.thunisoft.ArteryFirts.business.wz.model.Wz;

/**
 * WzMapper
 * 
 * @description 文章表
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 */
@Mapper
public interface WzMapper extends BaseMapper<Wz, String> {

}