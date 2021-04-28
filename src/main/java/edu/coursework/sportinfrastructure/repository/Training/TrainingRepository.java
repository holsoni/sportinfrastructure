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

package edu.coursework.sportinfrastructure.repository.Training;

import edu.coursework.sportinfrastructure.model.Gym;
import edu.coursework.sportinfrastructure.model.Training;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingRepository extends MongoRepository<Training, String> {

}
