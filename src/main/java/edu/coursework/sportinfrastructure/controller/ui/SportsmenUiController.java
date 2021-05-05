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

import edu.coursework.sportinfrastructure.model.Sport;
import edu.coursework.sportinfrastructure.model.SportClub;
import edu.coursework.sportinfrastructure.model.Sportsmen;
import edu.coursework.sportinfrastructure.model.Stadium;
import edu.coursework.sportinfrastructure.service.sportClub.SportClubServiceImpl;
import edu.coursework.sportinfrastructure.service.sportsmen.SportsmenServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/ui/sportsmen")
@Controller
public class SportsmenUiController {

    @Autowired
    SportsmenServiceImpl service;

    @Autowired
    SportClubServiceImpl sportClubService;

    @RequestMapping("/get/all")
    public String showAll(Model model){
        List<Sportsmen> sportsmen = service.getAll();
        model.addAttribute("sportsman",sportsmen);
        return "sportsmen/sportsmen-page";
    }

    @GetMapping("/showNewSportsmenForm")
    public String showNewSportsmenForm(Model model) {

        Sportsmen sportsmen = new Sportsmen();
        model.addAttribute("sportsman", sportsmen);
        List<String> sportClubs = sportClubService.getAll().stream().map(SportClub::getName)
                .collect(Collectors.toList());
        model.addAttribute("sportClub", sportClubs);
        List<Sport> sports = Arrays.asList(Sport.values());
        model.addAttribute("sport", sports);

        return "sportsmen/new_sportsmen";
    }
    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Sportsmen sportsmen = service.getById(id);
        model.addAttribute("sportsman",sportsmen );
        return "sportsmen/update_sportsmen";
    }

    @PostMapping("/add")
    public String addSportsmen(Model model, @ModelAttribute("sportsman") @RequestBody Sportsmen sportsmen) {

        List<Sportsmen> sportsmens = service.getAll();

        if (sportsmen.getName() != null && sportsmen.getAge() > 0 && sportsmen.getSportClub() != null
                && sportsmen.getSportAndDegree() != null ) {
            model.addAttribute("sportsman",service.create(sportsmen));
            return "redirect:/ui/sportsmen/get/all";
        }
        return "redirect:/ui/sportsmen/showNewSportsmenForm";
    }

    @PostMapping("/update")
    public String updateSportsmen(Model model, @ModelAttribute("sportsman") @RequestBody Sportsmen sportsmen) {

        service.update(sportsmen);
        return "redirect:/ui/sportsmen/get/all";
    }

    @GetMapping("/delete/{id}")
    public String deleteSportsmen(@PathVariable (value = "id") String id) {

        // call delete employee method
        this.service.delete(id);
        return "redirect:/ui/sportsmen/get/all";
    }
}