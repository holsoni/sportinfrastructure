/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.controller.rest.GymRestController
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 28.04.21, 08:39
 *  * @Version GymRestController.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.controller.rest;

import edu.coursework.sportinfrastructure.model.Gym;
import edu.coursework.sportinfrastructure.model.PlayTen;
import edu.coursework.sportinfrastructure.service.gym.GymServiceImpl;
import edu.coursework.sportinfrastructure.service.playTen.PlayTenServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Gym controler API")
@RestController
@RequestMapping("api/gym")
public class GymRestController {
    @Autowired
    GymServiceImpl service;

    @GetMapping("/get/all")
    public List<Gym> getAll(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Gym getById(@PathVariable("id") String id){
        return service.getById(id);
    }

    @Operation(summary = "Gym delete")
    @GetMapping("/delete/{id}")
    public Gym deleteById(@PathVariable("id")  String id){
        return service.delete(id);
    }

    @Operation(summary = "Gym creation")
    @PostMapping("/create/")
    public Gym create(@RequestBody Gym gym){
        return service.create(gym);
    }

    @Operation(summary = "Gym update")
    @PostMapping ("/update/")
    public Gym update(@RequestBody Gym gym){
        return service.update(gym);
    }
}
