package com.apierrornotes.ApiErrorNotes.Repository;

import com.apierrornotes.ApiErrorNotes.Models.Probleme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProblemeRepo extends JpaRepository<Probleme,Long> {

    /* Requete permettant de faire des recherches par mot_cle*/
    @Query(value = "SELECT * FROM probleme WHERE probleme.titre LIKE %?1%" +
            " OR probleme.description LIKE %?1%"+
            " OR probleme.technologie LIKE %?1%", nativeQuery = true)
    List<Probleme> findAll(String mot_cle);
}
