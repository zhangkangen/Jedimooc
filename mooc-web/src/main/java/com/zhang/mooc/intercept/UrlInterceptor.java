package com.zhang.mooc.intercept;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UrlInterceptor implements HandlerInterceptor {

    private static Logger logger = LoggerFactory.getLogger(UrlInterceptor.class);

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        //todo 添加增删改查权限
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        //todo 权限校验
        HttpSession session = request.getSession();
        String path = request.getServletPath();
        logger.info(path);
        //todo 不需要权限的直接放行

        //todo 以下是权限校验

        return false;
    }
}
