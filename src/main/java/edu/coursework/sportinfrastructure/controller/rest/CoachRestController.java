/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.controller.rest.CoachRestController
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 05.04.21, 19:37
 *  * @Version CoachRestController.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.controller.rest;

import edu.coursework.sportinfrastructure.service.coach.impls.CoachServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/coaches")
public class CoachRestController {

    @Autowired
    CoachServiceImpl service;
/*    @GetMapping("/titulka")
    public String getTitulka(){
        String str = "<h1 align =\"center\">Hello Titulka<h1>";
        return str;
    };*/

/*    @GetMapping("/coach")
    public Coach getCoach(){
        Coach coach = new Coach(UUID.randomUUID(),"hhf",49);
        return coach;
    }*/
    /*@GetMapping("/get/all")
    public List<Coach> getCoaches(){
        return service.getALl();
    }*/

}
