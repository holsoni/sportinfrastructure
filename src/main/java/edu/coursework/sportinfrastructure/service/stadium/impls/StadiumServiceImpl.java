package edu.coursework.sportinfrastructure.service.stadium.impls;

import edu.coursework.sportinfrastructure.model.Stadium;
import edu.coursework.sportinfrastructure.repository.stadium.StadiumRepository;
import edu.coursework.sportinfrastructure.service.stadium.interfaces.IStadiumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class StadiumServiceImpl implements IStadiumService {


    @Autowired
    StadiumRepository repository;

    @Override
    public Stadium getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Stadium create(Stadium stadium) {
        stadium.setCreatedAt(new Date());
        return repository.save(stadium);
    }

    @Override
    public Stadium update(Stadium stadium) {
        stadium.setModifiedAt(new Date());
        return repository.save(stadium);
    }

    @Override
    public Stadium delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Stadium> getAll() {
        return repository.findAll();
    }
}
