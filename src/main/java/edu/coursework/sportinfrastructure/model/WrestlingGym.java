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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "wrestlingGyms")
public class WrestlingGym {
    private String id;
    private Building building;
    private int amountOfCarpets;

    private Date createdAt;
    private Date modifiedAt;
    private String description;
}
