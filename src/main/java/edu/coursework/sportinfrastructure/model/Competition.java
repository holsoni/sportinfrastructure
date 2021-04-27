/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * com.sportinfrastucture.coursework.model.Competition
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 01.04.21, 21:24
 *  * @Version Competition.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Competition {
    private String id;
    private String name;
    private Sport sport;
    private String city;
    private CompetitionOrganizer competitionOrganizer;
    private int events;

    private LocalDateTime created_at;
    private LocalDateTime modified_at;
    private String description;


}
