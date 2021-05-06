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
import edu.coursework.sportinfrastructure.service.gymnasticGym.GymnasticGymServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.JmsAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.activemq.ActiveMQAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@EnableAutoConfiguration(exclude={JmsAutoConfiguration.class, ActiveMQAutoConfiguration.class})
@Tag(name = "Gymnastic gym controler API")
@RestController
@RequestMapping("api/gymnasticGym")
public class GymnasticGymRestController {

    @Autowired
    GymnasticGymServiceImpl service;

    @GetMapping("/get/all")
    public List<GymnasticGym> getAll(){
      return service.findAll();
    }

    @GetMapping("/get/{id}")
    public GymnasticGym getById(@PathVariable("id") String id){
        return service.findById(id);
    }

    @Operation(summary = "Gymnastic gym delete")
    @GetMapping("/delete/{id}")
    public GymnasticGym deleteById(@PathVariable("id")  String id){
        return service.delete(id);
    }

    @Operation(summary = "Gymnastic gym creation")
    @PostMapping("/create/")
    public GymnasticGym create(@RequestBody GymnasticGym gymnasticGym){
        return service.save(gymnasticGym);
    }

    @Operation(summary = "Gymnastic gym update")
    @PostMapping ("/update/")
    public GymnasticGym update(@RequestBody GymnasticGym gymnasticGym){
        return service.save(gymnasticGym);
    }
}
