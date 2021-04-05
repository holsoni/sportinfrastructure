package edu.coursework.sportinfrastructure.service.coach.impls;

import edu.coursework.sportinfrastructure.dao.coach.impls.CoachDaoImpl;
import edu.coursework.sportinfrastructure.model.Coach;
import edu.coursework.sportinfrastructure.service.coach.interfaces.ICoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoachServiceImpl implements ICoachService {
    @Autowired
    CoachDaoImpl coachDao;

    @Override
    public Coach getById(String id) {
        return null;
    }

    @Override
    public Coach create(Coach coach) {
        return null;
    }

    @Override
    public Coach update(Coach coach) {
        return null;
    }

    @Override
    public Coach delete(String id) {
        return null;
    }

    @Override
    public List<Coach> getALl() {
        return null;
    }
}
