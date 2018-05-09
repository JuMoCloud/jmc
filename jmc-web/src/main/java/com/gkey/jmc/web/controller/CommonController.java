package com.gkey.jmc.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gkey.jmc.core.exception.NotFoundException;

public class CommonController {
    
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 判断对象是否为空,如果为空将抛出 {@link NotFoundException}
     * 
     * @param obj
     * @param msg
     */
    protected void assertFound(Object obj, String msg) {
        if (obj == null)
            throw new NotFoundException(msg);
    }
}
