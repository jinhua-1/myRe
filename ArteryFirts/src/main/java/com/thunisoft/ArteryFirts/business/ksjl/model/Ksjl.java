/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.model
 * @className com.thunisoft.ArteryFirts.model.Ksjl
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.business.ksjl.model;

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
import java.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * Ksjl
 *
 * @description 课时记录表实体
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 **/
@ApiModel("课时记录表")
@Table(name="LES_PXXT.T_KSJL")    
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ksjl extends BaseEntity{
    
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
     * 课时编号
     */
    @ApiModelProperty("课时编号")
    @Column(name = "C_KSBH")
    @Size(max = 32, groups = {Validate.class}, message = "课时编号的最大长度为32")
    private String ksbh;

    /**
     * 课时名称
     */
    @ApiModelProperty("课时名称")
    @Column(name = "C_KSMC")
    @Size(max = 300, groups = {Validate.class}, message = "课时名称的最大长度为300")
    private String ksmc;

    /**
     * 学习进度
     */
    @ApiModelProperty("学习进度")
    @Column(name = "C_XXJD")
    @Size(max = 300, groups = {Validate.class}, message = "学习进度的最大长度为300")
    private String xxjd;

    /**
     * 课时状态
     */
    @ApiModelProperty("课时状态")
    @Column(name = "N_KSZT")
    private Integer kszt;

    /**
     * 学习时长
     */
    @ApiModelProperty("学习时长")
    @Column(name = "C_XXSC")
    @Size(max = 300, groups = {Validate.class}, message = "学习时长的最大长度为300")
    private String xxsc;

    /**
     * 开始学习时间
     */
    @ApiModelProperty("开始学习时间")
    @Column(name = "DT_KSXXSJ")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime ksxxsj;

    /**
     * 学习完毕时间
     */
    @ApiModelProperty("学习完毕时间")
    @Column(name = "DT_XXWBSJ")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime xxwbsj;

    /**
     * 是否收藏
     */
    @ApiModelProperty("是否收藏")
    @Column(name = "N_SFSC")
    private Integer sfsc;

    /**
     * 上次观看时间
     */
    @ApiModelProperty("上次观看时间")
    @Column(name = "DT_SCGKSJ")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime scgksj;

}