package edu.coursework.sportinfrastructure.dao.coach.interfaces;

import edu.coursework.sportinfrastructure.model.Coach;

import java.util.List;

public interface ICoachDao {
    //CRUD
    List<Coach> getALL();
}