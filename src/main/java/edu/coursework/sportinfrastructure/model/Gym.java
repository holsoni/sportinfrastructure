/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * com.sportinfrastucture.coursework.model.Gym
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 01.04.21, 21:25
 *  * @Version Gym.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Gym {
    private UUID _id;
    private String name;
    private String address;
    private int area;
    private int amountOfSimulators;
    private String extra;
    private LocalDateTime created_at;
    private LocalDateTime modified_at;
}
