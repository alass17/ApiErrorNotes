package com.apierrornotes.ApiErrorNotes.Controllers;

import com.apierrornotes.ApiErrorNotes.Models.Commentaire;
import com.apierrornotes.ApiErrorNotes.Repository.CommentaireRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

class CommentaireControllerTest {

    @Autowired
    CommentaireRepo commentaireRepo;
    @Test
    void create() {
        Commentaire test=new Commentaire();

        test.setDescription("HAHAG");
        Commentaire commentaireSave=commentaireRepo.save(test);

    }

    @Test
    void read() {

    }

    @Test
    void update() {
    }

    @Test
    void delete() {
        Commentaire test=new Commentaire();
        test.setId_commentaire(1L);
        test.setDescription("HAHAG");
        Commentaire commentaireSave=commentaireRepo.save(test);
        commentaireRepo.deleteById(commentaireSave.getId_commentaire());
    }
}