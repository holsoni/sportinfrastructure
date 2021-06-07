/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.service.building.IPlayTenService
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 05.05.21, 12:21
 *  * @Version IPlayTenService.java : 1.0
 *
 */

/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * com.sportinfrastucture.coursework.service.coach.interfaces.ICoachService
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 01.04.21, 22:27
 *  * @Version ICoachService.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.service.building;



import edu.coursework.sportinfrastructure.model.Building;
import edu.coursework.sportinfrastructure.model.PlayTen;

import java.util.List;

public interface IBuildingService {

    Building getById(String id);
    Building create(Building building);
    Building update(Building building);
    Building delete(String id);
    List<Building> getAll();
}
