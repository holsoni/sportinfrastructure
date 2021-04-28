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

package edu.coursework.sportinfrastructure.service.sportInfrastructure;



import edu.coursework.sportinfrastructure.model.SportInfrastructure;
import edu.coursework.sportinfrastructure.model.Sportsmen;

import java.util.List;

public interface ISsportInfrastructureService {

    SportInfrastructure getById(String id);
    SportInfrastructure create(SportInfrastructure sportInfrastructure);
    SportInfrastructure update(SportInfrastructure sportInfrastructure);
    SportInfrastructure delete(String id);
    List<SportInfrastructure> getAll();
}
