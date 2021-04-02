package com.aj.cache.starter.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 属性的注入
 * 这些属性就可以在application.yml文件中直接配置
 * 格式为：aj.reactor.layering.cache
 */
@Data
@ConfigurationProperties(prefix = "aj.reactor.layering.cache")
public class ReactorLayeringCacheProperties {

    /**
     * 是否开启缓存状态设计
     */
    private boolean stats = true;

    /**
     * 命名空间，必须唯一使用服务名
     */
    private String namespace;

    /**
     * 启动LayeringCacheServlet.
     */
    private boolean layeringCacheServletEnabled = true;

}
