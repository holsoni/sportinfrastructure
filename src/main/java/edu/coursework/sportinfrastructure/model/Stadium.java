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
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Stadium Document")

public class Stadium {

    private String Id;
    @Schema(description = "Cтадіон ...........")
    private String name;

    private String address;
    private int capacity;
    private int amountOfTracks;
    private int length;
    private String trackCoating;

    private LocalDateTime created_at;
    private LocalDateTime modified_at;
    private String description;

    public Stadium(String id, String name, String address, int capacity, int amountOfTracks, int length, String trackCoating) {
        Id = id;
        this.name = name;
        this.address = address;
        this.capacity = capacity;
        this.amountOfTracks = amountOfTracks;
        this.length = length;
        this.trackCoating = trackCoating;
        this.created_at = LocalDateTime.now();
    }

}
