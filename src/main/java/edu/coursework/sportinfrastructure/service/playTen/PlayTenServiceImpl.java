/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.service.playTen.IPlayTenServiceImpl
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 28.04.21, 00:27
 *  * @Version IPlayTenServiceImpl.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.service.playTen;

import edu.coursework.sportinfrastructure.model.PlayTen;
import edu.coursework.sportinfrastructure.model.SportArena;
import edu.coursework.sportinfrastructure.repository.PlayTene.PlayTenRepository;
import edu.coursework.sportinfrastructure.repository.sportsmen.SportsmenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class PlayTenServiceImpl implements IPlayTenService {

    @Autowired
    PlayTenRepository repository;

    @Override
    public PlayTen getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public PlayTen create(PlayTen playTen) {
        playTen.setCreatedAt(new Date());
        return repository.save(playTen);
    }

    @Override
    public PlayTen update(PlayTen playTen) {String id = playTen.getId();
        PlayTen courtDB = repository.findById(id).orElse(null);
        Date createdAt = courtDB.getCreatedAt();
        playTen.setModifiedAt(new Date());
        playTen.setCreatedAt(createdAt);
        repository.save(playTen);
        return playTen;
    }

    @Override
    public PlayTen delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<PlayTen> getAll() {
        return repository.findAll();
    }


}
