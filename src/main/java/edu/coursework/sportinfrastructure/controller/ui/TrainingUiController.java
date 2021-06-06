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
import edu.coursework.sportinfrastructure.model.Training;
import edu.coursework.sportinfrastructure.service.court.CourtServiceImpl;
import edu.coursework.sportinfrastructure.service.training.TrainingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/trainings")
@Controller
public class TrainingUiController {

    @Autowired
    TrainingServiceImpl service;


    @RequestMapping("/get/all")
    public String showAll(Model model){
        List<Training> trainings = service.getAll();
        model.addAttribute("trainings",trainings);
        return "training/training-page";
    }

    @GetMapping("/showNewTrainingForm")
    public String showNewTrainingForm(Model model) {

        Training training = new Training();
        model.addAttribute("training", training);

        return "training/new_training";
    }
    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable(value="id") String id, Model model){
        Training training  = service.getById(id);
        model.addAttribute("training", training);

        return "training/update_training";
    }

    @PostMapping("/add")
    public String addGym(Model model, @ModelAttribute("training") @RequestBody Training training) {

        model.addAttribute("training",service.create(training));
        return "redirect:/ui/trainings/get/all";
    }

    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("training") @RequestBody Training training) {
        service.update(training);
        return "redirect:/ui/trainings/get/all";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable (value = "id") String id) {

        // call delete employee method
        this.service.delete(id);
        return "redirect:/ui/trainings/get/all";
    }
}

