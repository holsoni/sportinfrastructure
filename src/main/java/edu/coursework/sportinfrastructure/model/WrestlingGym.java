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

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;
@Data
@RequiredArgsConstructor
//@Document(collection = "wrestlingGyms")
@Entity
@Table(name = "wrestling_gym")
public class WrestlingGym {
    @Id
    @Column(name="id")
    private String id;
    @Column(name="name")
    private String name;
    @Column(name="adress")
    private String address;
    @Column(name="amount_of_carpets")
    private int amountOfCarpets;

    @Column(name="created_at")
    private Date createdAt;
    @Column(name="modified_at")
    private Date modifiedAt;
    @Column(name="description")
    private String description;

}
