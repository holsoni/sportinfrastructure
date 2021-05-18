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


import edu.coursework.sportinfrastructure.model.Court;
import edu.coursework.sportinfrastructure.model.PlayTen;
import edu.coursework.sportinfrastructure.service.court.CourtServiceImpl;
import edu.coursework.sportinfrastructure.service.playTen.PlayTenServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/playTens")
@Controller
public class PlayTenUiController {

    @Autowired
    PlayTenServiceImpl service;


    @RequestMapping("/get/all")
    public String showAll(Model model){
        List<PlayTen> playTens = service.getAll();
        model.addAttribute("playTen",playTens);
        return "playTen/playTen-page";
    }

    @GetMapping("/showNewPlayTenForm")
    public String showNewPlayTenForm(Model model) {

        PlayTen playTen = new PlayTen();
        model.addAttribute("playTen", playTen);

        return "playTen/new_playTen";
    }
    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable(value="id") String id, Model model){
        PlayTen playTen = service.getById(id);
        model.addAttribute("playTen", playTen);

        return "playTen/update_playTen";
    }

    @PostMapping("/add")
    public String addPlayTen(Model model, @ModelAttribute("playTen") @RequestBody PlayTen playTen) {

        model.addAttribute("playTen",service.create(playTen));
        return "redirect:/ui/playTens/get/all";
    }

    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("playTen") @RequestBody PlayTen playTen) {
        service.update(playTen);
        return "redirect:/ui/playTens/get/all";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable (value = "id") String id) {

        // call delete employee method
        this.service.delete(id);
        return "redirect:/ui/playTens/get/all";
    }
}

