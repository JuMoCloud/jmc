package com.gkey.jmc.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gkey.jmc.core.data.entity.StarUser;
import com.gkey.jmc.core.data.service.StarUserService;
import com.gkey.jmc.core.util.page.Page;
import com.gkey.jmc.web.message.ResponseMessage;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 用户表 controller控制器
 * 
 * @author: Guokey
 * @date: 2018-05-09 15:02:59
 * @version: V1.0-auto
 * @review: Guokey/2018-05-09 15:02:59
 */
@Api(description = "用户表管理")
@RestController
@RequestMapping("/staruser")
public class StarUserController {

    @Autowired
    protected StarUserService starUserService;

    @PostMapping
    @ApiOperation(value = "新增", notes = "新增")
    public ResponseMessage add(@RequestBody StarUser starUser) {
        Integer i = starUserService.insert(starUser);
        return ResponseMessage.success(i);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "修改", notes = "修改")
    public ResponseMessage update(@PathVariable("id") Long id, @RequestBody StarUser starUser) {
        Integer i = starUserService.update(id, starUser);
        return ResponseMessage.success(i);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除", notes = "删除")
    public ResponseMessage delete(@PathVariable("id") Long id) {
        Integer i = starUserService.delete(id);
        return ResponseMessage.success(i);
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "查询明细", notes = "查询明细")
    public ResponseMessage info(@PathVariable("id") Long id) {
        StarUser starUser = starUserService.selectById(id);
        return ResponseMessage.success(starUser);
    }

    @GetMapping
    @ApiOperation(value = "查询分页", notes = "查询分页")
    public ResponseMessage page(@RequestParam(value = "pageNo", required = false) Integer pageNo,
            @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        Page<StarUser> page = new Page<StarUser>(pageNo, pageSize);
        page = starUserService.selectPage(page, null);
        return ResponseMessage.success(page);
    }

}