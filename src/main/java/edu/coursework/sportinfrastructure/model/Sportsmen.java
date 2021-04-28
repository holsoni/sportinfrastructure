/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * com.sportinfrastucture.coursework.model.Sportsmen
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 01.04.21, 21:11
 *  * @Version Sportsmen.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.model;

import lombok.Builder;
import lombok.Data;

import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.*;

@Data
@RequiredArgsConstructor
@Document(collection = "sportsmen")
public class Sportsmen {
    @Id
    private String id;
    private String name;
    private int age;
    private SportClub sportClub;
    private List<SportAndDegree> sportAndDegree;

    private Date createdAt;
    private Date modifiedAt;
    private String description;

    public Sportsmen(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
