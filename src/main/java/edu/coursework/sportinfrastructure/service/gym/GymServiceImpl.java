/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.service.gym.IGymServiceImpl
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 28.04.21, 00:28
 *  * @Version IGymServiceImpl.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.service.gym;

import edu.coursework.sportinfrastructure.model.Gym;
import edu.coursework.sportinfrastructure.repository.gym.GymRepository;
import edu.coursework.sportinfrastructure.repository.sportsmen.SportsmenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class GymServiceImpl implements IGymService {
    @Autowired
    GymRepository repository;

    @Override
    public Gym getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Gym create(Gym gym) {
        gym.setCreatedAt(new Date());
        return repository.save(gym);
    }

    @Override
    public Gym update(Gym gym) {
        String id = gym.getId();
        Gym courtDB = repository.findById(id).orElse(null);
        Date createdAt = courtDB.getCreatedAt();
        gym.setModifiedAt(new Date());
        gym.setCreatedAt(createdAt);
        repository.save(gym);
        return gym;
    }

    @Override
    public Gym delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Gym> getAll() {
        return repository.findAll();
    }
}
