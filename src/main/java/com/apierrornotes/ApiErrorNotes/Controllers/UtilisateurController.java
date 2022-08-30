package com.apierrornotes.ApiErrorNotes.Controllers;

import com.apierrornotes.ApiErrorNotes.Models.User;
import com.apierrornotes.ApiErrorNotes.Repository.UserRepo;
import com.apierrornotes.ApiErrorNotes.Services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")
@RestController
@AllArgsConstructor
public class UtilisateurController {

    @Autowired
    private final UserService userService;

    @PostMapping("/create")
    public String create(@RequestBody User user) {
        return userService.creer(user);
    }


    @GetMapping("/read")
    public List<User> read(User user) {
        return userService.lire();
    }


    @PutMapping("/update/{id}")
    public User update(@PathVariable Long id, @RequestBody User user) {
        return userService.modifier(id, user);

    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        userService.Supprimer(id);
        return "Utilisateur supprimé avec succès";
    }

    @GetMapping("/connexion/{email}/{mdp}")
    public String connexion(@PathVariable("email") String email, @PathVariable("mdp") String mdp) {
        /*if (this.userService.Seconnecter(email, mdp) == null) {
            return "failed";
        }
        this.userService.Seconnecter(email, mdp);
        return "vous etes connectée";*/
        return userService.Seconnecter(email,mdp);

    }

}
