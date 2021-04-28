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

package edu.coursework.sportinfrastructure.service.wrestlingGym;



import edu.coursework.sportinfrastructure.model.Sportsmen;
import edu.coursework.sportinfrastructure.model.WrestlingGym;

import java.util.List;

public interface IWrestlingGymService {

    WrestlingGym getById(String id);
    WrestlingGym create(WrestlingGym wrestlingGym);
    WrestlingGym update(WrestlingGym wrestlingGym);
    WrestlingGym delete(String id);
    List<WrestlingGym> getAll();
}
