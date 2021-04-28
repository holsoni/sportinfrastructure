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
import edu.coursework.sportinfrastructure.repository.sportArena.SportArenaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return repository.save(sportArena);
    }

    @Override
    public SportArena update(SportArena sportArena) {
        return repository.save(sportArena);
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
