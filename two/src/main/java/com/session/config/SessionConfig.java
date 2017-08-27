package com.session.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by Administrator on 2017/8/27.
 */
@Configuration
@EnableRedisHttpSession
public class SessionConfig {
}
