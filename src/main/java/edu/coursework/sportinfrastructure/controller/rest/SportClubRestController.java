/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.controller.rest.SportClubRestController
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 28.04.21, 08:40
 *  * @Version SportClubRestController.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.controller.rest;

import edu.coursework.sportinfrastructure.model.SportClub;
import edu.coursework.sportinfrastructure.model.Sportsmen;
import edu.coursework.sportinfrastructure.service.sportClub.SportClubServiceImpl;
import edu.coursework.sportinfrastructure.service.sportsmen.SportsmenServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "SportClub controler API")
@RestController
@RequestMapping("api/sportClub")
public class SportClubRestController {
    @Autowired
    SportClubServiceImpl service;

    @Operation(summary = "Get All")
    @GetMapping("/get/all")
    public List<SportClub> getAll(){
        return service.getAll() ;
    }

    @Operation(summary = "Get By Id")
    @GetMapping("/get/{id}")
    public SportClub getById(@PathVariable("id") String id){
        return service.getById(id);
    }

    @Operation(summary = "SportClub delete")
    @GetMapping("/delete/{id}")
    public SportClub deleteById(@PathVariable("id")  String id){
        return service.delete(id);
    }

    @Operation(summary = "SportClub creation")
    @PostMapping("/create/")
    public SportClub create(@RequestBody SportClub sportClub){
        return service.create(sportClub);
    }

    @Operation(summary = "SportClub update")
    @PostMapping ("/update/")
    public SportClub update(@RequestBody SportClub sportClub){
        return service.update(sportClub);
    }
}
