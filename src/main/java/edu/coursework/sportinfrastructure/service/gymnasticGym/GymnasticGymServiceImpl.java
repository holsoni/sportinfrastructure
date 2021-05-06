/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.service.gymnasticGym.IGymnasticGymServiceImpl
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 28.04.21, 00:26
 *  * @Version IGymnasticGymServiceImpl.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.service.gymnasticGym;

import edu.coursework.sportinfrastructure.model.GymnasticGym;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

@Service
public class GymnasticGymServiceImpl implements IGymnasticGymService {

    public static final String HASH_KEY = "GymnasticGym";
    @Autowired
    private RedisTemplate template;


    @Override
    public GymnasticGym save(GymnasticGym gymnasticGym) {
        template.opsForHash().put(HASH_KEY,gymnasticGym.getId(),gymnasticGym);
        return gymnasticGym;
    }

    @Override
    public GymnasticGym findById(String id) {
        return (GymnasticGym) template.opsForHash().get(HASH_KEY,id);
    }

    @Override
    public List<GymnasticGym> findAll() {
        return template.opsForHash().values(HASH_KEY);
    }

    @Override
    public GymnasticGym delete(String id) {
        template.opsForHash().delete(HASH_KEY,id);
        return (GymnasticGym) template.opsForHash().get(HASH_KEY,id);
    }
}
