package com.dhs.spring_boot_study.注册ServletFilterListener;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.*;
import java.io.IOException;

/**
 * 【重要】<p>
 * &nbsp;&nbsp;可以通过以下2种方式实现配置servlet、filter、listener：<p>
 * &nbsp;&nbsp;&nbsp;1.直接将各自注册为bean到容器中。
 * &nbsp;&nbsp;&nbsp;2.通过RegistrationBean注册。
 */
public class Main {
    /**
     * 直接将各自注册为bean到容器中。
     *
     * @return
     */
    @Bean
    public XxServlet xxServlet() {
        return new XxServlet();
    }

    /**
     * 通过RegistrationBean注册。
     *
     * @return
     */
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new XxServlet(), "/");
    }
}

class XxServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
