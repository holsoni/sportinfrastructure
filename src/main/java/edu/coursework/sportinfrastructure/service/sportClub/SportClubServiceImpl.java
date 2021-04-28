/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.service.sportClub.ISportClubServiceImpl
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 28.04.21, 00:27
 *  * @Version ISportClubServiceImpl.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.service.sportClub;

import edu.coursework.sportinfrastructure.model.SportClub;
import edu.coursework.sportinfrastructure.repository.sportClub.SportClubRepository;
import edu.coursework.sportinfrastructure.repository.sportsmen.SportsmenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SportClubServiceImpl implements ISportClubService {

    @Autowired
    SportClubRepository repository;

    @Override
    public SportClub getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public SportClub create(SportClub sportClub) {
        sportClub.setCreatedAt(new Date());
        return repository.save(sportClub);
    }

    @Override
    public SportClub update(SportClub sportClub) {
        sportClub.setModifiedAt(new Date());
        return repository.save(sportClub);
    }

    @Override
    public SportClub delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<SportClub> getAll() {
        return repository.findAll();
    }
}
