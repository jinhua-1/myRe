/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.business.zjjl.controller
 * @className com.thunisoft.ArteryFirts.business.zjjl.controller.ZjjlController
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.business.zjjl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thunisoft.artery.data.annotation.DataTranslate;
import com.thunisoft.ArteryFirts.business.zjjl.model.Zjjl;
import com.thunisoft.ArteryFirts.business.zjjl.service.ZjjlService;
import com.thunisoft.ArteryFirts.validate.Validate;
import com.thunisoft.dilu.component.page.aop.QueryPage;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * ZjjlController
 * 
 * @description 章节记录表
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 */
@Api(value = "章节记录表", tags = "章节记录表")
@RequestMapping(value = "/api/v1")
@RestController
public class ZjjlController {

    /**
     * zjjlService
     */
    @Autowired
    private ZjjlService zjjlService;

    /**
     * 
     * ZjjlController
     * 
     * @description 创建章节记录表
     * @param zjjl 章节记录表
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "创建章节记录表", response = Integer.class)
    @PostMapping(value = "/zjjl", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> insert(@Validated({Validate.class}) @RequestBody Zjjl zjjl) {
        Integer count = zjjlService.insert(zjjl);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    /**
     * 
     * ZjjlController
     * 
     * @description 删除章节记录表
     * @param id 主键
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "删除章节记录表", response = Integer.class)
    @DeleteMapping(value = "/zjjl/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> delete(@ApiParam(name = "id", required = true) @PathVariable("id") String id) {
        Integer count = zjjlService.delete(id);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    /**
     * 
     * ZjjlController
     * 
     * @description 修改章节记录表
     * @param zjjl 章节记录表
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "修改章节记录表", response = Integer.class)
    @PutMapping(value = "/zjjl", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> update(@Validated({Validate.class}) @RequestBody Zjjl zjjl) {
        Integer count = zjjlService.update(zjjl);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    /**
     * 
     * ZjjlController
     * 
     * @description 分页查询章节记录表
     * @param zjjl 查询条件
     * @return PageInfo<Zjjl>
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "分页查询章节记录表", response = Zjjl.class)
    @GetMapping(value = "/zjjl/page", produces = MediaType.APPLICATION_JSON_VALUE)
    @DataTranslate
    @QueryPage
    public ResponseEntity<List<Zjjl>> selectAll(Zjjl zjjl) {
        List<Zjjl> pageData = zjjlService.select(zjjl);
        return new ResponseEntity<>(pageData, HttpStatus.OK);
    }

    /**
     * 
     * ZjjlController
     * 
     * @description 查询章节记录表
     * @param id 主键
     * @return Zjjl
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "查询章节记录表", response = Zjjl.class)
    @GetMapping(value = "/zjjl/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @DataTranslate
    public ResponseEntity<Zjjl> selectOne(@ApiParam(name = "id", required = true) @PathVariable("id") String id) {
        Zjjl result = zjjlService.selectOne(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}