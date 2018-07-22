package com.dhs.spring_boot_study.自建StarterPom;

import com.dhs.spring_boot_starter_hello.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【理解】
 * <P>spring boot通过扫描META-INF文件夹下的spring.factories配置文件，从而得到
 * org.springframework.boot.autoconfigure.EnableAutoConfiguration属性的值
 * com.dhs.spring_boot_starter_hello.HelloServiceAutoConfiguration，该值就
 * 是用于自动配置的类名。具体如下：<p>
 * <p>
 * -@Configuration <p>
 * -@EnableConfigurationProperties({HelloServiceProperties.class}) <p>
 * -@ConditionalOnClass({HelloService.class}) <p>
 * -@ConditionalOnProperty( prefix = "hello",value = {"enable"},matchIfMissing = true)
 * <p>
 * -public class HelloServiceAutoConfiguration<p>
 * 通过各种条件注解，实现根据环境自动配置
 */
@RestController
@SpringBootApplication
public class Main {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    HelloService helloService;
}
