package com.dhs.spring_boot_study.类型安全的配置;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
// @PropertySource出了配合@Configuration使用外，还可以配合@ConfigurationProperties使用
//代替过时的location参数，指明外部配置文件的位置，自动调用setter方法，实现个性化的类型安全配置.
@PropertySource("customApplication.properties")
@ConfigurationProperties(prefix = "author")
public class AuthorInfo {
    private String name;
    private Long age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
