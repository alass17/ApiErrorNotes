package com.apierrornotes.ApiErrorNotes.Services;

import com.apierrornotes.ApiErrorNotes.Models.User;

import java.util.List;


public interface UserService {
    String creer (User  user);
    List<User> lire();
    String Supprimer (Long id);
    User modifier(Long id, User user);


}
