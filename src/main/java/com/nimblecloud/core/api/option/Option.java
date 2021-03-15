package com.nimblecloud.core.api.option;

import com.nimblecloud.core.api.http.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 抽象出来的操作接口，任何一个触发动作都可以被抽象成是一个操作，
 * 一个大的逻辑可以细分成很多个小的操作，每个操作在操作之前之后都可以去提前处理一些细节
 * @author SortfGrowingup
 * @version 1.0
 * @date 2021/3/13 19:04
 */
public interface Option extends After, Before{
    ResponseBody toOption(ResponseBody data, HttpServletRequest req, HttpServletResponse res);
}