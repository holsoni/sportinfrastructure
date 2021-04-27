/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.model.SportInfrastructure
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 27.04.21, 18:47
 *  * @Version SportInfrastructure.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.model;

import lombok.Data;

@Data
public class SportInfrastructure {

    private String id;
    private Stadium stadium;
    private SportArena sportArena;
    private Gym gym;
    private Court court;
    private WrestlingGym wrestlingGym;
    private PlayTen playTen;
    private GymnasticGym gymnasticGym;

    public SportInfrastructure(String id, Stadium stadium) {
        this.id = id;
        this.stadium = stadium;
    }

    public SportInfrastructure(String id, SportArena sportArena) {
        this.id = id;
        this.sportArena = sportArena;
    }

    public SportInfrastructure(String id, Gym gym) {
        this.id = id;
        this.gym = gym;
    }

    public SportInfrastructure(String id, Court court) {
        this.id = id;
        this.court = court;
    }

    public SportInfrastructure(String id, PlayTen playTen) {
        this.id = id;
        this.playTen = playTen;
    }

    public SportInfrastructure(String id, WrestlingGym wrestlingGym) {
        this.id = id;
        this.wrestlingGym = wrestlingGym;
    }

    public SportInfrastructure(String id, GymnasticGym gymnasticGym) {
        this.id = id;
        this.gymnasticGym = gymnasticGym;
    }
}
