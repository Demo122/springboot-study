package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @discription: JedisDemo
 * Created by mingli on 2022/4/22 20:19.
 */

public class JedisDemo {

    @Autowired
    private RedisTemplate redisTemplate;

}
