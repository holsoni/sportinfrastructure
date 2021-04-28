/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.service.court.ICourtServiceImpl
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 28.04.21, 00:28
 *  * @Version ICourtServiceImpl.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.service.court;

import edu.coursework.sportinfrastructure.model.Court;
import edu.coursework.sportinfrastructure.repository.court.CourtRepository;
import edu.coursework.sportinfrastructure.repository.sportsmen.SportsmenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourtServiceImpl implements ICourtService {

    @Autowired
    CourtRepository repository;

    @Override
    public Court getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Court create(Court court) {
        return repository.save(court);
    }

    @Override
    public Court update(Court court) {
        return repository.save(court);
    }

    @Override
    public Court delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Court> getAll() {
        return repository.findAll();
    }
}
