/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.controller.rest.TrainingRestController
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 28.04.21, 08:40
 *  * @Version TrainingRestController.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.controller.rest;

import edu.coursework.sportinfrastructure.model.Sportsmen;
import edu.coursework.sportinfrastructure.model.Training;
import edu.coursework.sportinfrastructure.service.sportsmen.SportsmenServiceImpl;
import edu.coursework.sportinfrastructure.service.training.TrainingServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Training controler API")
@RestController
@RequestMapping("api/training")
public class TrainingRestController {
    @Autowired
    TrainingServiceImpl service;

    @GetMapping("/get/all")
    public List<Training> getAll(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Training getById(@PathVariable("id") String id){
        return service.getById(id);
    }

    @Operation(summary = "Training delete")
    @GetMapping("/delete/{id}")
    public Training deleteById(@PathVariable("id")  String id){
        return service.delete(id);
    }

    @Operation(summary = "Training creation")
    @PostMapping("/create/")
    public Training create(@RequestBody Training training){
        return service.create(training);
    }

    @Operation(summary = "Training update")
    @PostMapping ("/update/")
    public Training update(@RequestBody Training training){
        return service.update(training);
    }

}
