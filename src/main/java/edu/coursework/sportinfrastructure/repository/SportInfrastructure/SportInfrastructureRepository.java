/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.repository.SportInfrastructure.SportInfrastructureRepository
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 02.06.21, 00:04
 *  * @Version SportInfrastructureRepository.java : 1.0
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

package edu.coursework.sportinfrastructure.repository.SportInfrastructure;

import edu.coursework.sportinfrastructure.model.Gym;
import edu.coursework.sportinfrastructure.model.SportInfrastructure;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportInfrastructureRepository extends MongoRepository<SportInfrastructure, String> {

}
