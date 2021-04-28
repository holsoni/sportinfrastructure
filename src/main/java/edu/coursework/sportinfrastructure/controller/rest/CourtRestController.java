/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.controller.rest.CourtRestController
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 28.04.21, 08:39
 *  * @Version CourtRestController.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.controller.rest;

import edu.coursework.sportinfrastructure.model.Court;
import edu.coursework.sportinfrastructure.model.Sportsmen;
import edu.coursework.sportinfrastructure.service.court.CourtServiceImpl;
import edu.coursework.sportinfrastructure.service.sportsmen.SportsmenServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Court controler API")
@RestController
@RequestMapping("api/court")
public class CourtRestController {
    @Autowired
    CourtServiceImpl service;

    @GetMapping("/get/all")
    public List<Court> getAll(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Court getById(@PathVariable("id") String id){
        return service.getById(id);
    }

    @Operation(summary = "Court delete")
    @GetMapping("/delete/{id}")
    public Court deleteById(@PathVariable("id")  String id){
        return service.delete(id);
    }

    @Operation(summary = "Court creation")
    @PostMapping("/create/")
    public Court create(@RequestBody Court court){
        return service.create(court);
    }

    @Operation(summary = "Court update")
    @PostMapping ("/update/")
    public Court update(@RequestBody Court court){
        return service.update(court);
    }
}
