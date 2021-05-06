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

public interface IGymnasticGymService {


    GymnasticGym save(GymnasticGym gymnasticGym);
    void update(GymnasticGym gymnasticGym);
    GymnasticGym findById(Long id);
    List<GymnasticGym> findAll();
    GymnasticGym delete(GymnasticGym gymnasticGym);
}
