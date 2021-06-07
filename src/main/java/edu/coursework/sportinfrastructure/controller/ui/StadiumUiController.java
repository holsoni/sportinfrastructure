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

import edu.coursework.sportinfrastructure.model.Building;
import edu.coursework.sportinfrastructure.model.Stadium;
import edu.coursework.sportinfrastructure.service.building.BuildingServiceImpl;
import edu.coursework.sportinfrastructure.service.stadium.impls.StadiumServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/stadiums")
@Controller
public class StadiumUiController {

    @Autowired
    StadiumServiceImpl service;
    @Autowired
    BuildingServiceImpl serviceB;
    @RequestMapping("/get/all")
    public String showAll(Model model){
        List<Stadium> stadiums = service.getAll();
        model.addAttribute("stadiums",stadiums);
        return "stadium/stadium-page";
    }

    @GetMapping("/showNewStadiumForm")
    public String showNewStadiumForm(Model model) {
        // create model attribute to bind form data
        Stadium stadium = new Stadium();
        model.addAttribute("stadiums", stadium);
        List<Building> buildings = serviceB.getAll();
        model.addAttribute("buildings", buildings);
        return "stadium/new_stadium";
    }
    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Stadium stadium = service.getById(id);
        model.addAttribute("stadiums",stadium);
        List<Building> buildings = serviceB.getAll();
        model.addAttribute("buildings", buildings);
        return "stadium/update_stadium";
    }

    @PostMapping("/addStadium")
    public String addStadium(Model model, @ModelAttribute("stadiums") @RequestBody Stadium stadium) {


            model.addAttribute("stadiums",service.create(stadium));
            return "redirect:/ui/stadiums/get/all";

    }

    @PostMapping("/updateStadium")
    public String updateStadium(Model model, @ModelAttribute("stadiums") @RequestBody Stadium stadium) {

        service.update(stadium);
        return "redirect:/ui/stadiums/get/all";
    }

    @GetMapping("/deleteStadium/{id}")
    public String deleteEmployee(@PathVariable (value = "id") String id) {

        // call delete employee method
        this.service.delete(id);
        return "redirect:/ui/stadiums/get/all";
    }
}

