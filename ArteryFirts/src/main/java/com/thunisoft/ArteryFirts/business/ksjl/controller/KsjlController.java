/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.business.ksjl.controller
 * @className com.thunisoft.ArteryFirts.business.ksjl.controller.KsjlController
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.business.ksjl.controller;

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
import com.thunisoft.ArteryFirts.business.ksjl.model.Ksjl;
import com.thunisoft.ArteryFirts.business.ksjl.service.KsjlService;
import com.thunisoft.ArteryFirts.validate.Validate;
import com.thunisoft.dilu.component.page.aop.QueryPage;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * KsjlController
 * 
 * @description 课时记录表
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 */
@Api(value = "课时记录表", tags = "课时记录表")
@RequestMapping(value = "/api/v1")
@RestController
public class KsjlController {

    /**
     * ksjlService
     */
    @Autowired
    private KsjlService ksjlService;

    /**
     * 
     * KsjlController
     * 
     * @description 创建课时记录表
     * @param ksjl 课时记录表
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "创建课时记录表", response = Integer.class)
    @PostMapping(value = "/ksjl", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> insert(@Validated({Validate.class}) @RequestBody Ksjl ksjl) {
        Integer count = ksjlService.insert(ksjl);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    /**
     * 
     * KsjlController
     * 
     * @description 删除课时记录表
     * @param id 主键
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "删除课时记录表", response = Integer.class)
    @DeleteMapping(value = "/ksjl/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> delete(@ApiParam(name = "id", required = true) @PathVariable("id") String id) {
        Integer count = ksjlService.delete(id);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    /**
     * 
     * KsjlController
     * 
     * @description 修改课时记录表
     * @param ksjl 课时记录表
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "修改课时记录表", response = Integer.class)
    @PutMapping(value = "/ksjl", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> update(@Validated({Validate.class}) @RequestBody Ksjl ksjl) {
        Integer count = ksjlService.update(ksjl);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    /**
     * 
     * KsjlController
     * 
     * @description 分页查询课时记录表
     * @param ksjl 查询条件
     * @return PageInfo<Ksjl>
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "分页查询课时记录表", response = Ksjl.class)
    @GetMapping(value = "/ksjl/page", produces = MediaType.APPLICATION_JSON_VALUE)
    @DataTranslate
    @QueryPage
    public ResponseEntity<List<Ksjl>> selectAll(Ksjl ksjl) {
        List<Ksjl> pageData = ksjlService.select(ksjl);
        return new ResponseEntity<>(pageData, HttpStatus.OK);
    }

    /**
     * 
     * KsjlController
     * 
     * @description 查询课时记录表
     * @param id 主键
     * @return Ksjl
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "查询课时记录表", response = Ksjl.class)
    @GetMapping(value = "/ksjl/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @DataTranslate
    public ResponseEntity<Ksjl> selectOne(@ApiParam(name = "id", required = true) @PathVariable("id") String id) {
        Ksjl result = ksjlService.selectOne(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}