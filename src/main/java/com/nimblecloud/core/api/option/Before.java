package com.nimblecloud.core.api.option;

import com.nimblecloud.core.api.http.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author SortfGrowingup
 * @version 1.0
 * @date 2021/3/13 19:05
 */
public interface Before {
    ResponseBody toBefore(ResponseBody data, HttpServletRequest req, HttpServletResponse res);
}