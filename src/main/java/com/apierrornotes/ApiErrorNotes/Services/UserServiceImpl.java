package com.apierrornotes.ApiErrorNotes.Services;

import com.apierrornotes.ApiErrorNotes.Models.User;
import com.apierrornotes.ApiErrorNotes.Repository.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;


    //Cette condition nous permet de verifier par email si utilisateur exixte dans la base de donnée
    @Override
    public String creer(User user) {
        if(userRepo.existsByEmail(user.getEmail())){
            return "Cet utilisateur existe deja !!";
        }
        userRepo.save(user);
        return "Utilisateur enregistré !!";
    }

    @Override
    public List<User> lire() {
        return userRepo.findAll();
    }

    @Override
    public String Supprimer(Long id) {
        userRepo.deleteById(id);
        return "Utilisateur supprimé";
    }

    @Override
    public User modifier(Long id, User user) {
        return userRepo.findById(id)
                .map(u -> {
                    u.setNom(user.getNom());
                    u.setPrenom(user.getPrenom());
                    u.setContacts(user.getContacts());
                    u.setRole(user.getRole());
                    return userRepo.save(u);
                }).orElseThrow(() -> new RuntimeException("Utilisateur non trouvé !"));
    }

    @Override
    public String sedeconnecter() {
        return "deconnecter avec succès";
    }

    /*Cette condition nous permet de nous connecter en verifiant si l'adresse et le mdp
     existe dans la base de donnéé*/
    @Override
    public String Seconnecter(String email, String mdp) {
        User user = userRepo.findByEmailAndMdp(email,mdp);
        if (user == null) return "Failed !";
        else return "Connecté avec succès !";
    }

    /*@Override
    public User Seconnecter(String email, String mdp) {
        Optional<User> user= userRepo.findByEmailAndMdp(email,mdp);
        // TTT
        if (user.isPresent()){
            return null;
        }
        return user.get();

    }*/


}