/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.service.building.BuildingServiceImpl
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 07.06.21, 10:42
 *  * @Version BuildingServiceImpl.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.service.building;

import edu.coursework.sportinfrastructure.model.Building;
import edu.coursework.sportinfrastructure.model.Court;
import edu.coursework.sportinfrastructure.repository.BuildingRepository;
import edu.coursework.sportinfrastructure.repository.court.CourtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class BuildingServiceImpl implements IBuildingService {

    @Autowired
    BuildingRepository repository;
    @Override
    public Building getById(String id) {
        return repository.findById(id).orElse(null);

    }

    @Override
    public Building create(Building building) {

        return repository.save(building);
    }

    @Override
    public Building update(Building building) {

        repository.save(building);
        return building;
    }

    @Override
    public Building delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Building> getAll() {
        return repository.findAll();
    }
}
