package com.apierrornotes.ApiErrorNotes.Controllers;

import com.apierrornotes.ApiErrorNotes.Models.Commentaire;
import com.apierrornotes.ApiErrorNotes.Models.Probleme;
import com.apierrornotes.ApiErrorNotes.Repository.ProblemeRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProblemeControllerTest {
    @Autowired
    ProblemeRepo problemeRepo;

    @Test
    void read() {

        Probleme test=new Probleme();
        test.setEtat("dfg");
        test.setTechnologie("edfgh");
        test.setDescription("HAHAG");
        test.setTitre("hjhjk");
        Probleme problemeSave=problemeRepo.save(test);

    }

    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {

        Probleme test=new Probleme();
        test.setEtat("dfg");
        test.setTechnologie("edfgh");
        test.setDescription("HAHAG");
        test.setTitre("hjhjk");
        Probleme problemeSave=problemeRepo.save(test);
        problemeRepo.deleteById(problemeSave.getId_probleme());

    }

    @Test
    void recherche() {
    }
}