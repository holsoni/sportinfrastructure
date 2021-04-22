/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * com.sportinfrastucture.coursework.model.WrestlingGym
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 01.04.21, 21:12
 *  * @Version WrestlingGym.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;
@Data
public class WrestlingGym {
    private UUID _id;
    private String name;
    private String address;
    private int area;
    private int amountOfCarpets;

    private LocalDateTime created_at;
    private LocalDateTime modified_at;
    private String description;
}
