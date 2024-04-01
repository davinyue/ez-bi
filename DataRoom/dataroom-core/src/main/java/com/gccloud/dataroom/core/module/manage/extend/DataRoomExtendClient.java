package com.gccloud.dataroom.core.module.manage.extend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author hongyang
 * @version 1.0
 * @date 2023/8/1 15:10
 */
@Component
public class DataRoomExtendClient {

    @Autowired(required = false)
    private IDataRoomExtendService extendService;


    /**
     * 删除页面后的扩展方法
     * @param code
     */
    public void deleteByCode(String code) {
        if (extendService != null) {
            extendService.deleteByCode(code);
        }
    }

    /**
     * 页面新增后的处理
     * @param code 新增的页面code
     */
    public void afterAdd(String code) {
        if (extendService != null) {
            extendService.afterAdd(code);
        }
    }

    /**
     * 页面删除后的处理
     * @param code 删除的页面code
     */
    public void afterDelete(String code) {
        if (extendService != null) {
            extendService.afterDelete(code);
        }
    }


}
