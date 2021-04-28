/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.controller.rest.SportArena
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 28.04.21, 08:40
 *  * @Version SportArena.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.controller.rest;

import edu.coursework.sportinfrastructure.model.SportArena;
import edu.coursework.sportinfrastructure.model.Sportsmen;
import edu.coursework.sportinfrastructure.service.sportArena.SportArenaServiceImpl;
import edu.coursework.sportinfrastructure.service.sportsmen.SportsmenServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Sport arena controler API")
@RestController
@RequestMapping("api/sportArena")
public class SportArenaRestController {
    @Autowired
    SportArenaServiceImpl service;

    @GetMapping("/get/all")
    public List<SportArena> getAll(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public SportArena getById(@PathVariable("id") String id){
        return service.getById(id);
    }

    @Operation(summary = "Sport arena delete")
    @GetMapping("/delete/{id}")
    public SportArena deleteById(@PathVariable("id")  String id){
        return service.delete(id);
    }

    @Operation(summary = "Sport arena creation")
    @PostMapping("/create/")
    public SportArena create(@RequestBody SportArena sportArena){
        return service.create(sportArena);
    }

    @Operation(summary = "Sport arena update")
    @PostMapping ("/update/")
    public SportArena update(@RequestBody SportArena sportArena){
        return service.update(sportArena);
    }
}
