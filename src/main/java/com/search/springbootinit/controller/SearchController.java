package com.search.springbootinit.controller;

import com.search.springbootinit.common.BaseResponse;
import com.search.springbootinit.common.ResultUtils;
import com.search.springbootinit.model.vo.SearchVO;
import com.search.springbootinit.manager.SearchFacade;
import com.search.springbootinit.model.dto.search.SearchRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 图片接口
 *
 * @author 樊金亮
 * @date 2023/5/19
 */

@RestController
@RequestMapping("/search")
@Slf4j
public class SearchController {
    @Resource
    private SearchFacade searchFacade;

    @PostMapping("/all")
    public BaseResponse<SearchVO> searchAll(@RequestBody SearchRequest searchRequest, HttpServletRequest request) {
        return ResultUtils.success(searchFacade.searchAll(searchRequest, request));
    }
}
