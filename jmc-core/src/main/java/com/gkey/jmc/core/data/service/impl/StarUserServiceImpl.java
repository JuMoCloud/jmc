package com.gkey.jmc.core.data.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gkey.jmc.core.data.entity.StarUser;
import com.gkey.jmc.core.data.mapper.StarUserMapper;
import com.gkey.jmc.core.data.service.StarUserService;
import com.gkey.jmc.core.util.page.Page;

/**
 * 用户表 服务实现类
 * 
 * @author: Guokey
 * @date: 2018-05-09 14:56:36
 * @version: V1.0-auto
 * @review: Guokey/2018-05-09 14:56:36
 */
@Service
public class StarUserServiceImpl implements StarUserService {

    @Autowired
    private StarUserMapper starUserMapper;

    @Override
    public Integer insert(StarUser starUser) {
        Integer i = starUserMapper.insert(starUser);
        return i;
    }

    @Override
    public Integer insertAllColumn(StarUser starUser) {
        Integer i = starUserMapper.insertAllColumn(starUser);
        return i;
    }

    @Override
    public Integer update(Long id, StarUser starUser) {
        Integer i = starUserMapper.update(id, starUser);
        return i;
    }

    @Override
    public Integer updateAllColumn(Long id, StarUser starUser) {
        Integer i = starUserMapper.updateAllColumn(id, starUser);
        return i;
    }

    @Override
    public StarUser selectById(Long id) {
        StarUser starUser = starUserMapper.selectById(id);
        return starUser;
    }

    @Override
    public Page<StarUser> selectPage(Page<StarUser> page, String other) {
        Integer total = starUserMapper.pageAll(other);
        if (total > 0) {
            page.setTotalItems(total);
            page.setResult(starUserMapper.page(page, other));
        }
        return page;
    }

    @Override
    public Integer delete(Long id) {
        Integer i = starUserMapper.delete(id);
        return i;
    }

}
