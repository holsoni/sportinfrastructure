/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.repository.GymnasticGym.GymnasticGymRepository
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 02.06.21, 00:04
 *  * @Version GymnasticGymRepository.java : 1.0
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

package edu.coursework.sportinfrastructure.repository.GymnasticGym;

import edu.coursework.sportinfrastructure.model.Gym;
import edu.coursework.sportinfrastructure.model.GymnasticGym;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GymnasticGymRepository extends MongoRepository<GymnasticGym, String> {

}
