/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * com.sportinfrastucture.coursework.model.Sportsmen
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 01.04.21, 21:11
 *  * @Version Sportsmen.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
public class Sportsmen {
    private UUID _id;
    private String name;
    private int age;
    private Sport sport;
    private Degree degree;
    private SportClub sportClub;
    private int rating;

    private LocalDateTime created_at;
    private LocalDateTime modified_at;
    private String description;
}
