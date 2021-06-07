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
import edu.coursework.sportinfrastructure.model.Coach;
import edu.coursework.sportinfrastructure.model.Sport;
import edu.coursework.sportinfrastructure.model.SportClub;
import edu.coursework.sportinfrastructure.service.building.BuildingServiceImpl;
import edu.coursework.sportinfrastructure.service.coach.impls.CoachServiceImpl;
import edu.coursework.sportinfrastructure.service.sportClub.SportClubServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/ui/buildings")
@Controller
public class BuildingUiController {

    @Autowired
    BuildingServiceImpl service;


    @RequestMapping("/get/all")
    public String showAll(Model model){
        List<Building> buildings = service.getAll();
        model.addAttribute("building",buildings);
        return "building/building-page";
    }

    @GetMapping("/showNewBuildingForm")
    public String showNewStadiumForm(Model model) {
        // create model attribute to bind form data
        Building building = new Building();
        model.addAttribute("building", building);

        return "building/new_building";
    }
    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Building building = service.getById(id);
        model.addAttribute("building",building);

        return "building/update_building";
    }
    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("building") @RequestBody Building building) {
        service.update(building);
        return "redirect:/ui/buildings/get/all";
    }
    @PostMapping("/add")
    public String addStadium(Model model, @ModelAttribute("building") @RequestBody Building building) {

            model.addAttribute("building",service.create(building));
            return "redirect:/ui/buildings/get/all";

    }



    @GetMapping("/delete/{id}")
    public String delete(@PathVariable (value = "id") String id) {

        // call delete employee method
        this.service.delete(id);
        return "redirect:/ui/buildings/get/all";
    }
}

