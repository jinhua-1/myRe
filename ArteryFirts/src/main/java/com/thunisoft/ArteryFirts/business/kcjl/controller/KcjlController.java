/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.business.kcjl.controller
 * @className com.thunisoft.ArteryFirts.business.kcjl.controller.KcjlController
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.business.kcjl.controller;

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
import com.thunisoft.ArteryFirts.business.kcjl.model.Kcjl;
import com.thunisoft.ArteryFirts.business.kcjl.service.KcjlService;
import com.thunisoft.ArteryFirts.validate.Validate;
import com.thunisoft.dilu.component.page.aop.QueryPage;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * KcjlController
 * 
 * @description 课程记录表
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 */
@Api(value = "课程记录表", tags = "课程记录表")
@RequestMapping(value = "/api/v1")
@RestController
public class KcjlController {

    /**
     * kcjlService
     */
    @Autowired
    private KcjlService kcjlService;

    /**
     * 
     * KcjlController
     * 
     * @description 创建课程记录表
     * @param kcjl 课程记录表
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "创建课程记录表", response = Integer.class)
    @PostMapping(value = "/kcjl", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> insert(@Validated({Validate.class}) @RequestBody Kcjl kcjl) {
        Integer count = kcjlService.insert(kcjl);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    /**
     * 
     * KcjlController
     * 
     * @description 删除课程记录表
     * @param id 主键
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "删除课程记录表", response = Integer.class)
    @DeleteMapping(value = "/kcjl/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> delete(@ApiParam(name = "id", required = true) @PathVariable("id") String id) {
        Integer count = kcjlService.delete(id);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    /**
     * 
     * KcjlController
     * 
     * @description 修改课程记录表
     * @param kcjl 课程记录表
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "修改课程记录表", response = Integer.class)
    @PutMapping(value = "/kcjl", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> update(@Validated({Validate.class}) @RequestBody Kcjl kcjl) {
        Integer count = kcjlService.update(kcjl);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    /**
     * 
     * KcjlController
     * 
     * @description 分页查询课程记录表
     * @param kcjl 查询条件
     * @return PageInfo<Kcjl>
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "分页查询课程记录表", response = Kcjl.class)
    @GetMapping(value = "/kcjl/page", produces = MediaType.APPLICATION_JSON_VALUE)
    @DataTranslate
    @QueryPage
    public ResponseEntity<List<Kcjl>> selectAll(Kcjl kcjl) {
        List<Kcjl> pageData = kcjlService.select(kcjl);
        return new ResponseEntity<>(pageData, HttpStatus.OK);
    }

    /**
     * 
     * KcjlController
     * 
     * @description 查询课程记录表
     * @param id 主键
     * @return Kcjl
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "查询课程记录表", response = Kcjl.class)
    @GetMapping(value = "/kcjl/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @DataTranslate
    public ResponseEntity<Kcjl> selectOne(@ApiParam(name = "id", required = true) @PathVariable("id") String id) {
        Kcjl result = kcjlService.selectOne(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}