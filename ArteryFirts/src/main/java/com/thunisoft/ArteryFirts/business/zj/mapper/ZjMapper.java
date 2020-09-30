/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.business.zj.mapper
 * @className com.thunisoft.ArteryFirts.business.zj.mapper.ZjMapper
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.business.zj.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.thunisoft.artery.data.mybatis.page.BaseMapper;
import com.thunisoft.ArteryFirts.business.zj.model.Zj;

/**
 * ZjMapper
 * 
 * @description 章节表
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 */
@Mapper
public interface ZjMapper extends BaseMapper<Zj, String> {

}