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

package edu.coursework.sportinfrastructure.service.gym;



import edu.coursework.sportinfrastructure.model.Gym;
import edu.coursework.sportinfrastructure.model.Sportsmen;

import java.util.List;

public interface IGymService {

    Gym getById(String id);
    Gym create(Gym gym);
    Gym update(Gym gym);
    Gym delete(String id);
    List<Gym> getAll();
}
