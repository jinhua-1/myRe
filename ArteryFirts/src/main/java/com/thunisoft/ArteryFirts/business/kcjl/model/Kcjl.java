/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.model
 * @className com.thunisoft.ArteryFirts.model.Kcjl
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.business.kcjl.model;

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
import java.math.BigDecimal;


/**
 * Kcjl
 *
 * @description 课程记录表实体
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 **/
@ApiModel("课程记录表")
@Table(name="LES_PXXT.T_KCJL")    
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Kcjl extends BaseEntity{
    
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
     * 单位名称
     */
    @ApiModelProperty("单位名称")
    @Column(name = "C_DWMC")
    @Size(max = 300, groups = {Validate.class}, message = "单位名称的最大长度为300")
    private String dwmc;

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
     * 课程编号
     */
    @ApiModelProperty("课程编号")
    @Column(name = "C_KCBH")
    @Size(max = 300, groups = {Validate.class}, message = "课程编号的最大长度为300")
    private String kcbh;

    /**
     * 课程名称
     */
    @ApiModelProperty("课程名称")
    @Column(name = "C_KCMC")
    @Size(max = 300, groups = {Validate.class}, message = "课程名称的最大长度为300")
    private String kcmc;

    /**
     * 是否收藏
     */
    @ApiModelProperty("是否收藏")
    @Column(name = "N_SFSC")
    private Integer sfsc;

    /**
     * 学习进度
     */
    @ApiModelProperty("学习进度")
    @Column(name = "N_XXJD")
    private BigDecimal xxjd;

}