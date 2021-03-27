package com.nimblecloud.core.api.option;

import com.nimblecloud.core.api.http.RequestBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 操作链，至上而下的执行顺序
 * @author SortfGrowingup
 * @version 1.0
 * @date 2021/3/27 21:36
 */
public interface OptionChain {
    void toOption(RequestBody data, HttpServletRequest req, HttpServletResponse res);
}