package com.apierrornotes.ApiErrorNotes.Services;

import com.apierrornotes.ApiErrorNotes.Models.User;

import java.util.List;


public interface UserService {
    String creer (User  user);
    List<User> lire();
    String Supprimer (Long id);
    User modifier(Long id, User user);
    String sedeconnecter();
    //User Seconnecter(String email,String mdp);
    String Seconnecter(String email,String mdp);


    String creerCompte(User user);
}
