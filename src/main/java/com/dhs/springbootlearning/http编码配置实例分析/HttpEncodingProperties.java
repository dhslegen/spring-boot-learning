package com.dhs.springbootlearning.http编码配置实例分析;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.nio.charset.Charset;

// 具体是如何配合自动配置的请参看org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration
@ConfigurationProperties(prefix = "spring.http.encoding")
public class HttpEncodingProperties {
    public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
    private Charset charset = DEFAULT_CHARSET;
    private boolean force = true;

    public Charset getCharset() {
        return this.charset;
    }

    public void setCharset(Charset charset) {
        this.charset = charset;
    }

    public boolean isForce() {
        return this.force;
    }

    public void setForce(boolean force) {
        this.force = force;
    }
}
