/**
 * 
 */
package com.yuxi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import redis.clients.jedis.Jedis;

/**
 * @author 86176
 *
 */
public class JedisTest {
     public static void main(String[] args) {
    	int a;
		Jedis jedis =new Jedis("192.168.1.100", 6379);
		Set<String> keys = jedis.keys("*");
		System.out.println(keys);
		System.out.println(jedis.type("k4"));
		jedis.close();
	}
}
