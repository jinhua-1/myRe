/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.model
 * @className com.thunisoft.ArteryFirts.model.Ks
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.business.ks.model;

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
 * Ks
 *
 * @description 课时表实体
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 **/
@ApiModel("课时表")
@Table(name="LES_PXXT.T_KS")    
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ks extends BaseEntity{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * 章节编号
     */
    @ApiModelProperty("章节编号")
    @Column(name = "C_ZJBH")
    @Size(max = 32, groups = {Validate.class}, message = "章节编号的最大长度为32")
    private String zjbh;

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
     * 标题图
     */
    @ApiModelProperty("标题图")
    @Column(name = "C_BTT")
    @Size(max = 300, groups = {Validate.class}, message = "标题图的最大长度为300")
    private String btt;

    /**
     * 视频链接
     */
    @ApiModelProperty("视频链接")
    @Column(name = "C_SPLJ")
    @Size(max = 300, groups = {Validate.class}, message = "视频链接的最大长度为300")
    private String splj;

    /**
     * 视频名称
     */
    @ApiModelProperty("视频名称")
    @Column(name = "C_SPMC")
    @Size(max = 300, groups = {Validate.class}, message = "视频名称的最大长度为300")
    private String spmc;

    /**
     * 资源链接
     */
    @ApiModelProperty("资源链接")
    @Column(name = "C_ZYLJ")
    @Size(max = 900, groups = {Validate.class}, message = "资源链接的最大长度为900")
    private String zylj;

    /**
     * 是否必修
     */
    @ApiModelProperty("是否必修")
    @Column(name = "N_SFBX")
    private Integer sfbx;

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