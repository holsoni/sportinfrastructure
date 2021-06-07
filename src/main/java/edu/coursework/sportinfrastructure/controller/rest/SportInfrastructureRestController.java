/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.controller.rest.SportInfrastructureRestController
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 28.04.21, 08:40
 *  * @Version SportInfrastructureRestController.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.controller.rest;

import edu.coursework.sportinfrastructure.model.*;
import edu.coursework.sportinfrastructure.service.court.CourtServiceImpl;
import edu.coursework.sportinfrastructure.service.gymnasticGym.GymnasticGymServiceImpl;
import edu.coursework.sportinfrastructure.service.playTen.PlayTenServiceImpl;
import edu.coursework.sportinfrastructure.service.sportArena.SportArenaServiceImpl;
import edu.coursework.sportinfrastructure.service.sportClub.SportClubServiceImpl;
import edu.coursework.sportinfrastructure.service.sportInfrastructure.SportInfrastructureServiceImpl;
import edu.coursework.sportinfrastructure.service.sportsmen.SportsmenServiceImpl;
import edu.coursework.sportinfrastructure.service.stadium.impls.StadiumServiceImpl;
import edu.coursework.sportinfrastructure.service.wrestlingGym.WrestlingGymServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Tag(name = "Sport infrastructure controler API")
@RestController
@RequestMapping("api/sportInfrastructure")
public class SportInfrastructureRestController {

    @Autowired
    SportInfrastructureServiceImpl service;
    @Autowired
    SportClubServiceImpl sportClubService;

    @Autowired
    StadiumServiceImpl stadiumService;

    @Autowired
    WrestlingGymServiceImpl wrestlingGymService;

    @Autowired
    GymnasticGymServiceImpl gymnasticGymService;

    @Autowired
    SportArenaServiceImpl sportArenaService;

    @Autowired
    PlayTenServiceImpl playTenService;

    @Autowired
    CourtServiceImpl courtService;


    @GetMapping("/get/all")
    public List<SportInfrastructure> getAll(){
        return service.getAll() ;
    }
    @GetMapping("/get/buildings")
    public List<Object> buildings(){
        SportInfrastructure sportInfrastructure= new SportInfrastructure();
        List<SportClub> sportClubs = sportClubService.getAll();
        List<Stadium> stadiums = stadiumService.getAll();
        List<Court> courts = courtService.getAll();
        List<GymnasticGym> gymnasticGyms = gymnasticGymService.getAll();
        List<WrestlingGym> wrestlingGyms = wrestlingGymService.getAll();

        List<SportArena> sportArenas = sportArenaService.getAll();

        List<Object> buildings = new ArrayList<>();
        buildings.addAll(stadiums);
        buildings.addAll(sportClubs);
        buildings.addAll(courts);
        buildings.addAll(gymnasticGyms);
        buildings.addAll(wrestlingGyms);
        buildings.addAll(sportArenas);

        return buildings;
    }

    @GetMapping("/get/{id}")
    public SportInfrastructure getById(@PathVariable("id") String id){
        return service.getById(id);
    }

    @Operation(summary = "Sport infrastructure delete")
    @GetMapping("/delete/{id}")
    public SportInfrastructure deleteById(@PathVariable("id")  String id){
        return service.delete(id);
    }

    @Operation(summary = "Sport infrastructure creation")
    @PostMapping("/create/")
    public SportInfrastructure create(@RequestBody SportInfrastructure sportInfrastructure){
        return service.create(sportInfrastructure);
    }

    @Operation(summary = "Sport infrastructure update")
    @PostMapping ("/update/")
    public SportInfrastructure update(@RequestBody SportInfrastructure sportInfrastructure){
        return service.update(sportInfrastructure);
    }
}
