/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.controller.rest.SportsmenRestController
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 27.04.21, 20:53
 *  * @Version SportsmenRestController.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.controller.rest;

import edu.coursework.sportinfrastructure.model.Sportsmen;
import edu.coursework.sportinfrastructure.model.Stadium;
import edu.coursework.sportinfrastructure.service.sportsmen.SportsmenServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Sportsmen controler API")
@RestController
@RequestMapping("api/sportsmen")
public class SportsmenRestController {

    @Autowired
    SportsmenServiceImpl service;

    @GetMapping("/get/all")
    public List<Sportsmen> getStadiums(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Sportsmen getById(@PathVariable("id") String id){
        return service.getById(id);
    }

    @Operation(summary = "Sportsmen delete")
    @GetMapping("/delete/{id}")
    public Sportsmen deleteById(@PathVariable("id")  String id){
        return service.delete(id);
    }

    @Operation(summary = "Sportsmen creation")
    @PostMapping("/create/")
    public Sportsmen create(@RequestBody Sportsmen sportsmen){
        return service.create(sportsmen);
    }

    @Operation(summary = "Sportsmen update")
    @PostMapping ("/update/")
    public Sportsmen update(@RequestBody Sportsmen sportsmen){
        return service.update(sportsmen);
    }
}
