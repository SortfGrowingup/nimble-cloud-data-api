package com.nimblecloud.core.api.data.sql;

import java.util.Collection;

/**
 * @author SortfGrowingup
 * @version 1.0
 * @date 2021/4/20 12:37
 */
@FunctionalInterface
public interface FieldsCondition {
    Collection<String> getCondition();
}
