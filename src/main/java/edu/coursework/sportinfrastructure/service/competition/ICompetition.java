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

package edu.coursework.sportinfrastructure.service.competition;



import edu.coursework.sportinfrastructure.model.Competition;

import java.util.List;

public interface ICompetition {

    Competition getById(String id);
    Competition create(Competition competition);
    Competition update(Competition competition);
    Competition delete(String id);
    List<Competition> getAll();
}
