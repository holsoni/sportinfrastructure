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
@Document(collection = "competition")
public class Competition {
    @Id
    private String id;
    private String name;
    private Sport sport;
    private String city;
    private CompetitionOrganizer competitionOrganizer;
    private Building place;
    private int events;
    private Date date;

    private Date createdAt;
    private Date modifiedAt;
    private String description;


}
