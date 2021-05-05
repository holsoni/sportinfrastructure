/*
 * *
 *  * Created by IntelliJ IDEA.
 *  * edu.coursework.sportinfrastructure.controller.ui.SportClubController
 *  *
 *  * @Autor: SoniaKK
 *  * @DateTime: 05.05.21, 20:51
 *  * @Version SportClubUiController.java : 1.0
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

@RequestMapping("/ui/sportClubs")
@Controller
public class SportClubUiController {

    @Autowired
    SportClubServiceImpl service;


    @RequestMapping("/get/all")
    public String showAll(Model model){
        List<SportClub> sportClubs = service.getAll();
        model.addAttribute("sportClub",sportClubs);
        return "sportClub/sportClub-page";
    }

    @GetMapping("/showNewClubForm")
    public String showNewClubForm(Model model) {

        SportClub sportClub = new SportClub();
        model.addAttribute("sportClub", sportClub);

        return "sportClub/new_sportClub";
    }
    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable(value="id") String id, Model model){
        SportClub sportClubs = service.getById(id);
        model.addAttribute("sportClub", sportClubs);

        return "sportClub/update_sportClub";
    }

    @PostMapping("/add")
    public String addStadium(Model model, @ModelAttribute("sportClub") @RequestBody SportClub sportClub) {

        model.addAttribute("sportClub",service.create(sportClub));
        return "redirect:/ui/sportClubs/get/all";

    }

    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("sportClub") @RequestBody SportClub sportClub) {
        service.update(sportClub);
        return "redirect:/ui/sportClubs/get/all";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable (value = "id") String id) {

        // call delete employee method
        this.service.delete(id);
        return "redirect:/ui/sportClubs/get/all";
    }
}

