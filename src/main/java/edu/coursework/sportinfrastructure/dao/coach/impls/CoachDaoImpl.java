package edu.coursework.sportinfrastructure.dao.coach.impls;

import edu.coursework.sportinfrastructure.dao.coach.interfaces.ICoachDao;
import edu.coursework.sportinfrastructure.data.FakeData;
import edu.coursework.sportinfrastructure.model.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CoachDaoImpl implements ICoachDao {

    @Autowired
    FakeData fakeData;


    @Override
    public List<Coach> getALL() {
        return null;
    }
}
