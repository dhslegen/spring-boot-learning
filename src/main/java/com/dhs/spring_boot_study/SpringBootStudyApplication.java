package com.dhs.spring_boot_study;

import com.dhs.spring_boot_starter_hello.HelloService;
import com.dhs.spring_boot_study.类型安全的配置.AuthorInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// spring boot倡导零配置,但保留了通过@ImportResource来加载外部配置的接口。
/*@ImportResource({"classpath:some-context.xml", "classpath:other-context.xml"})*/
@RestController
// Spring Boot的核心注解，开启自动配置。会根据类路径下的jar依赖为当前项目进行自动配置。exclude参数用于关闭特定的自动配置。
@SpringBootApplication(/*exclude = {DataSourceAutoConfiguration.class}*/)
public class SpringBootStudyApplication {
    // 使用自带的配置文件
    @Value("${book.author}")
    private String bookAuthor;
    @Value("${book.name}")
    private String bookName;

    // 使用类型安全的配置文件
    @Autowired
    AuthorInfo authorInfo;

    // 测试自建starter
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    HelloService helloService;

    @RequestMapping("/")
    String index() {
        //return "book name is " + bookName + " and book author is " + bookAuthor + "<p> author name is " + authorInfo.getName() + " and author age is " + authorInfo.getAge();
        return helloService.sayHello();
    }

    /**
     * java程序的标准入口，spring boot 借此启动。
     * 1.自定义banner(启动的图案):在src/main/resource下新建banner.txt,并在http://patorjk.com/software/taag网站上生成。
     * 2.通过命令行修改服务器的端口:java -jar xx.jar --server.port=9090
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringBootStudyApplication.class, args);
    }
}
