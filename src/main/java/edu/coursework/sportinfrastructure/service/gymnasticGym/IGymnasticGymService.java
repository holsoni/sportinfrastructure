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

import java.util.List;
import java.util.Map;

public interface IGymnasticGymService {


    GymnasticGym save(GymnasticGym gymnasticGym);
    GymnasticGym findById(String id);
    List<GymnasticGym> findAll();
    GymnasticGym delete(String id);
}
