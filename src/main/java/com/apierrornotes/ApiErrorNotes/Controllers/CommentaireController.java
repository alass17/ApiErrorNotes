package com.apierrornotes.ApiErrorNotes.Controllers;

import com.apierrornotes.ApiErrorNotes.Models.Commentaire;
import com.apierrornotes.ApiErrorNotes.Models.User;
import com.apierrornotes.ApiErrorNotes.Services.CommentaireService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/commentaire/")
@RestController
@AllArgsConstructor

public class CommentaireController {
    @Autowired
    private final CommentaireService commentaireService;

    @PostMapping("/create")
    public String create(@RequestBody Commentaire commentaire) {
        return commentaireService.creer(commentaire);
    }


    @GetMapping("/read")
    public List<Commentaire> read(Commentaire commentaire) {
        return commentaireService.lire();
    }


    @PutMapping("/update/{id_commentaire}")
    public Commentaire update(@PathVariable Long id_commentaire, @RequestBody Commentaire commentaire) {
        return commentaireService.modifier(id_commentaire, commentaire);

    }

    @DeleteMapping("/delete/{id_commentaire}")
    public String delete(@PathVariable Long id_commentaire) {
        commentaireService.Supprimer(id_commentaire);
        return "Commentaire supprimé avec succès";
    }

}

