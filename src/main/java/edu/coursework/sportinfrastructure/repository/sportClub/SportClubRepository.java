/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.repository.sportClub.SportClubRepository
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 02.06.21, 00:04
 *  * @Version SportClubRepository.java : 1.0
 *
 */

/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.repository.sportsmen.SportsmenRepository
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 27.04.21, 20:32
 *  * @Version GymnasticGym.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.repository.sportClub;

import edu.coursework.sportinfrastructure.model.Gym;
import edu.coursework.sportinfrastructure.model.SportClub;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportClubRepository extends MongoRepository<SportClub, String> {

}
