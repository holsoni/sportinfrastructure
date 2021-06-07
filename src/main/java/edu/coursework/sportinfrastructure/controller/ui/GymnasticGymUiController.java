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
import edu.coursework.sportinfrastructure.model.GymnasticGym;
import edu.coursework.sportinfrastructure.model.WrestlingGym;
import edu.coursework.sportinfrastructure.service.building.BuildingServiceImpl;
import edu.coursework.sportinfrastructure.service.gymnasticGym.GymnasticGymServiceImpl;
import edu.coursework.sportinfrastructure.service.wrestlingGym.WrestlingGymServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/gymnasticGyms")
@Controller
public class GymnasticGymUiController {

    @Autowired
    GymnasticGymServiceImpl service;

    @Autowired
    BuildingServiceImpl serviceB;
    @RequestMapping("/get/all")
    public String showAll(Model model){
        List<GymnasticGym> gyms = service.getAll();
        model.addAttribute("gymnasticGym",gyms);
        return "gymnasticGym/gymnasticGym-page";
    }

    @GetMapping("/showNewGymForm")
    public String showNewGymForm(Model model) {

        GymnasticGym gym = new GymnasticGym();
        model.addAttribute("gymnasticGym", gym);
        List<Building> buildings = serviceB.getAll();
        model.addAttribute("buildings", buildings);
        return "gymnasticGym/new_gymnasticGym";
    }
    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable(value="id") String id, Model model){
        GymnasticGym gym  = service.getById(id);
        model.addAttribute("gymnasticGym", gym);
        List<Building> buildings = serviceB.getAll();
        model.addAttribute("buildings", buildings);
        return "gymnasticGym/update_gymnasticGym";
    }

    @PostMapping("/add")
    public String addGym(Model model, @ModelAttribute("gymnasticGym") @RequestBody GymnasticGym gym) {

        model.addAttribute("gymnasticGym",service.create(gym));
        return "redirect:/ui/gymnasticGyms/get/all";
    }

    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("gymnasticGym") @RequestBody GymnasticGym gym) {
        service.update(gym);
        return "redirect:/ui/gymnasticGyms/get/all";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable (value = "id") String id) {

        // call delete employee method
        this.service.delete(id);
        return "redirect:/ui/gymnasticGyms/get/all";
    }
}

