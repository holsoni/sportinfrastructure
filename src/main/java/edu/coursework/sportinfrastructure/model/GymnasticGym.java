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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Document(collection = "gymnasticGyms")
@Entity
@Table(name = "gymnastic_gym")
public class GymnasticGym {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "area")
    private int area;
    @Column(name = "equipment")
    private int equipment;

    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "modified_at")
    private Date modifiedAt;
    @Column(name = "description")
    private String description;
}
