package edu.coursework.sportinfrastructure.service.coach.impls;

import edu.coursework.sportinfrastructure.dao.coach.impls.CoachDaoImpl;
import edu.coursework.sportinfrastructure.model.Coach;
import edu.coursework.sportinfrastructure.model.Competition;
import edu.coursework.sportinfrastructure.repository.coach.CoachRepository;
import edu.coursework.sportinfrastructure.service.coach.interfaces.ICoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CoachServiceImpl implements ICoachService {
    @Autowired
    CoachRepository repository;

    @Override
    public Coach getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Coach create(Coach coach) {
        coach.setCreatedAt(new Date());
        return repository.save(coach);
    }

    @Override
    public Coach update(Coach coach) {
        String id = coach.getId();
        Coach courtDB = repository.findById(id).orElse(null);
        Date createdAt = courtDB.getCreatedAt();
        coach.setModifiedAt(new Date());
        coach.setCreatedAt(createdAt);
        repository.save(coach);
        return coach;
    }

    @Override
    public Coach delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Coach> getAll() {
        return repository.findAll();
    }
}
