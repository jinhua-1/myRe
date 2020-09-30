/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.model
 * @className com.thunisoft.ArteryFirts.model.Kcfl
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.business.kcfl.model;

import javax.persistence.Column;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import com.thunisoft.ArteryFirts.common.BaseEntity;
import javax.validation.constraints.Size;
import com.thunisoft.ArteryFirts.validate.Validate;


/**
 * Kcfl
 *
 * @description 课程分类实体
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 **/
@ApiModel("课程分类")
@Table(name="LES_PXXT.T_KCFL")    
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Kcfl extends BaseEntity{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * 名称
     */
    @ApiModelProperty("名称")
    @Column(name = "C_MC")
    @Size(max = 300, groups = {Validate.class}, message = "名称的最大长度为300")
    private String mc;

    /**
     * 是否展示
     */
    @ApiModelProperty("是否展示")
    @Column(name = "N_SFZS")
    private Integer sfzs;

    /**
     * 简介
     */
    @ApiModelProperty("简介")
    @Column(name = "C_JJ")
    @Size(max = 300, groups = {Validate.class}, message = "简介的最大长度为300")
    private String jj;

    /**
     * 描述
     */
    @ApiModelProperty("描述")
    @Column(name = "C_MS")
    @Size(max = 600, groups = {Validate.class}, message = "描述的最大长度为600")
    private String ms;

    /**
     * 是否停用
     */
    @ApiModelProperty("是否停用")
    @Column(name = "N_SFTY")
    private Integer sfty;

}