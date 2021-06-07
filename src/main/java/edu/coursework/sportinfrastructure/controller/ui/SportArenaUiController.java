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
import edu.coursework.sportinfrastructure.model.Sport;
import edu.coursework.sportinfrastructure.model.SportArena;
import edu.coursework.sportinfrastructure.service.building.BuildingServiceImpl;
import edu.coursework.sportinfrastructure.service.court.CourtServiceImpl;
import edu.coursework.sportinfrastructure.service.sportArena.SportArenaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/ui/sportArenas")
@Controller
public class SportArenaUiController {

    @Autowired
    SportArenaServiceImpl service;

    @Autowired
    BuildingServiceImpl serviceB;
    @RequestMapping("/get/all")
    public String showAll(Model model){
        List<SportArena> arenas = service.getAll();
        model.addAttribute("sportArenas",arenas);
        List<Sport> sports = Arrays.asList(Sport.values());
        model.addAttribute("sport", sports);
        return "sportArena/sportArena-page";
    }

    @GetMapping("/showNewArenaForm")
    public String showNewCourtForm(Model model) {

        SportArena sportArena = new SportArena();
        model.addAttribute("sportArenas", sportArena);
        List<Sport> sports = Arrays.asList(Sport.values());
        model.addAttribute("sport", sports);
        List<Building> buildings = serviceB.getAll();
        model.addAttribute("buildings", buildings);
        return "sportArena/new_sportArena";
    }
    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable(value="id") String id, Model model){
        SportArena sportArena  = service.getById(id);
        model.addAttribute("sportArenas", sportArena);
        List<Sport> sports = Arrays.asList(Sport.values());
        model.addAttribute("sport", sports);
        List<Building> buildings = serviceB.getAll();
        model.addAttribute("buildings", buildings);
        return "sportArena/update_sportArena";
    }

    @PostMapping("/add")
    public String addGym(Model model, @ModelAttribute("sportArenas") @RequestBody SportArena sportArena) {

        model.addAttribute("sportArenas",service.create(sportArena));
        return "redirect:/ui/sportArena/get/all";
    }

    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("sportArenas") @RequestBody SportArena sportArena) {
        service.update(sportArena);
        return "redirect:/ui/sportArenas/get/all";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable (value = "id") String id) {

        // call delete employee method
        this.service.delete(id);
        return "redirect:/ui/sportArenas/get/all";
    }
}

