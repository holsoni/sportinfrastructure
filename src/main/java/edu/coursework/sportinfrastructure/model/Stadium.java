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

import lombok.Data;
import lombok.NonNull;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Document(collection = "stadium")

public class Stadium {
    private String Id;
    private String name;
    private String address;
    private int capacity;
    private int amountOfTracks;
    private int length;
    private String trackCoating;
    private LocalDateTime created_at;
    private LocalDateTime modified_at;

    public Stadium() {
    }

    public Stadium(String name, String address, int capacity, int amountOfTracks, int length, String trackCoating, LocalDateTime created_at, LocalDateTime modified_at) {
        this.name = name;
        this.address = address;
        this.capacity = capacity;
        this.amountOfTracks = amountOfTracks;
        this.length = length;
        this.trackCoating = trackCoating;
        this.created_at = created_at;
        this.modified_at = modified_at;
    }


    public Stadium(String id, String name, String address, int capacity, int amountOfTracks, int length, String trackCoating, LocalDateTime created_at, LocalDateTime modified_at) {
        Id = id;
        this.name = name;
        this.address = address;
        this.capacity = capacity;
        this.amountOfTracks = amountOfTracks;
        this.length = length;
        this.trackCoating = trackCoating;
        this.created_at = created_at;
        this.modified_at = modified_at;
    }
}
