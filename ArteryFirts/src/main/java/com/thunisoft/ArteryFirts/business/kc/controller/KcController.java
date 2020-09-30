/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.business.kc.controller
 * @className com.thunisoft.ArteryFirts.business.kc.controller.KcController
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.business.kc.controller;

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
import com.thunisoft.ArteryFirts.business.kc.model.Kc;
import com.thunisoft.ArteryFirts.business.kc.service.KcService;
import com.thunisoft.ArteryFirts.validate.Validate;
import com.thunisoft.dilu.component.page.aop.QueryPage;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * KcController
 * 
 * @description 课程表
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 */
@Api(value = "课程表", tags = "课程表")
@RequestMapping(value = "/api/v1")
@RestController
public class KcController {

    /**
     * kcService
     */
    @Autowired
    private KcService kcService;

    /**
     * 
     * KcController
     * 
     * @description 创建课程表
     * @param kc 课程表
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "创建课程表", response = Integer.class)
    @PostMapping(value = "/kc", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> insert(@Validated({Validate.class}) @RequestBody Kc kc) {
        Integer count = kcService.insert(kc);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    /**
     * 
     * KcController
     * 
     * @description 删除课程表
     * @param id 主键
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "删除课程表", response = Integer.class)
    @DeleteMapping(value = "/kc/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> delete(@ApiParam(name = "id", required = true) @PathVariable("id") String id) {
        Integer count = kcService.delete(id);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    /**
     * 
     * KcController
     * 
     * @description 修改课程表
     * @param kc 课程表
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "修改课程表", response = Integer.class)
    @PutMapping(value = "/kc", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> update(@Validated({Validate.class}) @RequestBody Kc kc) {
        Integer count = kcService.update(kc);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    /**
     * 
     * KcController
     * 
     * @description 分页查询课程表
     * @param kc 查询条件
     * @return PageInfo<Kc>
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "分页查询课程表", response = Kc.class)
    @GetMapping(value = "/kc/page", produces = MediaType.APPLICATION_JSON_VALUE)
    @DataTranslate
    @QueryPage
    public ResponseEntity<List<Kc>> selectAll(Kc kc) {
        List<Kc> pageData = kcService.select(kc);
        return new ResponseEntity<>(pageData, HttpStatus.OK);
    }

    /**
     * 
     * KcController
     * 
     * @description 查询课程表
     * @param id 主键
     * @return Kc
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "查询课程表", response = Kc.class)
    @GetMapping(value = "/kc/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @DataTranslate
    public ResponseEntity<Kc> selectOne(@ApiParam(name = "id", required = true) @PathVariable("id") String id) {
        Kc result = kcService.selectOne(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}