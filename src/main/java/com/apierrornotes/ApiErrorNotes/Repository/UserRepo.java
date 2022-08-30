package com.apierrornotes.ApiErrorNotes.Repository;

import com.apierrornotes.ApiErrorNotes.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Long> {


    boolean existsByContacts(Long contacts);

    boolean existsByEmail(String email);


    //Optional<User> findByEmailAndMdp(String email, String mdp);
    User findByEmailAndMdp(String email, String mdp);
}
