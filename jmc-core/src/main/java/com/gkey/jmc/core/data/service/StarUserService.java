package com.gkey.jmc.core.data.service;

import com.gkey.jmc.core.data.entity.StarUser;
import com.gkey.jmc.core.util.page.Page;

/**
 * 用户表 服务接口类
 * 
 * @author: Guokey
 * @date: 2018-05-09 14:51:06
 * @version: V1.0-auto
 * @review: Guokey/2018-05-09 14:51:06
 */
public interface StarUserService {

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
    public Integer update(Long id, StarUser starUser);

    /**
     * 修改(修改全部字段)
     * 
     * @param starUser
     * @return Integer
     */
    public Integer updateAllColumn(Long id, StarUser starUser);

    /**
     * 根据主键查找实体
     * 
     * @param id
     * @return StarUser
     */
    public StarUser selectById(Long id);

    /**
     * 分頁
     * 
     * @param page
     * @param other
     * @return Page
     */
    public Page<StarUser> selectPage(Page<StarUser> page, String other);

    /**
     * 刪除
     * 
     * @param id
     * @return Integer
     */
    public Integer delete(Long id);

}
