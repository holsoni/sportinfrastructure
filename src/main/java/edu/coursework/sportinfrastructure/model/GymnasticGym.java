/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * com.sportinfrastucture.coursework.model.GymnasticGym
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 01.04.21, 21:25
 *  * @Version GymnasticGym.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;
@Data
public class GymnasticGym {
    private UUID _id;
    private String name;
    private String address;
    private int area;
    private int equipment;

    private LocalDateTime created_at;
    private LocalDateTime modified_at;
    private String description;
}
