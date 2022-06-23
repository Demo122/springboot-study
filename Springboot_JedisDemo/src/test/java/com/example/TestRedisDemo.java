package com.example;

import com.example.pojo.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.annotation.AccessType;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.hash.ObjectHashMapper;

import java.security.PublicKey;

/**
 * @discription: TestJedisDemo
 * Created by mingli on 2022/4/22 20:20.
 */

@SpringBootTest
public class TestRedisDemo {

    @Autowired()
    private RedisTemplate redisTemplate;


    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    private static final ObjectMapper mapper=new ObjectMapper();

    @Test
    public void test(){
        redisTemplate.opsForValue().set("name","李四");
        System.out.println(redisTemplate.opsForValue().get("name"));

    }

    /**
     * Spring默认提供了一个StringRedisTemplate类，它的key和value的序列化方式默认就是String方式。省去了我们自
     * 定义RedisTemplate的过程：
     */
    @Test
    public void test2() throws JsonProcessingException {
        User u=new User();
        u.setId(122);
        u.setName("lisiwww222");

        String json=mapper.writeValueAsString(u);

        stringRedisTemplate.opsForValue().set("user:2",json);

        String val=stringRedisTemplate.opsForValue().get("user:2");
        System.out.println(mapper.readValue(val, User.class));


    }


}
