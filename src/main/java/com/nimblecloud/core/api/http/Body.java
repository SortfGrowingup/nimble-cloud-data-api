package com.nimblecloud.core.api.http;

import com.alibaba.fastjson.JSONObject;

/**
 *
 * @author SortfGrowingup
 * @version 1.0
 * @date 2021/3/13 19:07
 */
public interface Body {
    JSONObject bodyJSONObject();
    default String bodyJSONString(){
        return bodyJSONObject().toJSONString();
    }
}