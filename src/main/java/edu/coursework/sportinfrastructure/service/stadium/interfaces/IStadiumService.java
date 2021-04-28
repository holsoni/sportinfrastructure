package edu.coursework.sportinfrastructure.service.stadium.interfaces;

import edu.coursework.sportinfrastructure.model.Stadium;
import edu.coursework.sportinfrastructure.model.Training;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface IStadiumService  {

    Stadium getById(String id);
    Stadium save(Stadium stadium);
    Stadium delete(String id);
    List<Stadium> getAll();
}

