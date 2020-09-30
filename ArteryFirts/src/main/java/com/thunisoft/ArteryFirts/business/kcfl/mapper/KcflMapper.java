/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.business.kcfl.mapper
 * @className com.thunisoft.ArteryFirts.business.kcfl.mapper.KcflMapper
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.business.kcfl.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.thunisoft.artery.data.mybatis.page.BaseMapper;
import com.thunisoft.ArteryFirts.business.kcfl.model.Kcfl;

/**
 * KcflMapper
 * 
 * @description 课程分类
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 */
@Mapper
public interface KcflMapper extends BaseMapper<Kcfl, String> {

}