package com.graduate.museum.service;

import com.graduate.museum.entity.Collection;

import java.util.List;

public interface CollectionService {

    int publishCollection(String name, String description, String avatar, String type, String recommend);

    List<Collection> searchAllCollectionByType(String type);

    List<Collection> searchAllCollectionByRecommend(String recommend);

    List<Collection> getCollectionByPage(Integer offset, Integer pageSize);

    int getCollectionCount();

    int deleteCollectionById(long id);

    Collection getCollectionById( long id);

    int updateCollectionInfo(String name, String description, String avatar, String type, String recommend, long id);

}
