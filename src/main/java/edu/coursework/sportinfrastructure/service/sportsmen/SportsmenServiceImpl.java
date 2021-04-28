/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.service.sportsmen.SportsmenServiceImpl
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 27.04.21, 20:49
 *  * @Version SportsmenServiceImpl.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.service.sportsmen;

import edu.coursework.sportinfrastructure.data.FakeData;
import edu.coursework.sportinfrastructure.model.Sportsmen;
import edu.coursework.sportinfrastructure.repository.sportsmen.SportsmenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SportsmenServiceImpl implements ISportsmenService {

    @Autowired
    SportsmenRepository repository;

    @Override
    public Sportsmen getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Sportsmen create(Sportsmen sportsmen) {
        sportsmen.setCreatedAt(new Date());
        return repository.save(sportsmen);
    }

    @Override
    public Sportsmen update(Sportsmen sportsmen) {
        sportsmen.setModifiedAt(new Date());
        return repository.save(sportsmen);
    }

    @Override
    public Sportsmen delete(String id) { repository.deleteById(id);
    return null;
    }

    @Override
    public List<Sportsmen> getAll() {
        return repository.findAll();
    }
}
