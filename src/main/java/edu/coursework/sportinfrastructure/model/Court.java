/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * com.sportinfrastucture.coursework.model.Courts
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 01.04.21, 21:25
 *  * @Version Courts.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Court {
    private UUID _id;
    private String name;
    private String address;
    private int area;
    private int amountOfCourts;
    private String coating;
    private LocalDateTime created_at;
    private LocalDateTime modified_at;
}
