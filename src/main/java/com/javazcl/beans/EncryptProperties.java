package com.javazcl.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * .
 *
 * @Author Chenglin Zhu
 * @Date 2021/7/30 10:00 上午
 */
@ConfigurationProperties(prefix = "spring.encrypt")
public class EncryptProperties {
    private final static String DEFAULT_KEY = "www.zclgetyz.com";

    private String key = DEFAULT_KEY;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
