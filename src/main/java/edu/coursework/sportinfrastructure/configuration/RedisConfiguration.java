/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.configuration.RedisConfiguration
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 06.05.21, 08:41
 *  * @Version RedisConfiguration.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.Jedis;

@Configuration
@EnableRedisRepositories
public class RedisConfiguration {
    @Bean
    public Jedis jedis(){
        return new Jedis("localhost", 6379);
    };
}
