/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.controller.ui.StadiumUiController
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 05.04.21, 21:50
 *  * @Version StadiumUiController.java : 1.0
 *
 */

package edu.coursework.sportinfrastructure.controller.ui;

import edu.coursework.sportinfrastructure.model.Coach;
import edu.coursework.sportinfrastructure.model.Sport;
import edu.coursework.sportinfrastructure.model.SportClub;
import edu.coursework.sportinfrastructure.service.coach.impls.CoachServiceImpl;
import edu.coursework.sportinfrastructure.service.sportClub.SportClubServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/")
@Controller
public class HomeUiController {


    @RequestMapping("/home")
    public String showAll(){
        return "/index";
    }

    @RequestMapping("/home/about")
    public String about(){

        return "/title";
    }


}

