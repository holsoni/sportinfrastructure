package edu.coursework.sportinfrastructure.service.stadium.impls;

import edu.coursework.sportinfrastructure.dao.stadium.impls.StadiumDaoImpl;
import edu.coursework.sportinfrastructure.data.FakeData;
import edu.coursework.sportinfrastructure.model.Stadium;
import edu.coursework.sportinfrastructure.service.stadium.interfaces.IStadiumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StadiumServiceImpl implements IStadiumService {

    @Autowired
    FakeData fakeData;

    @Autowired
    StadiumDaoImpl dao;

    @Override
    public Stadium getById(String id) {
        return dao.getById(id);
    }

    @Override
    public Stadium create(Stadium stadium) {
        return dao.create(stadium);
    }

    @Override
    public Stadium update(Stadium stadium) {
        return dao.update(stadium);
    }

    @Override
    public void delete(String id) {
         dao.delete(id);
    }

    @Override
    public Stadium save(Stadium stadium) {
        return null;
    }

    @Override
    public List<Stadium> getAll() {
        return dao.getAll();
    }
}
