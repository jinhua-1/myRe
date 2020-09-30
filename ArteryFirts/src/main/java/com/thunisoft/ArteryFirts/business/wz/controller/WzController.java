/**
 * @projectName 示例
 * @package com.thunisoft.ArteryFirts.business.wz.controller
 * @className com.thunisoft.ArteryFirts.business.wz.controller.WzController
 * @copyright Copyright 2020 Thunisoft, Inc. All rights reserved.
 */
package com.thunisoft.ArteryFirts.business.wz.controller;

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
import com.thunisoft.ArteryFirts.business.wz.model.Wz;
import com.thunisoft.ArteryFirts.business.wz.service.WzService;
import com.thunisoft.ArteryFirts.validate.Validate;
import com.thunisoft.dilu.component.page.aop.QueryPage;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * WzController
 * 
 * @description 文章表
 * @author jinhua
 * @date 2020年09月29日 16:22:03
 * @version 1.0.0
 */
@Api(value = "文章表", tags = "文章表")
@RequestMapping(value = "/api/v1")
@RestController
public class WzController {

    /**
     * wzService
     */
    @Autowired
    private WzService wzService;

    /**
     * 
     * WzController
     * 
     * @description 创建文章表
     * @param wz 文章表
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "创建文章表", response = Integer.class)
    @PostMapping(value = "/wz", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> insert(@Validated({Validate.class}) @RequestBody Wz wz) {
        Integer count = wzService.insert(wz);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    /**
     * 
     * WzController
     * 
     * @description 删除文章表
     * @param id 主键
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "删除文章表", response = Integer.class)
    @DeleteMapping(value = "/wz/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> delete(@ApiParam(name = "id", required = true) @PathVariable("id") String id) {
        Integer count = wzService.delete(id);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    /**
     * 
     * WzController
     * 
     * @description 修改文章表
     * @param wz 文章表
     * @return 影响行数
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "修改文章表", response = Integer.class)
    @PutMapping(value = "/wz", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> update(@Validated({Validate.class}) @RequestBody Wz wz) {
        Integer count = wzService.update(wz);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    /**
     * 
     * WzController
     * 
     * @description 分页查询文章表
     * @param wz 查询条件
     * @return PageInfo<Wz>
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "分页查询文章表", response = Wz.class)
    @GetMapping(value = "/wz/page", produces = MediaType.APPLICATION_JSON_VALUE)
    @DataTranslate
    @QueryPage
    public ResponseEntity<List<Wz>> selectAll(Wz wz) {
        List<Wz> pageData = wzService.select(wz);
        return new ResponseEntity<>(pageData, HttpStatus.OK);
    }

    /**
     * 
     * WzController
     * 
     * @description 查询文章表
     * @param id 主键
     * @return Wz
     * @author jinhua
     * @date 2020年09月29日 16:22:03
     * @version 1.0.0
     */
    @ApiOperation(value = "查询文章表", response = Wz.class)
    @GetMapping(value = "/wz/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @DataTranslate
    public ResponseEntity<Wz> selectOne(@ApiParam(name = "id", required = true) @PathVariable("id") String id) {
        Wz result = wzService.selectOne(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}