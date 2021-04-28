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
import edu.coursework.sportinfrastructure.repository.GymnasticGym.GymnasticGymRepository;
import edu.coursework.sportinfrastructure.repository.sportsmen.SportsmenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class GymnasticGymServiceImpl implements IGymnasticGymService {

    @Autowired
    GymnasticGymRepository repository;

    @Override
    public GymnasticGym getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public GymnasticGym create(GymnasticGym gymnasticGym) {
        gymnasticGym.setCreatedAt(new Date());
        return repository.save(gymnasticGym);
    }

    @Override
    public GymnasticGym update(GymnasticGym gymnasticGym) {
        gymnasticGym.setModifiedAt(new Date());
        return repository.save(gymnasticGym);
    }

    @Override
    public GymnasticGym delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<GymnasticGym> getAll() {
        return (List<GymnasticGym>) repository.findAll();
    }
}
