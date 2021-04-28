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

import edu.coursework.sportinfrastructure.model.SportInfrastructure;
import edu.coursework.sportinfrastructure.model.Sportsmen;
import edu.coursework.sportinfrastructure.service.sportInfrastructure.SportInfrastructureServiceImpl;
import edu.coursework.sportinfrastructure.service.sportsmen.SportsmenServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Sport infrastructure controler API")
@RestController
@RequestMapping("api/sportInfrastructure")
public class SportInfrastructureRestController {

    @Autowired
    SportInfrastructureServiceImpl service;

    @GetMapping("/get/all")
    public List<SportInfrastructure> getAll(){
        return service.getAll() ;
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
