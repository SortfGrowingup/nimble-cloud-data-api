package com.nimblecloud.core.api.data.sql;

import java.util.Map;

/**
 * where 条件接口类
 * @see Condition
 * @see WhereAnalysis
 * @author SortfGrowingup
 * @version 1.0
 * @date 2021/4/19 22:52
 */
public interface WhereCondition {
    Map<String, Condition> getConditions();
}