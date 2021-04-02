package com.aj.cache.starter.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置类
 * <pre>从resources/META-INF/spring.factories文件，根据spring.factories文件中的配置，找到需要自动配置的类</pre>
 * @Configuration 表明是一个配置文件，被注解的类将成为一个bean配置类
 * @ConditionalOnClass 当classpath下发现该类的情况下进行自动配置
 * @ConditionalOnBean 当classpath下发现该类的情况下进行自动配置
 * @EnableConfigurationProperties 使@ConfigurationProperties注解生效
 * @AutoConfigureAfter 完成自动配置后实例化这个bean
 */
@Configuration
@ConditionalOnBean()
public class ReactorLayeringCacheAutoConfig {
}
