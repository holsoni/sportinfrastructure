/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.controller.rest.PlayTenRestController
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 28.04.21, 08:40
 *  * @Version PlayTenRestController.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.controller.rest;

import edu.coursework.sportinfrastructure.model.PlayTen;
import edu.coursework.sportinfrastructure.model.Sportsmen;
import edu.coursework.sportinfrastructure.service.playTen.PlayTenServiceImpl;
import edu.coursework.sportinfrastructure.service.sportsmen.SportsmenServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Play ten controler API")
@RestController
@RequestMapping("api/playTen")
public class PlayTenRestController {
    @Autowired
    PlayTenServiceImpl service;

    @GetMapping("/get/all")
    public List<PlayTen> getAll(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public PlayTen getById(@PathVariable("id") String id){
        return service.getById(id);
    }

    @Operation(summary = "PlayTen delete")
    @GetMapping("/delete/{id}")
    public PlayTen deleteById(@PathVariable("id")  String id){
        return service.delete(id);
    }

    @Operation(summary = "PlayTen creation")
    @PostMapping("/create/")
    public PlayTen create(@RequestBody PlayTen playTen){
        return service.create(playTen);
    }

    @Operation(summary = "PlayTen update")
    @PostMapping ("/update/")
    public PlayTen update(@RequestBody PlayTen playTen){
        return service.update(playTen);
    }

}
