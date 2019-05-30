package com.graduate.museum.controller;

import com.graduate.museum.service.UserService;
import com.graduate.museum.utils.FileUploadUtils;
import com.graduate.museum.utils.ResultMap;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
@RequestMapping(value = "user")
@Api(value = "用户相关接口", description = "用户相关接口")
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation(value = "用户注册", notes = "用户注册")
    @RequestMapping(value = "register", method = RequestMethod.POST)
    public ResultMap register(String username, String password, String type) {
        if (userService.register(username, password, type) == 1) {
            return ResultMap.success(null);
        }
        return ResultMap.fail(null);
    }

    @ApiOperation(value = "用户登录", notes = "用户登录")
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public ResultMap login(String username, String password, String type) {
        if (userService.login(username, password, type) != null) {
            return ResultMap.success(userService.login(username, password, type));
        }
        return ResultMap.fail(null);
    }

    @ApiOperation(value = "修改用户头像", notes = "修改用户头像")
    @RequestMapping(value = "/avatarUpdate", method = RequestMethod.POST)
    public ResultMap avatarUpdate(@RequestParam("file") MultipartFile file, long id,
                                  HttpServletRequest request) throws IOException {
        String url = FileUploadUtils.upLoadPicture(file, "upload/userimage", request);
        if (userService.updateAvatar(url, id) == 1) {
            return ResultMap.success(url);
        }
        return ResultMap.fail(null);
    }


    @ApiOperation(value = "获取用户数量", notes = "获取用户数量")
    @RequestMapping(value = "/getUserCount", method = RequestMethod.POST)
    public ResultMap getUserCount(String type) {
        return ResultMap.success(userService.getUserCount(type));
    }

    @ApiOperation(value = "分页获取用户", notes = "分页获取用户")
    @RequestMapping(value = "getUserByPage", method = RequestMethod.POST)
    public ResultMap getServiceByPage(Integer offset, Integer pageSize) {
        if (userService.getUserInfoByPage(offset, pageSize) != null) {
            return ResultMap.success(userService.getUserInfoByPage(offset, pageSize));
        }
        return ResultMap.fail(null);
    }

    @ApiOperation(value = "更新用户信息", notes = "更新用户信息")
    @RequestMapping(value = "/updateUserInfo", method = RequestMethod.POST)
    public ResultMap UpdateUser(String username, String sex, String age, String address, long id) throws IOException {
        if (userService.updateUserInfo(username, sex, age, address, id) == 1) {
            return ResultMap.success(null);
        }
        return ResultMap.fail(null);
    }
}
