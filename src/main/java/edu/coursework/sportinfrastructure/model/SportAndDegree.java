/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.model.SportAndDegree
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 27.04.21, 21:33
 *  * @Version SportAndDegree.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class SportAndDegree {

    private Sport sport;
    private Degree degree;

    public String getInfo(){
        return sport + " - " + degree + "; ";
    }
}

