/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.model.SportInfrastructure
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 27.04.21, 18:47
 *  * @Version SportInfrastructure.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "sportInfrastructure")
public class SportInfrastructure {

    @Id
    private String id;
    private Stadium stadium;
    private SportArena sportArena;
    private Gym gym;
    private Court court;
    private WrestlingGym wrestlingGym;
    private PlayTen playTen;
    private GymnasticGym gymnasticGym;

    private Date createdAt;
    private Date modifiedAt;
    private String description;

}
