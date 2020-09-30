/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.business.kcfl.controller
 * @className com.thunisoft.ArteryFirts.business.kcfl.controller.KcflController
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.business.kcfl.controller;

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
import com.thunisoft.ArteryFirts.business.kcfl.model.Kcfl;
import com.thunisoft.ArteryFirts.business.kcfl.service.KcflService;
import com.thunisoft.ArteryFirts.validate.Validate;
import com.thunisoft.dilu.component.page.aop.QueryPage;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * KcflController
 * 
 * @description 课程分类
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 */
@Api(value = "课程分类", tags = "课程分类")
@RequestMapping(value = "/api/v1")
@RestController
public class KcflController {

    /**
     * kcflService
     */
    @Autowired
    private KcflService kcflService;

    /**
     * 
     * KcflController
     * 
     * @description 创建课程分类
     * @param kcfl 课程分类
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "创建课程分类", response = Integer.class)
    @PostMapping(value = "/kcfl", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> insert(@Validated({Validate.class}) @RequestBody Kcfl kcfl) {
        Integer count = kcflService.insert(kcfl);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    /**
     * 
     * KcflController
     * 
     * @description 删除课程分类
     * @param id 主键
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "删除课程分类", response = Integer.class)
    @DeleteMapping(value = "/kcfl/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> delete(@ApiParam(name = "id", required = true) @PathVariable("id") String id) {
        Integer count = kcflService.delete(id);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    /**
     * 
     * KcflController
     * 
     * @description 修改课程分类
     * @param kcfl 课程分类
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "修改课程分类", response = Integer.class)
    @PutMapping(value = "/kcfl", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> update(@Validated({Validate.class}) @RequestBody Kcfl kcfl) {
        Integer count = kcflService.update(kcfl);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    /**
     * 
     * KcflController
     * 
     * @description 分页查询课程分类
     * @param kcfl 查询条件
     * @return PageInfo<Kcfl>
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "分页查询课程分类", response = Kcfl.class)
    @GetMapping(value = "/kcfl/page", produces = MediaType.APPLICATION_JSON_VALUE)
    @DataTranslate
    @QueryPage
    public ResponseEntity<List<Kcfl>> selectAll(Kcfl kcfl) {
        List<Kcfl> pageData = kcflService.select(kcfl);
        return new ResponseEntity<>(pageData, HttpStatus.OK);
    }

    /**
     * 
     * KcflController
     * 
     * @description 查询课程分类
     * @param id 主键
     * @return Kcfl
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "查询课程分类", response = Kcfl.class)
    @GetMapping(value = "/kcfl/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @DataTranslate
    public ResponseEntity<Kcfl> selectOne(@ApiParam(name = "id", required = true) @PathVariable("id") String id) {
        Kcfl result = kcflService.selectOne(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}