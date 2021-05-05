/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * com.sportinfrastucture.coursework.model.Coach
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 01.04.21, 21:11
 *  * @Version Coach.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "coach")
public class Coach {
    @Id
    private String id;
    private String name;
    private int age;
    private Sport sport;
    private SportClub sportClub;

    private Date createdAt;
    private Date modifiedAt;
    private String description;

    public Coach(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getSportClubName(){
        return sportClub.getName();
    }
}
