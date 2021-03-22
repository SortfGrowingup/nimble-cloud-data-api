package com.nimblecloud.core.api.option;

import com.alibaba.fastjson.JSONObject;

/**
 * 用于填入配置文件
 * @author SortfGrowingup
 * @version 1.0
 * @date 2021/3/22 22:13
 */
public interface Config {
    /**
     * 获取配置文件
     * @return jsonObject
     */
    JSONObject config();

    /**
     * 设置配置文件
     * @param config 配置文件
     */
    void config(JSONObject config);
}