/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.model
 * @className com.thunisoft.ArteryFirts.model.Zj
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.business.zj.model;

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
 * Zj
 *
 * @description 章节表实体
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 **/
@ApiModel("章节表")
@Table(name="LES_PXXT.T_ZJ")    
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Zj extends BaseEntity{
    
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
     * 父章节编号
     */
    @ApiModelProperty("父章节编号")
    @Column(name = "C_FZJBH")
    @Size(max = 300, groups = {Validate.class}, message = "父章节编号的最大长度为300")
    private String fzjbh;

    /**
     * 名称
     */
    @ApiModelProperty("名称")
    @Column(name = "C_MC")
    @Size(max = 300, groups = {Validate.class}, message = "名称的最大长度为300")
    private String mc;

    /**
     * 标题图
     */
    @ApiModelProperty("标题图")
    @Column(name = "C_BTT")
    @Size(max = 300, groups = {Validate.class}, message = "标题图的最大长度为300")
    private String btt;

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

    /**
     * 课程编号集合
     */
    @ApiModelProperty("课程编号集合")
    @Column(name = "C_KCBHS")
    private String kcbhs;

    /**
     * 课程名称集合
     */
    @ApiModelProperty("课程名称集合")
    @Column(name = "C_KCMCS")
    private String kcmcs;

}