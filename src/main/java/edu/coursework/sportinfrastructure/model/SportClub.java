/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * com.sportinfrastucture.coursework.model.SportCLub
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 01.04.21, 21:11
 *  * @Version SportCLub.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@Document(collection = "sportClubs")
public class SportClub implements Serializable{
    private String id;
    private String name;
    private int foundationYear;
    private String creator;
    private String city;
    private int amountOfSportsmen;
    private int amountOfCouches;
    private int amountOfSports;

    private LocalDateTime created_at;
    private LocalDateTime modified_at;
    private String description;


}
