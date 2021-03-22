package com.nimblecloud.core.api.option;

import com.nimblecloud.core.api.http.RequestBody;

/**
 * 校验使用
 * @see Option
 * @author SortfGrowingup
 * @version 1.0
 * @date 2021/3/22 23:40
 */
public interface Verification extends Config{

    /**
     * 用于操作前的校验
     * @param data 校验请求数据
     * @return true-执行之后逻辑，false-做校验失败处理
     */
    boolean verification(RequestBody data);
}