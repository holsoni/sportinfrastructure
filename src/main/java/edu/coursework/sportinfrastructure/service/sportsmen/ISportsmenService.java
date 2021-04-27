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

package edu.coursework.sportinfrastructure.service.sportsmen;



import edu.coursework.sportinfrastructure.model.Coach;
import edu.coursework.sportinfrastructure.model.Sportsmen;

import java.util.List;

public interface ISportsmenService {

    Sportsmen getById(String id);
    Sportsmen create(Sportsmen sportsmen);
    Sportsmen update(Sportsmen sportsmen);
    Sportsmen delete(String id);
    List<Sportsmen> getAll();
}
