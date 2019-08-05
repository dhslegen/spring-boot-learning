package com.dhs.springbootlearning.接管springboot的web配置;

/**
 * 【重要】<p>
 * &nbsp;&nbsp;当spring boot提供的spring mvc不符合要求时，通过以下两种方式实现自定义的配置：<p>
 * &nbsp;&nbsp;&nbsp;1.像以前学的spring mvc那样，@Configuration和@EnableWebMvc的
 * 组合注解来实现<b>完全的自主控制</b>。<p>
 * &nbsp;&nbsp;&nbsp;2.通过将配置类继承WebMvcConfigurerAdapter，无需使用@EnableWebMvc注解，<b>可以既保留
 * spring boot的便利，也可以添加自己的配置<b>。自定义的配置有效且不会覆盖spring boot的配置。
 */
public class Main {
}
