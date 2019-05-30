package com.graduate.museum.mapper;

import com.graduate.museum.entity.Collection;
import org.apache.ibatis.annotations.*;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface CollectionMapper extends Mapper<Collection> {
    @Insert("insert into t_collection(name,description,avatar,type,recommend,date)values(#{name},#{description},#{avatar},#{type},#{recommend},#{date})")
    int publishCollection(@Param(value = "name") String name, @Param(value = "description") String description, @Param(value = "avatar") String avatar, @Param(value = "type") String type, @Param(value = "recommend") String recommend, @Param(value = "date") String date);

    @Select("select * from t_collection where type=#{type}")
    List<Collection> searchAllCollectionByType(@Param(value = "type") String type);

    @Select("select * from t_collection where recommend=#{recommend}")
    List<Collection> searchAllCollectionByRecommend(@Param(value = "recommend") String recommend);

    @Select("select * from t_collection limit #{offset},#{pageSize}")
    List<Collection> getCollectionByPage(@Param(value = "offset") Integer offset, @Param(value = "pageSize") Integer pageSize);

    @Select("select count(*) from t_collection")
    int getCollectionCount();

    @Select("select * from t_collection where id=#{id}")
    Collection getCollectionById(@Param(value = "id") long id);

    @Delete("delete from t_collection where id=#{id}")
    int deleteCollectionById(@Param(value = "id") long id);

    @Update("update t_collection set name=#{name},description=#{description},avatar=#{avatar},type=#{type},recommend=#{recommend},date=#{date}where id=#{id}")
    int updateCollectionInfo(@Param(value = "name") String name, @Param(value = "description") String description, @Param(value = "date") String date, @Param(value = "avatar") String avatar, @Param(value = "type") String type, @Param(value = "recommend") String recommend, @Param(value = "id") long id);

}
