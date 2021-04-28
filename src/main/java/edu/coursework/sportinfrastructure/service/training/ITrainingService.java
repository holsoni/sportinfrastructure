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

package edu.coursework.sportinfrastructure.service.training;



import edu.coursework.sportinfrastructure.model.Sportsmen;
import edu.coursework.sportinfrastructure.model.Training;

import java.util.List;

public interface ITrainingService {

    Training getById(String id);
    Training create(Training training);
    Training update(Training training);
    Training delete(String id);
    List<Training> getAll();
}
