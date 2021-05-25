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
import edu.coursework.sportinfrastructure.model.Stadium;
import edu.coursework.sportinfrastructure.service.coach.impls.CoachServiceImpl;
import edu.coursework.sportinfrastructure.service.sportClub.SportClubServiceImpl;
import edu.coursework.sportinfrastructure.service.stadium.impls.StadiumServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/ui/coaches")
@Controller
public class CoachUiController {

    @Autowired
    CoachServiceImpl service;

    @Autowired
    SportClubServiceImpl sportClubService;

    @RequestMapping("/get/all")
    public String showAll(Model model){
        List<Coach> coaches = service.getAll();
        model.addAttribute("coach",coaches);
        return "coach/coach-page";
    }

    @GetMapping("/showNewCoachForm")
    public String showNewStadiumForm(Model model) {
        // create model attribute to bind form data
        Coach coach = new Coach();
        model.addAttribute("coach", coach);
       List<SportClub> sportClubs = sportClubService.getAll();/*.stream().map(SportClub::getName)
                .collect(Collectors.toList());*/
        model.addAttribute("sportClubs", sportClubs);
        List<Sport> sports = Arrays.asList(Sport.values());
        model.addAttribute("sport", sports);
        return "coach/new_coach";
    }
    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Coach coach = service.getById(id);
        model.addAttribute("coach",coach);
        List<SportClub> sportClubs = sportClubService.getAll();
        model.addAttribute("sportClubs", sportClubs);
        List<Sport> sports = Arrays.asList(Sport.values());
        model.addAttribute("sport", sports);
        return "coach/update_coach";
    }
    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("coach") @RequestBody Coach coach) {
        service.update(coach);
        return "redirect:/ui/coaches/get/all";
    }
    @PostMapping("/add")
    public String addStadium(Model model, @ModelAttribute("coach") @RequestBody Coach coach) {

            model.addAttribute("coach",service.create(coach));
            return "redirect:/ui/coaches/get/all";

    }



    @GetMapping("/delete/{id}")
    public String delete(@PathVariable (value = "id") String id) {

        // call delete employee method
        this.service.delete(id);
        return "redirect:/ui/coaches/get/all";
    }
}

