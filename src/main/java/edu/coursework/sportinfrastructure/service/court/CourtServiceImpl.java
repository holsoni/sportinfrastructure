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


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class CourtServiceImpl implements ICourtService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CourtServiceImpl.class);
    @Autowired
    CourtRepository repository;

    @Override
    public Court getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Court create(Court court) {

        LOGGER.info("Got all courts at " + new Date());
        court.setCreatedAt(new Date());
        return repository.save(court);
    }

    @Override
    public Court update(Court court) { String id = court.getId();
        Court courtDB = repository.findById(id).orElse(null);
        Date createdAt = courtDB.getCreatedAt();
        court.setModifiedAt(new Date());
        court.setCreatedAt(createdAt);
        repository.save(court);
        return court;
    }

    @Override
    public Court delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Court> getAll() {
        LOGGER.info("Got all courts at " + new Date());
        return repository.findAll();
    }

    public List<Court> getByAmountOfCourts(int numOfCourts) {

        return repository.findAllByAmountOfCourts(numOfCourts);
    }
}
