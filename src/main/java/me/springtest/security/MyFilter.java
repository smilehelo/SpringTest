package me.springtest.security;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import me.springtest.entity.Singleton;

/**
 * Servlet Filter implementation class Myfilter
 */
//@WebFilter("/Myfilter")
public class MyFilter implements Filter {

    /**
     * Default constructor. 
     */
    public MyFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String username = "";
		boolean isFalse = false;
		try{
			username = SecurityContextHolder.getContext().getAuthentication().getName();
			Object o = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			System.out.println("username***" + username);
			System.out.println("Object***" + o);
		} catch (NullPointerException e){
			isFalse = true;
			System.out.println(isFalse);
		}
		if(isFalse){
			response.setContentType("application/json;charset=UTF-8");
			Singleton res = new Singleton();
			res.setName("no user");
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			mapper.writeValue(response.getWriter(), res);
		}else{
			chain.doFilter(request, response);
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
