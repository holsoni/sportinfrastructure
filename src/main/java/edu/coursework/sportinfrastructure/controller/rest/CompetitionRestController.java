/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.controller.rest.CompetitionRestController
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 28.04.21, 08:38
 *  * @Version CompetitionRestController.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.controller.rest;

import edu.coursework.sportinfrastructure.model.Competition;
import edu.coursework.sportinfrastructure.model.Sportsmen;
import edu.coursework.sportinfrastructure.service.competition.CompetitionServiceImpl;
import edu.coursework.sportinfrastructure.service.sportsmen.SportsmenServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Competition controler API")
@RestController
@RequestMapping("api/competition")
public class CompetitionRestController {
    @Autowired
    CompetitionServiceImpl service;

    @GetMapping("/get/all")
    public List<Competition> getAll(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Competition getById(@PathVariable("id") String id){
        return service.getById(id);
    }

    @Operation(summary = "Competition delete")
    @GetMapping("/delete/{id}")
    public Competition deleteById(@PathVariable("id")  String id){
        return service.delete(id);
    }

    @Operation(summary = "Competition creation")
    @PostMapping("/create/")
    public Competition create(@RequestBody Competition competition){
        return service.create(competition);
    }

    @Operation(summary = "Competition update")
    @PostMapping ("/update/")
    public Competition update(@RequestBody Competition competition){
        return service.update(competition);
    }
}
