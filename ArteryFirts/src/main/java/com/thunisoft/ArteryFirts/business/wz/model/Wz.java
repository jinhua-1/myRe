/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.model
 * @className com.thunisoft.ArteryFirts.model.Wz
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.business.wz.model;

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
import com.thunisoft.artery.data.annotation.User;
import com.thunisoft.artery.data.annotation.Corp;


/**
 * Wz
 *
 * @description 文章表实体
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 **/
@ApiModel("文章表")
@Table(name="LES_PXXT.T_WZ")    
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Wz extends BaseEntity{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * 单位编号
     */
    @ApiModelProperty("单位编号")
    @Column(name = "C_DWBH")
    @Corp
    @Size(max = 300, groups = {Validate.class}, message = "单位编号的最大长度为300")
    private String dwbh;

    /**
     * 标题
     */
    @ApiModelProperty("标题")
    @Column(name = "C_BT")
    @Size(max = 300, groups = {Validate.class}, message = "标题的最大长度为300")
    private String bt;

    /**
     * 描述
     */
    @ApiModelProperty("描述")
    @Column(name = "C_MS")
    @Size(max = 300, groups = {Validate.class}, message = "描述的最大长度为300")
    private String ms;

    /**
     * 内容
     */
    @ApiModelProperty("内容")
    @Column(name = "LC_NR")
    private String nr;

    /**
     * 内容纯文本截取
     */
    @ApiModelProperty("内容纯文本截取")
    @Column(name = "C_NRCWBJQ")
    @Size(max = 300, groups = {Validate.class}, message = "内容纯文本截取的最大长度为300")
    private String nrcwbjq;

    /**
     * 标题图
     */
    @ApiModelProperty("标题图")
    @Column(name = "C_BTT")
    @Size(max = 300, groups = {Validate.class}, message = "标题图的最大长度为300")
    private String btt;

    /**
     * 发布时间
     */
    @ApiModelProperty("发布时间")
    @Column(name = "DT_FBSJ")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime fbsj;

    /**
     * 状态
     */
    @ApiModelProperty("状态")
    @Column(name = "N_ZT")
    private Integer zt;

    /**
     * 发布人编号
     */
    @ApiModelProperty("发布人编号")
    @Column(name = "C_FBRBH")
    @User
    @Size(max = 300, groups = {Validate.class}, message = "发布人编号的最大长度为300")
    private String fbrbh;

    /**
     * 发布人姓名
     */
    @ApiModelProperty("发布人姓名")
    @Column(name = "C_FBRXM")
    @Size(max = 300, groups = {Validate.class}, message = "发布人姓名的最大长度为300")
    private String fbrxm;

    /**
     * 是否置顶
     */
    @ApiModelProperty("是否置顶")
    @Column(name = "N_SFZD")
    private Integer sfzd;

    /**
     * 排序
     */
    @ApiModelProperty("排序")
    @Column(name = "N_PX")
    private Integer px;

    /**
     * 作者
     */
    @ApiModelProperty("作者")
    @Column(name = "C_ZZ")
    @Size(max = 300, groups = {Validate.class}, message = "作者的最大长度为300")
    private String zz;

    /**
     * 类型
     */
    @ApiModelProperty("类型")
    @Column(name = "N_LX")
    private Integer lx;

    /**
     * 是否展示
     */
    @ApiModelProperty("是否展示")
    @Column(name = "N_SFZS")
    private Integer sfzs;

    /**
     * 上一篇文章的编号
     */
    @ApiModelProperty("上一篇文章的编号")
    @Column(name = "C_SYPWZBH")
    @Size(max = 300, groups = {Validate.class}, message = "上一篇文章的编号的最大长度为300")
    private String sypwzbh;

    /**
     * 下一篇文章的编号
     */
    @ApiModelProperty("下一篇文章的编号")
    @Column(name = "C_XYPWZBH")
    @Size(max = 300, groups = {Validate.class}, message = "下一篇文章的编号的最大长度为300")
    private String xypwzbh;

    /**
     * 创建人姓名
     */
    @ApiModelProperty("创建人姓名")
    @Column(name = "C_CJRXM")
    @Size(max = 300, groups = {Validate.class}, message = "创建人姓名的最大长度为300")
    private String cjrxm;

    /**
     * 更新人姓名
     */
    @ApiModelProperty("更新人姓名")
    @Column(name = "C_GXRXM")
    @Size(max = 300, groups = {Validate.class}, message = "更新人姓名的最大长度为300")
    private String gxrxm;

}