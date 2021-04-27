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
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource(path = "/stadiums")
public interface StadiumRepository extends JpaRepository<Stadium, String> {


}
