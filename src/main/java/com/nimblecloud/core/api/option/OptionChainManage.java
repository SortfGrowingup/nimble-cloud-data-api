package com.nimblecloud.core.api.option;

import java.util.Map;

/**
 * 将管理起所有的optionChain, 项目启动后能够在任意地方获取的到
 * @author SortfGrowingup
 * @version 1.0
 * @date 2021/4/1 12:53
 */
public interface OptionChainManage {
    Map<String, OptionChain> chains();
    OptionChain get(Object namespace);
    void put(String namespace, OptionChain chain);
}