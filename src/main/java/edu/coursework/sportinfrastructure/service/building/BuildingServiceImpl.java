/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.service.building.PlayTenServiceImpl
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 07.06.21, 21:06
 *  * @Version PlayTenServiceImpl.java : 1.0
 *
 */

/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.service.playTen.IPlayTenServiceImpl
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 28.04.21, 00:27
 *  * @Version IPlayTenServiceImpl.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.service.building;

import edu.coursework.sportinfrastructure.model.Building;
import edu.coursework.sportinfrastructure.model.PlayTen;
import edu.coursework.sportinfrastructure.repository.PlayTene.PlayTenRepository;
import edu.coursework.sportinfrastructure.repository.building.BuildingRepository;
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
        building.setCreatedAt(new Date());
        return repository.save(building);
    }

    @Override
    public Building update(Building building) {String id = building.getId();
        Building courtDB = repository.findById(id).orElse(null);
        Date createdAt = courtDB.getCreatedAt();
        building.setModifiedAt(new Date());
        building.setCreatedAt(createdAt);
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
