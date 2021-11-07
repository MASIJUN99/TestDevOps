package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @Autowired
  StringRedisTemplate redisTemplate;

  @RequestMapping("/test")
  public String hello() {
    Long viewCount = redisTemplate.opsForValue().increment("count_view");
    return "有" + viewCount + "人访问了这个页面" ;
  }

}
