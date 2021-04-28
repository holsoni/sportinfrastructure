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

package edu.coursework.sportinfrastructure.service.playTen;



import edu.coursework.sportinfrastructure.model.PlayTen;
import edu.coursework.sportinfrastructure.model.Sportsmen;

import java.util.List;

public interface IPlayTenService {

    PlayTen getById(String id);
    PlayTen create(PlayTen playTen);
    PlayTen update(PlayTen playTen);
    PlayTen delete(String id);
    List<PlayTen> getAll();
}
