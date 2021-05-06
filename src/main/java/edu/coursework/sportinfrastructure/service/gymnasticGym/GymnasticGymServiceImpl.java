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

import com.google.gson.Gson;
import edu.coursework.sportinfrastructure.model.GymnasticGym;
import lombok.var;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GymnasticGymServiceImpl implements IGymnasticGymService {

    private static final Jedis jedis = new Jedis("localhost", 6379);
    private static final Gson gson = new Gson();


    @Override
    public GymnasticGym save(GymnasticGym gymnasticGym) {
        jedis.rpush("GymnasticGym.", String.valueOf(gymnasticGym.getId()));
        jedis.set("GymnasticGym." + gymnasticGym.getId(), gson.toJson(gymnasticGym));
        return gymnasticGym;
    }

    @Override
    public GymnasticGym findById(Long id) {
        var json = jedis.get("GymnasticGym." + id);
        return parseGym(json);
    }

    @Override
    public List<GymnasticGym> findAll() {
        var coaches = jedis.lrange("coach", 0, -1);
        return coaches.stream()
                .map(id -> findById(Long.parseLong(id)))
                .collect(Collectors.toList());
    }

    @Override
    public GymnasticGym delete(GymnasticGym gymnasticGym) {
        jedis.lrem("GymnasticGym.", 1, String.valueOf(gymnasticGym.getId()));
        jedis.del("GymnasticGym." + gymnasticGym.getId());
        return gymnasticGym;
    }
    @Override
    public void update(GymnasticGym gymnasticGym){
        jedis.set("GymnasticGym." + gymnasticGym.getId(), gson.toJson(gymnasticGym));
    }
    private GymnasticGym parseGym(String json){
        return gson.fromJson(json, GymnasticGym.class);
    }
}
