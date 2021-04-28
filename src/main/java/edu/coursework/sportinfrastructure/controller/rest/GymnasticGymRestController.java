/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.controller.rest.GymnasticGymRestController
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 28.04.21, 08:39
 *  * @Version GymnasticGymRestController.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.controller.rest;

import edu.coursework.sportinfrastructure.model.GymnasticGym;
import edu.coursework.sportinfrastructure.model.Sportsmen;
import edu.coursework.sportinfrastructure.service.gymnasticGym.GymnasticGymServiceImpl;
import edu.coursework.sportinfrastructure.service.sportsmen.SportsmenServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Gymnastic gym controler API| PostgreSQL")
@RestController
@RequestMapping("api/gymnasticGym")
public class GymnasticGymRestController {
    @Autowired
    GymnasticGymServiceImpl service;

    @GetMapping("/get/all")
    public List<GymnasticGym> getAll(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public GymnasticGym getById(@PathVariable("id") String id){
        return service.getById(id);
    }

    @Operation(summary = "Gymnastic gym delete")
    @GetMapping("/delete/{id}")
    public GymnasticGym deleteById(@PathVariable("id")  String id){
        return service.delete(id);
    }

    @Operation(summary = "Gymnastic gym creation")
    @PostMapping("/create/")
    public GymnasticGym create(@RequestBody GymnasticGym gymnasticGym){
        return service.create(gymnasticGym);
    }

    @Operation(summary = "Gymnastic gym update")
    @PostMapping ("/update/")
    public GymnasticGym update(@RequestBody GymnasticGym gymnasticGym){
        return service.update(gymnasticGym);
    }
}
