/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.model.Building
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 07.06.21, 21:02
 *  * @Version Building.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "building")
public class Building {

    @Id
    private String id;
    private String name;
    private String address;

    private Date createdAt;
    private Date modifiedAt;
    private String description;
}
