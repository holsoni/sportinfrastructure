/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * com.sportinfrastucture.coursework.model.PlayTen
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 01.04.21, 21:26
 *  * @Version PlayTen.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;
@Data
public class PlayTen {
    private String id;
    private String name;
    private String address;
    private String coating;

    private LocalDateTime created_at;
    private LocalDateTime modified_at;
    private String description;
}
