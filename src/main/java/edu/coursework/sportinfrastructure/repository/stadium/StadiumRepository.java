/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.repository.stadium.StadiumRepository
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 06.04.21, 12:33
 *  * @Version StadiumRepository.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.repository.stadium;

import edu.coursework.sportinfrastructure.model.Stadium;
import org.springframework.data.mongodb.repository.MongoRepository;


import java.util.List;

public interface StadiumRepository extends MongoRepository<Stadium, String> {


}
