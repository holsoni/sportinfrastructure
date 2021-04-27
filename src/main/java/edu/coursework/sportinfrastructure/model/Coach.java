/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * com.sportinfrastucture.coursework.model.Coach
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 01.04.21, 21:11
 *  * @Version Coach.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.model;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@RequiredArgsConstructor
public class Coach {
    @NonNull private String id;
    @NonNull private String name;
    @NonNull private int age;
    private Sport sport;
    private SportClub sportClub;
    private int hourlyWage;
    private int hoursPerWeek;

    private LocalDateTime created_at;
    private LocalDateTime modified_at;
    private String description;

}
