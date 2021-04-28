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

package edu.coursework.sportinfrastructure.service.gymnasticGym;



import edu.coursework.sportinfrastructure.model.GymnasticGym;
import edu.coursework.sportinfrastructure.model.Sportsmen;

import java.util.List;

public interface IGymnasticGymService {

    GymnasticGym getById(String id);
    GymnasticGym create(GymnasticGym gymnasticGym);
    GymnasticGym update(GymnasticGym gymnasticGym);
    GymnasticGym delete(String id);
    List<GymnasticGym> getAll();
}
