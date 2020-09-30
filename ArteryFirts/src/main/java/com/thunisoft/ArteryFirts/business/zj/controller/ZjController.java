/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.business.zj.controller
 * @className com.thunisoft.ArteryFirts.business.zj.controller.ZjController
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.business.zj.controller;

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
import com.thunisoft.ArteryFirts.business.zj.model.Zj;
import com.thunisoft.ArteryFirts.business.zj.service.ZjService;
import com.thunisoft.ArteryFirts.validate.Validate;
import com.thunisoft.dilu.component.page.aop.QueryPage;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * ZjController
 * 
 * @description 章节表
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 */
@Api(value = "章节表", tags = "章节表")
@RequestMapping(value = "/api/v1")
@RestController
public class ZjController {

    /**
     * zjService
     */
    @Autowired
    private ZjService zjService;

    /**
     * 
     * ZjController
     * 
     * @description 创建章节表
     * @param zj 章节表
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "创建章节表", response = Integer.class)
    @PostMapping(value = "/zj", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> insert(@Validated({Validate.class}) @RequestBody Zj zj) {
        Integer count = zjService.insert(zj);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    /**
     * 
     * ZjController
     * 
     * @description 删除章节表
     * @param id 主键
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "删除章节表", response = Integer.class)
    @DeleteMapping(value = "/zj/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> delete(@ApiParam(name = "id", required = true) @PathVariable("id") String id) {
        Integer count = zjService.delete(id);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    /**
     * 
     * ZjController
     * 
     * @description 修改章节表
     * @param zj 章节表
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "修改章节表", response = Integer.class)
    @PutMapping(value = "/zj", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> update(@Validated({Validate.class}) @RequestBody Zj zj) {
        Integer count = zjService.update(zj);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    /**
     * 
     * ZjController
     * 
     * @description 分页查询章节表
     * @param zj 查询条件
     * @return PageInfo<Zj>
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "分页查询章节表", response = Zj.class)
    @GetMapping(value = "/zj/page", produces = MediaType.APPLICATION_JSON_VALUE)
    @DataTranslate
    @QueryPage
    public ResponseEntity<List<Zj>> selectAll(Zj zj) {
        List<Zj> pageData = zjService.select(zj);
        return new ResponseEntity<>(pageData, HttpStatus.OK);
    }

    /**
     * 
     * ZjController
     * 
     * @description 查询章节表
     * @param id 主键
     * @return Zj
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "查询章节表", response = Zj.class)
    @GetMapping(value = "/zj/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @DataTranslate
    public ResponseEntity<Zj> selectOne(@ApiParam(name = "id", required = true) @PathVariable("id") String id) {
        Zj result = zjService.selectOne(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}