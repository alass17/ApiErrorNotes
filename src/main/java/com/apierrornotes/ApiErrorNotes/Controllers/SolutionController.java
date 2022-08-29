package com.apierrornotes.ApiErrorNotes.Controllers;

import com.apierrornotes.ApiErrorNotes.Models.Solution;
import com.apierrornotes.ApiErrorNotes.Services.SolutionService;
import com.apierrornotes.ApiErrorNotes.Services.SolutionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@Controller
@RequestMapping("/solution")

public class SolutionController {
    @Autowired
    private final SolutionService solutionService;
    @PostMapping("/create")
    public String create(@RequestBody Solution solution) {
        return solutionService.creer(solution);
    }


    @GetMapping("/read")
    public List<Solution> read(Solution solution) {
        return solutionService.lire();
    }


    @PutMapping("/update/{id_solution}")
    public Solution update(@PathVariable Long id_solution, @RequestBody Solution solution) {
        return solutionService.modifier(id_solution, solution);

    }

    @DeleteMapping("/delete/{id_solution}")
    public String delete(@PathVariable Long id_solution) {
        solutionService.Supprimer(id_solution);
        return "Solution supprimée avec succès";
    }

}
