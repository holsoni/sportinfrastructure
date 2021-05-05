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

package edu.coursework.sportinfrastructure.service.sportClub;



import edu.coursework.sportinfrastructure.model.Sport;
import edu.coursework.sportinfrastructure.model.SportClub;
import edu.coursework.sportinfrastructure.model.Sportsmen;

import java.util.List;

public interface ISportClubService {

    SportClub getById(String id);
    SportClub create(SportClub sportClub);
    SportClub update(SportClub sportClub);
    SportClub delete(String id);
    List<SportClub> getAll();
}
