/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.controller.rest.StadiumRestController
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 05.04.21, 21:38
 *  * @Version StadiumRestController.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.controller.rest;

import edu.coursework.sportinfrastructure.model.Stadium;
import edu.coursework.sportinfrastructure.service.stadium.impls.StadiumServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("api/stadiums")
public class StadiumRestController {

    @Autowired
    StadiumServiceImpl service;

    @GetMapping("/get/all")
    public List<Stadium> getStadiums(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Stadium getById(@PathVariable("id") String id){
        return service.getById(id);
    }

    @GetMapping("/delete/{id}")
    public Stadium deleteById(@PathVariable("id") String id){
        return service.delete(id);
    }
    @PostMapping ("/create/")
    public Stadium create(@RequestBody Stadium stadium){
        return service.create(stadium);
    }
    @PostMapping ("/update/")
    public Stadium update(@RequestBody Stadium stadium){
        return service.update(stadium);
    }
}