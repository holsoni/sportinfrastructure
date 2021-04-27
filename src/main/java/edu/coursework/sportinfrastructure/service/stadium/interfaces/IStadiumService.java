package edu.coursework.sportinfrastructure.service.stadium.interfaces;

import edu.coursework.sportinfrastructure.model.Stadium;

import java.util.List;
import java.util.Optional;

public interface IStadiumService {

    Optional<Stadium> getById(String id);
    Stadium create(Stadium stadium);
    Stadium update(Stadium stadium);
    void delete(String id);
    Stadium save(Stadium stadium);
    List<Stadium> getAll();
}

