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
    private final UserRepo userRepo;
    @PostMapping("/create")
    public String create(@RequestBody User user) {
        return userService.creer(user);
    }

    @PostMapping("/createC")
    public String createC(@RequestBody User user) {
        return userService.creerCompte(user);
    }



    @GetMapping("/read")
    public List<User> read(User user) {
        return userService.lire();
    }


    @PutMapping("/update/{id}")
    public User update(@PathVariable Long id, @RequestBody User user) {
        return userService.modifier(id, user);

    }

    @DeleteMapping("/delete/{email}/{id}")
        public String  delete (@PathVariable("email") String email, @PathVariable Long id){

            User user = userRepo.findByEmail(email);
            Long IdUserPost = user.getId();

            if (IdUserPost == id)
            {
                userService.Supprimer(id);
                return "Vous etes utilisateurs de ce compte et vous l'avez supprimer";
            }
            else if(user.getRole().equals("ROLE_ADMIN"))
            {
                userService.Supprimer(id);
                return "Compte supprimer par l'administrateur avec succès";
            }

            else
            {
                return "Impossible de supprimer un compte d'autrui";
            }


        }

    @GetMapping("/connexion/{email}/{mdp}")
    public String connexion(@PathVariable("email") String email, @PathVariable("mdp") String mdp) {
        if (this.userService.Seconnecter(email, mdp) == null) {
            return "failed";
        }
        this.userService.Seconnecter(email, mdp);
        return "vous etes connectée";

    }

}
