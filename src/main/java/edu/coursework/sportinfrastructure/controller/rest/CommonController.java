/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.controller.rest.CommonController
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 05.04.21, 19:37
 *  * @Version CommonController.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.controller.rest;

import edu.coursework.sportinfrastructure.model.Coach;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Hidden
@RestController
public class CommonController {


    @GetMapping("/titulka")
    public String getTitulka(){
        String str = "<h1 align =\"center\">Hello Titulka<h1>";
        return str;
    };

    /*@GetMapping("/coach")
    public Coach getCoach(){
        Coach coach = new Coach(UUID.randomUUID(),"hhf",49);
        return coach;
    }*/

}
