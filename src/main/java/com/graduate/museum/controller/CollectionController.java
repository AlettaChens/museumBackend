package com.graduate.museum.controller;

import com.graduate.museum.service.CollectionService;
import com.graduate.museum.utils.FileUploadUtils;
import com.graduate.museum.utils.ResultMap;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
@RequestMapping(value = "collection")
@Api(value = "藏品相关接口", description = "藏品相关接口")
public class CollectionController {
    @Resource
    private CollectionService collectionService;

    @RequestMapping(value = "publish", method = RequestMethod.POST)
    @ApiOperation(value = "藏品发布接口", notes = "藏品发布接口")
    public ResultMap publish(String name, String description, String avatar, String type, String recommend) {
        if (collectionService.publishCollection(name, description, avatar, type, recommend) == 1) {
            return ResultMap.success(null);
        }
        return ResultMap.fail(null);
    }

    @RequestMapping(value = "searchAllByType", method = RequestMethod.POST)
    @ApiOperation(value = "通过类型获取所有藏品", notes = "通过类型获取所有藏品")
    public ResultMap searchAllByType(String type) {
        if (collectionService.searchAllCollectionByType(type) != null) {
            return ResultMap.success(collectionService.searchAllCollectionByType(type));
        }
        return ResultMap.fail(null);
    }

    @RequestMapping(value = "searchAllByRecommend", method = RequestMethod.POST)
    @ApiOperation(value = "通过推荐获取所有藏品", notes = "通过推荐获取所有藏品")
    public ResultMap searchAllByRecommend(String recommend) {
        if (collectionService.searchAllCollectionByRecommend(recommend) != null) {
            return ResultMap.success(collectionService.searchAllCollectionByRecommend(recommend));
        }
        return ResultMap.fail(null);
    }

    @RequestMapping(value = "getInfoByPage", method = RequestMethod.POST)
    @ApiOperation(value = "分页获取所有藏品", notes = "分页获取所有藏品")
    public ResultMap getInfoByPage(Integer offset, Integer pageSize) {
        if (collectionService.getCollectionByPage(offset, pageSize) != null) {
            return ResultMap.success(collectionService.getCollectionByPage(offset, pageSize));
        }
        return ResultMap.fail(null);
    }


    @RequestMapping(value = "getInfoCount", method = RequestMethod.POST)
    @ApiOperation(value = "获取所有资讯的数量", notes = "获取所有资讯的数量")
    public ResultMap getInfoCount() {
        if (collectionService.getCollectionCount() >= 0) {
            return ResultMap.success(collectionService.getCollectionCount());
        }
        return ResultMap.fail(null);
    }

    @RequestMapping(value = "deleteInfoById", method = RequestMethod.POST)
    @ApiOperation(value = "通过Id删除资讯", notes = "通过Id删除资讯")
    public ResultMap deleteInfoById(long id) {
        if (collectionService.deleteCollectionById(id) == 1) {
            return ResultMap.success(null);
        }
        return ResultMap.fail(null);
    }


    @RequestMapping(value = "getCollectionById", method = RequestMethod.POST)
    @ApiOperation(value = "通过Id查询资讯", notes = "通过Id查询资讯")
    public ResultMap getCollectionById(long id) {
        if (collectionService.getCollectionById(id) != null) {
            return ResultMap.success(collectionService.getCollectionById(id));
        }
        return ResultMap.fail(null);
    }

    @RequestMapping(value = "updateInfo", method = RequestMethod.POST)
    @ApiOperation(value = "通过id更新资讯信息", notes = "通过id更新资讯信息")
    public ResultMap updateInfo(String name, String description, String avatar, String type, String recommend, long id) {
        if (collectionService.updateCollectionInfo(name, description, avatar, type, recommend, id) == 1) {
            return ResultMap.success(null);
        }
        return ResultMap.fail(null);
    }

    @ApiOperation(value = "修改藏品图片", notes = "修改藏品图片")
    @RequestMapping(value = "/updateInfoUrl", method = RequestMethod.POST)
    public ResultMap updateInfoUrl(@RequestParam("file") MultipartFile file, HttpServletRequest request) throws IOException {
        String url = FileUploadUtils.upLoadPicture(file, "upload/info", request);
        return ResultMap.success(url);
    }
}
