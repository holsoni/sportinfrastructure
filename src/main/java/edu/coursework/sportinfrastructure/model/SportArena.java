/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * com.sportinfrastucture.coursework.model.SportArena
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 01.04.21, 21:26
 *  * @Version SportArena.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
@Data
public class SportArena {
    private UUID _id;
    private String name;
    private String address;
    private int area;
    private int capacity;
    private List<Sport> sport;

    private LocalDateTime created_at;
    private LocalDateTime modified_at;
    private String description;
}
