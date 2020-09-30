/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.common
 * @className com.thunisoft.ArteryFirts.common.BaseEntity
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.common;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Size;
import com.thunisoft.ArteryFirts.validate.Validate;
import java.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import com.thunisoft.artery.data.annotation.User;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * BaseEntity
 *
 * @description 基础类
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 */
@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseEntity implements Serializable {
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * 主键
     */
    @ApiModelProperty("主键")
    @Column(name = "C_BH")
    @Size(max = 32, groups = {Validate.class}, message = "主键的最大长度为32")
    @Id
    private String bh;

    /**
     * 创建人编号
     */
    @ApiModelProperty("创建人编号")
    @Column(name = "C_CJRBH")
    @User
    @Size(max = 300, groups = {Validate.class}, message = "创建人编号的最大长度为300")
    private String cjrbh;

    /**
     * 更新人编号
     */
    @ApiModelProperty("更新人编号")
    @Column(name = "C_GXRBH")
    @Size(max = 300, groups = {Validate.class}, message = "更新人编号的最大长度为300")
    private String gxrbh;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    @Column(name = "DT_CJSJ")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime cjsj;

    /**
     * 更新时间
     */
    @ApiModelProperty("更新时间")
    @Column(name = "DT_GXSJ")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime gxsj;

}