/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.service.sportInfrastructure.ISsportInfrastructureServiceImpl
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 28.04.21, 00:27
 *  * @Version ISsportInfrastructureServiceImpl.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.service.sportInfrastructure;

import edu.coursework.sportinfrastructure.model.SportInfrastructure;
import edu.coursework.sportinfrastructure.model.Stadium;
import edu.coursework.sportinfrastructure.repository.SportInfrastructure.SportInfrastructureRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class SportInfrastructureServiceImpl implements ISsportInfrastructureService {

    @Autowired
    SportInfrastructureRepository repository;
    @Override
    public SportInfrastructure getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public SportInfrastructure create(SportInfrastructure sportInfrastructure) {
        sportInfrastructure.setCreatedAt(new Date());
        return repository.save(sportInfrastructure);
    }

    @Override
    public SportInfrastructure update(SportInfrastructure sportInfrastructure) {String id = sportInfrastructure.getId();
        SportInfrastructure courtDB = repository.findById(id).orElse(null);
        Date createdAt = courtDB.getCreatedAt();
        sportInfrastructure.setModifiedAt(new Date());
        sportInfrastructure.setCreatedAt(createdAt);
        repository.save(sportInfrastructure);
        return sportInfrastructure;
    }

    @Override
    public SportInfrastructure delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<SportInfrastructure> getAll() {
        return repository.findAll();
    }
}
