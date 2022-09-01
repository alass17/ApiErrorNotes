package com.apierrornotes.ApiErrorNotes.Controllers;

import com.apierrornotes.ApiErrorNotes.Models.Probleme;
import com.apierrornotes.ApiErrorNotes.Models.User;
import com.apierrornotes.ApiErrorNotes.Repository.ProblemeRepo;
import com.apierrornotes.ApiErrorNotes.Repository.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UtilisateurControllerTest {

    @Autowired
    UserRepo userRepo;


    @Test
    void create() {

        User test=new User();
        test.setEmail("dfg");
        test.setNom("edfgh");
        test.setPrenom("HAHAG");
        test.setContacts(2345L);
        test.setMdp("dfcvg");
        User user =userRepo.save(test);

    }

    @Test
    void createC() {
    }

    @Test
    void read() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
        User test=new User();
        test.setEmail("dfg");
        test.setNom("edfgh");
        test.setPrenom("HAHAG");
        test.setContacts(2345L);
        test.setMdp("dfcvg");
        User user=userRepo.save(test);
        userRepo.deleteById(user.getId());

    }

    @Test
    void connexion() {
    }
}