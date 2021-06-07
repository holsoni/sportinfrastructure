/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.repository.BuildingRepository
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 07.06.21, 10:41
 *  * @Version BuildingRepository.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.repository;

import edu.coursework.sportinfrastructure.model.Building;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingRepository extends MongoRepository<Building, String> {
}
