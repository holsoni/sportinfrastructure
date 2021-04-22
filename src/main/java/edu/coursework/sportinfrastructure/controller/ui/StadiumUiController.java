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

import edu.coursework.sportinfrastructure.model.Stadium;
import edu.coursework.sportinfrastructure.service.stadium.impls.StadiumServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/stadiums")
@Controller
public class StadiumUiController {

    @Autowired
    StadiumServiceImpl service;

    @RequestMapping("/get/all")
    public String showAll(Model model){
        List<Stadium> stadiums = service.getAll();
        model.addAttribute("stadiums",stadiums);
        return "stadium-page";
    }

    @GetMapping("/showNewStadiumForm")
    public String showNewStadiumForm(Model model) {
        // create model attribute to bind form data
        Stadium stadium = new Stadium();
        model.addAttribute("stadiums", stadium);
        return "new_stadium";
    }

    @PostMapping("/addStadium")
    public String addStadium(Model model, @ModelAttribute("employee") @RequestBody Stadium stadium) {
        String address = stadium.getAddress();
        String name = stadium.getName();
        int length = stadium.getLength();
        int tracks = stadium.getAmountOfTracks();
        int capacity = stadium.getCapacity();
        List<Stadium> stadiums = service.getAll();

        if (address != null && address.length() > 0 && name != null
                && name.length() > 0 && length > 0 && tracks > 0 && capacity>0) {
            model.addAttribute("stadiums",service.create(stadium));
            return "redirect:/ui/stadiums/get/all";
        }
        return "redirect:/ui/stadiums/showNewStadiumForm";
    }
    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Stadium stadium = service.getById(id);
        model.addAttribute("stadiums",stadium);
        return "update_stadium";
    }
    @PostMapping("/updateStadium")
    public String updateStadium(Model model, @ModelAttribute("employee") @RequestBody Stadium stadium) {

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

