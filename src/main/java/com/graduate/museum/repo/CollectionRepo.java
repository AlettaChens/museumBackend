package com.graduate.museum.repo;

import com.graduate.museum.entity.Collection;
import com.graduate.museum.mapper.CollectionMapper;
import com.graduate.museum.service.CollectionService;
import com.graduate.museum.utils.DateUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class CollectionRepo implements CollectionService {
    @Resource
    private CollectionMapper collectionMapper;

    @Override
    public int publishCollection(String name, String description, String avatar, String type, String recommend) {
        return collectionMapper.publishCollection(name,description,avatar,type,recommend, DateUtils.getCurrentStringDate());
    }

    @Override
    public List<Collection> searchAllCollectionByType(String type) {
        return collectionMapper.searchAllCollectionByType(type);
    }

    @Override
    public List<Collection> searchAllCollectionByRecommend(String recommend) {
        return collectionMapper.searchAllCollectionByRecommend(recommend);
    }

    @Override
    public List<Collection> getCollectionByPage(Integer offset, Integer pageSize) {
        return collectionMapper.getCollectionByPage((offset-1)*pageSize,pageSize);
    }

    @Override
    public int getCollectionCount() {
        return collectionMapper.getCollectionCount();
    }

    @Override
    public int deleteCollectionById(long id) {
        return collectionMapper.deleteCollectionById(id);
    }

    @Override
    public int updateCollectionInfo(String name, String description, String avatar, String type, String recommend, long id) {
        return collectionMapper.updateCollectionInfo(name,description,DateUtils.getCurrentStringDate(),avatar,type,recommend,id);
    }

    @Override
    public Collection getCollectionById(long id) {
        return collectionMapper.getCollectionById(id);
    }
}
