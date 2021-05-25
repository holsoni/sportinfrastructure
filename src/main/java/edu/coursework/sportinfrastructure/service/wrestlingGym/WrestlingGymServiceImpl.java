/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.service.wrestlingGym.WrestlingGymServiceImpl
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 28.04.21, 00:28
 *  * @Version WrestlingGymServiceImpl.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.service.wrestlingGym;

import edu.coursework.sportinfrastructure.model.WrestlingGym;
import edu.coursework.sportinfrastructure.repository.wrestlingGym.WrestlingGymRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class WrestlingGymServiceImpl implements IWrestlingGymService {

    @Autowired
    WrestlingGymRepository repository;

    @Override
    public WrestlingGym getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public WrestlingGym create(WrestlingGym wrestlingGym) {
        wrestlingGym.setCreatedAt(new Date());
        return repository.save(wrestlingGym);
    }

    @Override
    public WrestlingGym update(WrestlingGym wrestlingGym) {
        String id = wrestlingGym.getId();
        WrestlingGym courtDB = repository.findById(id).orElse(null);
        Date createdAt = courtDB.getCreatedAt();
        wrestlingGym.setModifiedAt(new Date());
        wrestlingGym.setCreatedAt(createdAt);
        repository.save(wrestlingGym);
        return wrestlingGym;
    }

    @Override
    public WrestlingGym delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<WrestlingGym> getAll() {
        return repository.findAll();
    }
}
