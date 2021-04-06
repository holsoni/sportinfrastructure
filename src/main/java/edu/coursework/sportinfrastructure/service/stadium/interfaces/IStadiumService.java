package edu.coursework.sportinfrastructure.service.stadium.interfaces;

import edu.coursework.sportinfrastructure.model.Stadium;

import java.util.List;

public interface IStadiumService {

    Stadium getById(String id);
    Stadium create(Stadium stadium);
    Stadium update(Stadium stadium);
    Stadium delete(String id);
    Stadium save(Stadium stadium);
    List<Stadium> getAll();
}

