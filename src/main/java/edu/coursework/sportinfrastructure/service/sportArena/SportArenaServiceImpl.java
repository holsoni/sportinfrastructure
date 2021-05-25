/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.service.sportArena.ISportArenaServiceImpl
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 28.04.21, 00:27
 *  * @Version ISportArenaServiceImpl.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.service.sportArena;

import edu.coursework.sportinfrastructure.model.SportArena;
import edu.coursework.sportinfrastructure.model.SportClub;
import edu.coursework.sportinfrastructure.repository.sportArena.SportArenaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class SportArenaServiceImpl implements ISportArenaService {

    @Autowired
    SportArenaRepository repository;

    @Override
    public SportArena getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public SportArena create(SportArena sportArena) {
        sportArena.setCreatedAt(new Date());
        return repository.save(sportArena);
    }

    @Override
    public SportArena update(SportArena sportArena) {String id = sportArena.getId();
        SportArena courtDB = repository.findById(id).orElse(null);
        Date createdAt = courtDB.getCreatedAt();
        sportArena.setModifiedAt(new Date());
        sportArena.setCreatedAt(createdAt);
        repository.save(sportArena);
        return sportArena;
    }

    @Override
    public SportArena delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<SportArena> getAll() {
        return repository.findAll();
    }
}
