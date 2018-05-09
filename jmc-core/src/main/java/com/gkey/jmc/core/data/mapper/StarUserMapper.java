package com.gkey.jmc.core.data.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gkey.jmc.core.util.page.Page;

import com.gkey.jmc.core.data.entity.StarUser;

/**
 * 用户表 Mapper接口
 * 
 * @author: Guokey
 * @date: 2018-05-09 14:51:06
 * @version: V1.0-auto
 * @review: Guokey/2018-05-09 14:51:06
 */
public interface StarUserMapper {

    /**
     * 新增(插入非空字段)
     * 
     * @param starUser
     * @return Integer
     */
    public Integer insert(StarUser starUser);

    /**
     * 新增(插入全部字段)
     * 
     * @param starUser
     * @return Integer
     */
    public Integer insertAllColumn(StarUser starUser);

    /**
     * 修改(修改非空字段)
     * 
     * @param starUser
     * @return Integer
     */
    public Integer update(@Param("id") Long id, @Param("starUser") StarUser starUser);

    /**
     * 修改(修改全部字段)
     * 
     * @param starUser
     * @return Integer
     */
    public Integer updateAllColumn(@Param("id") Long id, @Param("starUser") StarUser starUser);

    /**
     * 根据主键查找实体
     * 
     * @param id
     * @return StarUser
     */
    public StarUser selectById(Long id);

    /**
     * list数据
     * 
     * @return List
     */
    public List<StarUser> selectList();

    /**
     * 分頁total
     * 
     * @param other
     * @return Integer
     */
    public Integer pageAll(@Param("other") String other);

    /**
     * 分頁
     * 
     * @param page
     * @param other
     * @return List
     */
    public List<StarUser> page(@Param("page") Page<StarUser> page, @Param("other") String other);

    /**
     * 刪除
     * 
     * @param id
     * @return Integer
     */
    public Integer delete(Long id);
}