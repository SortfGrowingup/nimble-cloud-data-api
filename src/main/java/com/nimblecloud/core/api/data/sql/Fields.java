package com.nimblecloud.core.api.data.sql;

import java.util.Collection;
import java.util.Objects;
import java.util.UUID;

/**
 * 用于解析获取 sql语句展示字段部分
 * @author SortfGrowingup
 * @version 1.0
 * @date 2021/4/20 12:27
 */
@FunctionalInterface
public interface Fields {

    /**
     * 根据字段集合，来解析 SELECT [?] FROM 部分
     * @param fields 字段集合
     * @return SELECT [?] FROM str
     */
    String SQLCondition(Collection<String> fields);


    default String getAS(){
        return getAS("a");
    }

    /**
     * 默认的获取as 实现， 建议自行实现此方法，
     * 默认返回的as是用UUID 直接生成的；
     * @param as 别名
     * @return SELECT [] FROM tableName AS [?] srt
     */
    default String getAS(String as){
        if (null == as) return UUID.randomUUID().toString(); return as;
    }
}