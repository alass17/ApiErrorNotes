package com.apierrornotes.ApiErrorNotes.Services;

import com.apierrornotes.ApiErrorNotes.Models.User;
import com.apierrornotes.ApiErrorNotes.Repository.UserRepo;

import java.util.List;

public class UserServiceImpl implements UserService{
    UserRepo userRepo;
    @Override
    public User creer(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> lire() {
        return userRepo.findAll();
    }

    @Override
    public String Supprimer(Long id) {
        return "Utilisateur supprimé";
    }

    @Override
    public User modifier(Long id, User user) {
        return userRepo.findById(id)
                .map(u->{
                    u.setNom(user.getNom());
                    u.setPrenom(user.getPrenom());
                    u.setContacts(user.getContacts());
                    u.setRole_user(user.getRole_user());
                    return userRepo.save(u);
                }).orElseThrow(() -> new RuntimeException("Population non trouvée !"));
    }

}

