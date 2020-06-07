package com.baizhi.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author zmf
 * @date 2020/6/6 4:28 下午
 */
@Component
public class RedisCacheTransfer {
    @Autowired
    public void setConnectionFactory(RedisTemplate redisTemplate) {
        RedisCache.setRedisTemplate(redisTemplate);
    }
}
