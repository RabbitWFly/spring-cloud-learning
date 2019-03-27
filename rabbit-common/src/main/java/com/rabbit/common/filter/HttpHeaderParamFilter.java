package com.rabbit.common.filter;

import com.rabbit.common.support.RibbonFilterContextHolder;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author chentao
 * Date 2019/3/27
 * Description 参数传递过滤器
 **/
public class HttpHeaderParamFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest)request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        httpResponse.setCharacterEncoding("UTF-8");
        httpResponse.setContentType("application/json; charset=utf-8");
        String uid = httpRequest.getHeader("uid");
        //RibbonFilterContextHolder.clearCurrentContext();
        RibbonFilterContextHolder.getCurrentContext().add("uid", uid);
        chain.doFilter(httpRequest, response);
    }

    @Override
    public void destroy() {

    }
}

