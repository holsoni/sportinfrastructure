/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * com.sportinfrastucture.coursework.model.Training
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 01.04.21, 21:26
 *  * @Version Training.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
@Data
public class Training {
    private String id;
    private Sport sport;
    private List<Sportsmen> sportsmen;
    private Coach coach;
    private SportInfrastructure sportInfrastructure;

    private LocalDateTime created_at;
    private LocalDateTime modified_at;
    private String description;

}
