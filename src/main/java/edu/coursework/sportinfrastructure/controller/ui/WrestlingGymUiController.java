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


import edu.coursework.sportinfrastructure.model.SportClub;
import edu.coursework.sportinfrastructure.model.WrestlingGym;
import edu.coursework.sportinfrastructure.service.sportClub.SportClubServiceImpl;
import edu.coursework.sportinfrastructure.service.wrestlingGym.WrestlingGymServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/wrestlingGyms")
@Controller
public class WrestlingGymUiController {

    @Autowired
    WrestlingGymServiceImpl service;


    @RequestMapping("/get/all")
    public String showAll(Model model){
        List<WrestlingGym> gyms = service.getAll();
        model.addAttribute("wrestlingGyms",gyms);
        return "wrestlingGym/wrestlingGym-page";
    }

    @GetMapping("/showNewGymForm")
    public String showNewGymForm(Model model) {

        WrestlingGym gym = new WrestlingGym();
        model.addAttribute("wrestlingGyms", gym);

        return "wrestlingGym/new_wrestlingGym";
    }
    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable(value="id") String id, Model model){
        WrestlingGym gym  = service.getById(id);
        model.addAttribute("wrestlingGyms", gym);

        return "wrestlingGym/update_wrestlingGym";
    }

    @PostMapping("/add")
    public String addStadium(Model model, @ModelAttribute("wrestlingGyms") @RequestBody WrestlingGym gym) {

        model.addAttribute("wrestlingGyms",service.create(gym));
        return "redirect:/ui/wrestlingGyms/get/all";
    }

    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("wrestlingGyms") @RequestBody WrestlingGym gym) {
        service.update(gym);
        return "redirect:/ui/wrestlingGyms/get/all";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable (value = "id") String id) {

        // call delete employee method
        this.service.delete(id);
        return "redirect:/ui/wrestlingGyms/get/all";
    }
}

