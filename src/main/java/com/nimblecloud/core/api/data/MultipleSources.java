package com.nimblecloud.core.api.data;

import javax.sql.DataSource;

/**
 * 数据源
 * @author SortfGrowingup
 * @version 1.0
 * @date 2021/3/14 13:38
 */
public interface MultipleSources {
    DataSource get(Object namespace);
    default DataSource get(String namespace){
        return get((Object) namespace);
    }
    DataSource put(String namespace, DataSource ds);
}