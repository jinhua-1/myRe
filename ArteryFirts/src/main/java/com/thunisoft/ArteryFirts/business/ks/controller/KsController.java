/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.business.ks.controller
 * @className com.thunisoft.ArteryFirts.business.ks.controller.KsController
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.business.ks.controller;

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
import com.thunisoft.ArteryFirts.business.ks.model.Ks;
import com.thunisoft.ArteryFirts.business.ks.service.KsService;
import com.thunisoft.ArteryFirts.validate.Validate;
import com.thunisoft.dilu.component.page.aop.QueryPage;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * KsController
 * 
 * @description 课时表
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 */
@Api(value = "课时表", tags = "课时表")
@RequestMapping(value = "/api/v1")
@RestController
public class KsController {

    /**
     * ksService
     */
    @Autowired
    private KsService ksService;

    /**
     * 
     * KsController
     * 
     * @description 创建课时表
     * @param ks 课时表
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "创建课时表", response = Integer.class)
    @PostMapping(value = "/ks", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> insert(@Validated({Validate.class}) @RequestBody Ks ks) {
        Integer count = ksService.insert(ks);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    /**
     * 
     * KsController
     * 
     * @description 删除课时表
     * @param id 主键
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "删除课时表", response = Integer.class)
    @DeleteMapping(value = "/ks/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> delete(@ApiParam(name = "id", required = true) @PathVariable("id") String id) {
        Integer count = ksService.delete(id);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    /**
     * 
     * KsController
     * 
     * @description 修改课时表
     * @param ks 课时表
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "修改课时表", response = Integer.class)
    @PutMapping(value = "/ks", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> update(@Validated({Validate.class}) @RequestBody Ks ks) {
        Integer count = ksService.update(ks);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    /**
     * 
     * KsController
     * 
     * @description 分页查询课时表
     * @param ks 查询条件
     * @return PageInfo<Ks>
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "分页查询课时表", response = Ks.class)
    @GetMapping(value = "/ks/page", produces = MediaType.APPLICATION_JSON_VALUE)
    @DataTranslate
    @QueryPage
    public ResponseEntity<List<Ks>> selectAll(Ks ks) {
        List<Ks> pageData = ksService.select(ks);
        return new ResponseEntity<>(pageData, HttpStatus.OK);
    }

    /**
     * 
     * KsController
     * 
     * @description 查询课时表
     * @param id 主键
     * @return Ks
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "查询课时表", response = Ks.class)
    @GetMapping(value = "/ks/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @DataTranslate
    public ResponseEntity<Ks> selectOne(@ApiParam(name = "id", required = true) @PathVariable("id") String id) {
        Ks result = ksService.selectOne(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}