package com.dhs.spring_boot_study.Thymeleaf模板引擎;

/**
 * 【重要】<p>
 * 查看spring boot中 mvc是如何自动配置的，请参看WebMvcAutoConfiguration，和WebMvcProperties<p>
 * &nbsp;&nbsp;1.自动配置view resolver：InternalResourceViewResolver，BeanNameViewResolver，ContentNegotiatingViewResolver等<p>
 * &nbsp;&nbsp;2.通过addResourceHandlers()方法自动配置的静态资源。包括:<p>
 * &nbsp;&nbsp;&nbsp;(1)将/static,/public,/resources,/META-INF/resources的静态文件映射为/**,可以通过localhost:8080/**访问。<p>
 * &nbsp;&nbsp;&nbsp;(2)/META-INF/resource/webjar/**映射为/webjar/**,可以通过localhost:8080/webjar/**访问。<p>
 * &nbsp;&nbsp;3.通过addFormatters()方法，容器中所有的Formatter，GenericConverter，Converter接口的实现类bean会自动注册到
 * spring mvc中。<p>
 * &nbsp;&nbsp;4.通过configureMessageConverters()方法,将通过HttpMessageConvertersAutoConfiguration自动配置的
 * HttpMessageConverters类的bean注册到spring mvc中。<p>
 * &nbsp;&nbsp;5.静态首页的支持:/static,/public,/resources,/META-INF/resources下的index.html都可以通过
 * localhost:8080/index.html访问到。<p>
 */
public class Main {
}
