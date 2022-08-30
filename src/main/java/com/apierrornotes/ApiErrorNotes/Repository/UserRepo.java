package com.apierrornotes.ApiErrorNotes.Repository;

import com.apierrornotes.ApiErrorNotes.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Long> {


    /* Vérification au moment d'inscription d'un utilisateur
    si son contact donné éxiste déjà dans la base de donnée
     */
    boolean existsByContacts(Long contacts);

 /* Vérification au moment d'inscription d'un utilisateur si
  l'email donné éxiste déjà dans la base  de donnée
     */
    boolean existsByEmail(String email);

     // Permet à l'utilisateur de se connecter
    Optional<User> findByEmailAndMdp(String email, String mdp);
}
