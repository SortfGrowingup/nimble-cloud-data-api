package com.nimblecloud.core.api;

import com.nimblecloud.core.api.option.Option;

/**
 * @author SortfGrowingup
 * @version 1.0
 * @date 2021/3/13 19:11
 */
public interface JDBCResultFulRepository {
    Option get(Object namespace);
    default Option get(String namespace){
        return get((Object) namespace);
    }
    Option put(String namespace, Option option);
}