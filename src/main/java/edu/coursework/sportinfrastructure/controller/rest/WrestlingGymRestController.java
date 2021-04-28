/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.controller.rest.WrestlingGymRestController
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 28.04.21, 08:41
 *  * @Version WrestlingGymRestController.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.controller.rest;

import edu.coursework.sportinfrastructure.model.Sportsmen;
import edu.coursework.sportinfrastructure.model.WrestlingGym;
import edu.coursework.sportinfrastructure.service.sportsmen.SportsmenServiceImpl;
import edu.coursework.sportinfrastructure.service.wrestlingGym.IWrestlingGymService;
import edu.coursework.sportinfrastructure.service.wrestlingGym.WrestlingGymServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Wrestling gym controller API")
@RestController
@RequestMapping("api/wrestlingGym")
public class WrestlingGymRestController {
    @Autowired
    WrestlingGymServiceImpl service;

    @GetMapping("/get/all")
    public List<WrestlingGym> getAll(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public WrestlingGym getById(@PathVariable("id") String id){
        return service.getById(id);
    }

    @Operation(summary = "WrestlingGym delete")
    @GetMapping("/delete/{id}")
    public WrestlingGym deleteById(@PathVariable("id")  String id){
        return service.delete(id);
    }

    @Operation(summary = "WrestlingGym creation")
    @PostMapping("/create/")
    public WrestlingGym create(@RequestBody WrestlingGym wrestlingGym){
        return service.create(wrestlingGym);
    }

    @Operation(summary = "WrestlingGym update")
    @PostMapping ("/update/")
    public WrestlingGym update(@RequestBody WrestlingGym wrestlingGym){
        return service.update(wrestlingGym);
    }
}
