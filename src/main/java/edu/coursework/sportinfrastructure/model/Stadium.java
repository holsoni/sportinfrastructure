/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * com.sportinfrastucture.coursework.model.Stadium
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 01.04.21, 21:11
 *  * @Version Stadium.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "stadium")

public class Stadium {

    @org.springframework.data.annotation.Id
    private String Id;
    private String name;

    private String address;
    private int capacity;
    private int amountOfTracks;
    private int length;
    private String trackCoating;

    private Date createdAt;
    private Date modifiedAt;
    private String description;

}
