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

import edu.coursework.sportinfrastructure.model.*;
import edu.coursework.sportinfrastructure.service.coach.impls.CoachServiceImpl;
import edu.coursework.sportinfrastructure.service.court.CourtServiceImpl;
import edu.coursework.sportinfrastructure.service.gymnasticGym.GymnasticGymServiceImpl;
import edu.coursework.sportinfrastructure.service.playTen.PlayTenServiceImpl;
import edu.coursework.sportinfrastructure.service.sportArena.SportArenaServiceImpl;
import edu.coursework.sportinfrastructure.service.sportClub.SportClubServiceImpl;
import edu.coursework.sportinfrastructure.service.sportInfrastructure.SportInfrastructureServiceImpl;
import edu.coursework.sportinfrastructure.service.stadium.impls.StadiumServiceImpl;
import edu.coursework.sportinfrastructure.service.wrestlingGym.WrestlingGymServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

@RequestMapping("/ui/sportInfastructures")
@Controller
public class SportInfrastructureUiController {

    @Autowired
    SportInfrastructureServiceImpl service;

    @Autowired
    SportClubServiceImpl sportClubService;

    @Autowired
    StadiumServiceImpl stadiumService;

    @Autowired
    WrestlingGymServiceImpl wrestlingGymService;

    @Autowired
    GymnasticGymServiceImpl gymnasticGymService;

    @Autowired
    SportArenaServiceImpl sportArenaService;

    @Autowired
    PlayTenServiceImpl playTenService;

    @Autowired
    CourtServiceImpl courtService;

    @RequestMapping("/get/all")
    public String showAll(Model model){
        List<SportInfrastructure> sportInfrastructures = service.getAll();
        model.addAttribute("sportInfrastructure",sportInfrastructures);
        return "sportInfrastructure/sportInfrastructure-page";
    }

    @GetMapping("/showNewInfrastructureForm")
    public String showNewInfrastructureForm(Model model) {
        // create model attribute to bind form data
        SportInfrastructure sportInfrastructure= new SportInfrastructure();
        model.addAttribute("sportInfrastructure", sportInfrastructure);
        List<SportClub> sportClubs = sportClubService.getAll();
        model.addAttribute("sportClubs", sportClubs);

        List<Stadium> stadiums = stadiumService.getAll();
        model.addAttribute("stadiums", stadiums);

        List<Court> courts = courtService.getAll();
        model.addAttribute("courts", courts);

        List<GymnasticGym> gymnasticGyms = gymnasticGymService.getAll();
        model.addAttribute("gymnasticGyms", gymnasticGyms);

        List<WrestlingGym> wrestlingGyms = wrestlingGymService.getAll();
        model.addAttribute("wrestlingGyms", wrestlingGyms);



        List<SportArena> sportArenas = sportArenaService.getAll();

     /*
        buildings.addAll(stadiums);
        buildings.addAll(sportClubs);
        buildings.addAll(courts);
        buildings.addAll(gymnasticGyms);
        buildings.addAll(wrestlingGyms);
        buildings.addAll(playTens);
        buildings.addAll(sportArenas);
*/
        model.addAttribute("sportArenas", sportArenas);

        return "/sportInfrastructure/new_sportInfrastructure";
    }
    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        SportInfrastructure sportInfrastructure = service.getById(id);
        model.addAttribute("sportInfrastructure",sportInfrastructure);
        List<SportClub> sportClubs = sportClubService.getAll();
        model.addAttribute("sportClubs", sportClubs);
        List<Sport> sports = Arrays.asList(Sport.values());
        model.addAttribute("sport", sports);
        return "sportInfrastructure/new_sportInfrastructure.html";
    }
    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("sportInfrastructure") @RequestBody SportInfrastructure sportInfrastructure) {
        service.update(sportInfrastructure);
        return "redirect:/ui/sportInfrastructures/get/all";
    }
    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("sportInfrastructure") @RequestBody SportInfrastructure sportInfrastructure) {

            model.addAttribute("sportInfrastructure",service.create(sportInfrastructure));
            return "redirect:/ui/sportInfrastructures/get/all";

    }



    @GetMapping("/delete/{id}")
    public String delete(@PathVariable (value = "id") String id) {

        // call delete employee method
        this.service.delete(id);
        return "redirect:/ui/coaches/get/all";
    }
}

