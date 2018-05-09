package com.gkey.jmc.web.filter;

import org.springframework.core.annotation.Order;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 
 * @author GuoKey[wszghj@aliyun.com]
 *
 */
@Order(1)
@WebFilter(filterName = "CorsFilter", urlPatterns = "/*")
public class CORSFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletResponse responseHttp = (HttpServletResponse) response;
        responseHttp.setHeader("Access-Control-Allow-Origin", "*");
        responseHttp.setHeader("Access-Control-Allow-Methods", "GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE");
        responseHttp.setHeader("Access-Control-Max-Age", "3600");
        responseHttp.setHeader("Access-Control-Allow-Headers",
                "Content-Type, Accept, X-Requested-With, remember-me, X-Token");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        
    }
}
