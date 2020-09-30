/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.model
 * @className com.thunisoft.ArteryFirts.model.Zjjl
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.business.zjjl.model;

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
 * Zjjl
 *
 * @description 章节记录表实体
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 **/
@ApiModel("章节记录表")
@Table(name="LES_PXXT.T_ZJJL")    
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Zjjl extends BaseEntity{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * 单位编号
     */
    @ApiModelProperty("单位编号")
    @Column(name = "C_DWBH")
    @Size(max = 300, groups = {Validate.class}, message = "单位编号的最大长度为300")
    private String dwbh;

    /**
     * 用户编号
     */
    @ApiModelProperty("用户编号")
    @Column(name = "C_YHBH")
    @Size(max = 300, groups = {Validate.class}, message = "用户编号的最大长度为300")
    private String yhbh;

    /**
     * 用户名称
     */
    @ApiModelProperty("用户名称")
    @Column(name = "C_YHMC")
    @Size(max = 300, groups = {Validate.class}, message = "用户名称的最大长度为300")
    private String yhmc;

    /**
     * 章节编号
     */
    @ApiModelProperty("章节编号")
    @Column(name = "C_ZJBH")
    @Size(max = 300, groups = {Validate.class}, message = "章节编号的最大长度为300")
    private String zjbh;

    /**
     * 章节名称
     */
    @ApiModelProperty("章节名称")
    @Column(name = "C_ZJMC")
    @Size(max = 300, groups = {Validate.class}, message = "章节名称的最大长度为300")
    private String zjmc;

    /**
     * 是否收藏
     */
    @ApiModelProperty("是否收藏")
    @Column(name = "N_SFSC")
    private Integer sfsc;

}