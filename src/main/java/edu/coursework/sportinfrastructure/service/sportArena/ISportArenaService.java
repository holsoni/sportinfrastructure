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

package edu.coursework.sportinfrastructure.service.sportArena;



import edu.coursework.sportinfrastructure.model.SportArena;
import edu.coursework.sportinfrastructure.model.Sportsmen;

import java.util.List;

public interface ISportArenaService {

    SportArena getById(String id);
    SportArena create(SportArena sportArena);
    SportArena update(SportArena sportArena);
    SportArena delete(String id);
    List<SportArena> getAll();
}
