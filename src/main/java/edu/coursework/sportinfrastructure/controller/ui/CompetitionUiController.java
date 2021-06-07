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
import edu.coursework.sportinfrastructure.service.building.BuildingServiceImpl;
import edu.coursework.sportinfrastructure.service.coach.impls.CoachServiceImpl;
import edu.coursework.sportinfrastructure.service.competition.CompetitionServiceImpl;
import edu.coursework.sportinfrastructure.service.sportClub.SportClubServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/ui/сompetitions")
@Controller
public class CompetitionUiController {

    @Autowired
    CompetitionServiceImpl service;

    @Autowired
    SportClubServiceImpl sportClubService;
    @Autowired
    BuildingServiceImpl serviceB;
    @RequestMapping("/get/all")
    public String showAll(Model model){
        List<Competition> competitions = service.getAll();
        model.addAttribute("competition",competitions);
        return "/competition/competition-page";
    }

    @GetMapping("/showNewCompetitionForm")
    public String showNewCompetitionForm(Model model) {
        // create model attribute to bind form data
        Competition competition = new Competition();
        model.addAttribute("competition", competition);
       List<SportClub> sportClubs = sportClubService.getAll();/*.stream().map(SportClub::getName)
                .collect(Collectors.toList());*/
        model.addAttribute("sportClubs", sportClubs);
        List<CompetitionOrganizer> organizers = Arrays.asList(CompetitionOrganizer.values());
        model.addAttribute("organizer", organizers);
        List<Sport> sports = Arrays.asList(Sport.values());
        model.addAttribute("sport", sports);
        List<Building> buildings = serviceB.getAll();
        model.addAttribute("buildings", buildings);
        return "/competition/new_competition";
    }
    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Competition competition = service.getById(id);
        model.addAttribute("competition",competition);
        List<CompetitionOrganizer> organizers = Arrays.asList(CompetitionOrganizer.values());
        model.addAttribute("organizer", organizers);
        List<Sport> sports = Arrays.asList(Sport.values());
        model.addAttribute("sport", sports);
        List<Building> buildings = serviceB.getAll();
        model.addAttribute("buildings", buildings);
        return "/competition/update_competition";
    }
    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("competition") @RequestBody Competition competition) {
        service.update(competition);
        return "redirect:/ui/competitions/get/all";
    }
    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("competition") @RequestBody Competition competition) {

            model.addAttribute("competition",service.create(competition));
            return "redirect:/ui/competitions/get/all";

    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable (value = "id") String id) {

        // call delete employee method
        this.service.delete(id);
        return "redirect:/ui/competitions/get/all";
    }
}

