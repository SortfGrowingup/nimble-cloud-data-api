package com.nimblecloud.core.api.data.sql;

import java.util.Map;

/**
 * 获取能够拼接成sql语句 where 部分,
 * 系统提供默认 where 条件实现，同时留下自定义实现部分，
 * 优先执行自定义实现的实现，
 * 后期将拓展基于管理系统的实现，
 * 最终优先级为：
 * 管理系统 -> 自定义实现 -> 系统自带实现
 * @author SortfGrowingup
 * @version 1.0
 * @date 2021/4/17 20:03
 */
@FunctionalInterface
public interface Where {

    /**
     * 获取 sql 条件语句
     * @see WhereCondition
     * @param conditions ps: Condition.EQ
     * @return where [?]
     */
    String SQLCondition(Map<String, Condition> conditions);
}
