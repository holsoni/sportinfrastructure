/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.controller.rest.CoachRestController
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 05.04.21, 19:37
 *  * @Version CoachRestController.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.controller.rest;

import edu.coursework.sportinfrastructure.model.Coach;
import edu.coursework.sportinfrastructure.service.coach.impls.CoachServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Tag(name = "Coach controler API")
@RestController
@RequestMapping("api/coaches")
public class CoachRestController {

    @Autowired
    CoachServiceImpl service;


    @Operation(summary = "Coach By Id")
    @GetMapping("/get/{id}")
    public Coach getById(@PathVariable("id") String id){
        return service.getById(id);
    }

    @Operation(summary = "Coach delete")
    @GetMapping("/delete/{id}")
    public Coach deleteById(@PathVariable("id")  String id){
        return service.delete(id);
    }

    @Operation(summary = "Coach creation")
    @PostMapping("/create/")
    public Coach create(@RequestBody Coach coach){
        return service.create(coach);
    }

    @Operation(summary = "Coach update")
    @PostMapping ("/update/")
    public Coach update(@RequestBody Coach coach){
        return service.update(coach);
    }
    @Operation(summary = "Get All")
    @GetMapping("/get/all")
    public List<Coach> getCoaches(){
        return service.getAll();
    }

    @GetMapping("/get/sport/{sport}")
    public List<Coach> getAllBySport(@PathVariable("sport")  String sport){
        return service.getAllBySport(sport);
    }

    @GetMapping("/get/year/{year}")
    public List<Coach> getAllByYear(@PathVariable("year")  int year){
        return service.getAllByYear(year);
    }

    @GetMapping("/get/numberOfCoaches/}")
    public Object getNumfOfCoaches(){
        return service.getNumfOfCoaches();
    }

    @GetMapping("/get/name/{name}")
    public List<Coach> getAllByYear(@PathVariable("name")  String name){
        return service.getAllByName(name);
    }

    @GetMapping("/get/numberOfCoachesInAll")
    public Object getNumfOfCoachesInAllSportCLubs(){
        return service.getNumfOfCoachesInAllSportCLubs();
    }

}
