package com.nimblecloud.core.api.option;

import com.nimblecloud.core.api.http.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author SortfGrowingup
 * @version 1.0
 * @date 2021/3/13 19:04
 */
public interface After {
    ResponseBody toAfter(ResponseBody data, HttpServletRequest req, HttpServletResponse res);
}