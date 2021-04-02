package com.aj.cache.starter.config;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * 自动配置类
 * <pre>从resources/META-INF/spring.factories文件，根据spring.factories文件中的配置，找到需要自动配置的类</pre>
 * @Configuration 表明是一个配置文件，被注解的类将成为一个bean配置类
 * @ConditionalOnClass 当classpath下发现该类的情况下进行自动配置
 * @ConditionalOnBean 当classpath下发现该类的情况下进行自动配置
 * @EnableConfigurationProperties：为带有 @ConfigurationProperties 注解的 Bean 提供有效的支持。这个注解可以提供一种方便的方式来将带有 @ConfigurationProperties 注解的类注入为 Spring 容器的 Bean。
 * @ConditionalOnMissingBean：当 Spring Context中不存在该Bean时。
 * @AutoConfigureAfter 完成自动配置后实例化这个bean
 * @ConditionalOnWebApplication 只有web应用程序时此自动配置类才会生效
 * @EnableAspectJAutoProxy 表示开启AOP代理自动配置
 * @Import ：引入其他的配置类
 */
@Configuration
@EnableAspectJAutoProxy
@ConditionalOnBean(RedisTemplate.class)
@AutoConfigureAfter({RedisAutoConfiguration.class})
@EnableConfigurationProperties({ReactorLayeringCacheProperties.class})
public class ReactorLayeringCacheAutoConfig {



}
