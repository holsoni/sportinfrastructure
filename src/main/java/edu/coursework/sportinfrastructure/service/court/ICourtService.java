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

package edu.coursework.sportinfrastructure.service.court;



import edu.coursework.sportinfrastructure.model.Court;
import edu.coursework.sportinfrastructure.model.Sportsmen;

import java.util.List;

public interface ICourtService {

    Court getById(String id);
    Court create(Court court);
    Court update(Court court);
    Court delete(String id);
    List<Court> getAll();
}
