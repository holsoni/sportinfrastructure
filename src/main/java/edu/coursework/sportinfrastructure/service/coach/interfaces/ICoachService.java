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

package edu.coursework.sportinfrastructure.service.coach.interfaces;



import edu.coursework.sportinfrastructure.model.Coach;

import java.awt.*;
import java.util.List;

public interface ICoachService {

    Coach getById(String id);
    Coach create(Coach coach);
    Coach update(Coach coach);
    Coach delete(String id);
    List<Coach> getAll();
}
