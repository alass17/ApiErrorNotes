package com.apierrornotes.ApiErrorNotes.Controllers;

import com.apierrornotes.ApiErrorNotes.Models.Probleme;
import com.apierrornotes.ApiErrorNotes.Models.User;
import com.apierrornotes.ApiErrorNotes.Services.ProblemeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/probleme")
@RestController
@AllArgsConstructor
public class ProblemeController {
    @Autowired
    private final ProblemeService problemeService;

    @GetMapping("/lire")
    public List<Probleme> read(Probleme probleme) {
        return problemeService.lire();
    }

    @PostMapping("/ajouter")
    public String create(@RequestBody Probleme probleme) {
        problemeService.creer(probleme);
        return "Votre problème a été ajouté avec succès !!";
    }
    @PutMapping("/update/{id_probleme}")
    public Probleme update(@PathVariable Long id_probleme, @RequestBody Probleme probleme) {
        return problemeService.modifier(id_probleme, probleme);

    }
    @DeleteMapping("/delete/{id_probleme}")
    public String delete(@PathVariable Long id_probleme) {
        problemeService.Supprimer(id_probleme);
        return "Utilisateur supprimé avec succès";
    }


}
