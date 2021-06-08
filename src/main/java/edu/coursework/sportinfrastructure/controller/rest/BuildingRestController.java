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

import edu.coursework.sportinfrastructure.model.Building;
import edu.coursework.sportinfrastructure.model.Coach;
import edu.coursework.sportinfrastructure.service.building.BuildingServiceImpl;
import edu.coursework.sportinfrastructure.service.coach.impls.CoachServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Tag(name = "Building controler API")
@RestController
@RequestMapping("api/buildings")
public class BuildingRestController {

    @Autowired
    BuildingServiceImpl service;


    @Operation(summary = "Building By Id")
    @GetMapping("/get/{id}")
    public Building getById(@PathVariable("id") String id){
        return service.getById(id);
    }

    @Operation(summary = "Building delete")
    @GetMapping("/delete/{id}")
    public Building deleteById(@PathVariable("id")  String id){
        return service.delete(id);
    }

    @Operation(summary = "Building creation")
    @PostMapping("/create/")
    public Building create(@RequestBody Building building){
        return service.create(building);
    }

    @Operation(summary = "Building update")
    @PostMapping ("/update/")
    public Building update(@RequestBody Building building){
        return service.update(building);
    }
    @Operation(summary = "Get All")
    @GetMapping("/get/all")
    public List<Building> getCoaches(){
        return service.getAll();
    }

}
