/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * com.sportinfrastucture.coursework.model.Gym
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 01.04.21, 21:25
 *  * @Version Gym.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "gym")
public class Gym {
    @Id
    private String id;
    private Building building;
    private int area;
    private int amountOfSimulators;
    private String extra;

    private Date createdAt;
    private Date modifiedAt;
    private String description;
}
