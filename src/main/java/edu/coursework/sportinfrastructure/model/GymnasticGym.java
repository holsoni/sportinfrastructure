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
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
@RedisHash("GymnasticGym")
public class GymnasticGym implements Serializable {
    @Id
    private String id;
    private String name;
    private String address;
    private int area;
    private int equipment;

    private Date createdAt;
    private Date modifiedAt;
    private String description;
}
