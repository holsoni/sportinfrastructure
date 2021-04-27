package edu.coursework.sportinfrastructure.service.stadium.impls;

import edu.coursework.sportinfrastructure.dao.stadium.impls.StadiumDaoImpl;
import edu.coursework.sportinfrastructure.data.FakeData;
import edu.coursework.sportinfrastructure.model.Stadium;
import edu.coursework.sportinfrastructure.repository.stadium.StadiumRepository;
import edu.coursework.sportinfrastructure.service.stadium.interfaces.IStadiumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StadiumServiceImpl implements IStadiumService {

    @Autowired
    FakeData fakeData;

    @Autowired
    StadiumDaoImpl dao;

    @Autowired
    StadiumRepository stadiumRepository;

    @Override
    public Optional<Stadium> getById(String id) {
        return stadiumRepository.findById(id);
    }

    @Override
    public Stadium create(Stadium stadium) {
        return stadiumRepository.save(stadium);
    }

    @Override
    public Stadium update(Stadium stadium) {
        return stadiumRepository.save(stadium);
    }

    @Override
    public void delete(String id) {
        stadiumRepository.deleteById(id);
    }

    @Override
    public Stadium save(Stadium stadium) {
        return null;
    }

    @Override
    public List<Stadium> getAll() {
        return stadiumRepository.findAll();
    }
}
