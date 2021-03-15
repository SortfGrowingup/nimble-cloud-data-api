package com.nimblecloud.core.api.http;

/**
 * @author SortfGrowingup
 * @version 1.0
 * @date 2021/3/13 19:07
 */
public interface RequestBody extends Head, Body{
    Head getHead();
    Body getBody();
}