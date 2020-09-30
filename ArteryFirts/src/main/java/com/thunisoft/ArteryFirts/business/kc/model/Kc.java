/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.model
 * @className com.thunisoft.ArteryFirts.model.Kc
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.business.kc.model;

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
 * Kc
 *
 * @description 课程表实体
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 **/
@ApiModel("课程表")
@Table(name="LES_PXXT.T_KC")    
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Kc extends BaseEntity{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * 课程分类编号
     */
    @ApiModelProperty("课程分类编号")
    @Column(name = "C_KCFLBH")
    @Size(max = 32, groups = {Validate.class}, message = "课程分类编号的最大长度为32")
    private String kcflbh;

    /**
     * 单位编号
     */
    @ApiModelProperty("单位编号")
    @Column(name = "C_DWBH")
    @Size(max = 300, groups = {Validate.class}, message = "单位编号的最大长度为300")
    private String dwbh;

    /**
     * 名称
     */
    @ApiModelProperty("名称")
    @Column(name = "C_MC")
    @Size(max = 300, groups = {Validate.class}, message = "名称的最大长度为300")
    private String mc;

    /**
     * 老师
     */
    @ApiModelProperty("老师")
    @Column(name = "C_LS")
    @Size(max = 300, groups = {Validate.class}, message = "老师的最大长度为300")
    private String ls;

    /**
     * 描述
     */
    @ApiModelProperty("描述")
    @Column(name = "C_MS")
    @Size(max = 300, groups = {Validate.class}, message = "描述的最大长度为300")
    private String ms;

    /**
     * 是否停用
     */
    @ApiModelProperty("是否停用")
    @Column(name = "N_SFTY")
    private Integer sfty;

    /**
     * 是否展示
     */
    @ApiModelProperty("是否展示")
    @Column(name = "N_SFZS")
    private Integer sfzs;

}