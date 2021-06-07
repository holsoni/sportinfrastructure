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


import edu.coursework.sportinfrastructure.model.Building;
import edu.coursework.sportinfrastructure.model.Court;
import edu.coursework.sportinfrastructure.model.GymnasticGym;
import edu.coursework.sportinfrastructure.model.Sport;
import edu.coursework.sportinfrastructure.service.building.BuildingServiceImpl;
import edu.coursework.sportinfrastructure.service.court.CourtServiceImpl;
import edu.coursework.sportinfrastructure.service.gymnasticGym.GymnasticGymServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/ui/courts")
@Controller
public class CourtUiController {

    @Autowired
    CourtServiceImpl service;
    @Autowired
    BuildingServiceImpl serviceB;


    @RequestMapping("/get/all")
    public String showAll(Model model){
        List<Court> courts = service.getAll();
        model.addAttribute("court",courts);
        return "court/court-page";
    }

    @GetMapping("/showNewCourtForm")
    public String showNewCourtForm(Model model) {

        Court court = new Court();
        model.addAttribute("court", court);
        List<Building> buildings = serviceB.getAll();
        model.addAttribute("buildings", buildings);

        return "court/new_court";
    }
    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable(value="id") String id, Model model){
        Court court  = service.getById(id);
        model.addAttribute("court", court);
        List<Building> buildings = serviceB.getAll();
        model.addAttribute("buildings", buildings);
        return "court/update_court";
    }

    @PostMapping("/add")
    public String addGym(Model model, @ModelAttribute("court") @RequestBody Court court) {

        model.addAttribute("courts",service.create(court));
        return "redirect:/ui/courts/get/all";
    }

    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("court") @RequestBody Court court) {
        service.update(court);
        return "redirect:/ui/courts/get/all";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable (value = "id") String id) {

        // call delete employee method
        this.service.delete(id);
        return "redirect:/ui/courts/get/all";
    }
}

