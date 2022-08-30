package com.apierrornotes.ApiErrorNotes.Services;

import com.apierrornotes.ApiErrorNotes.Models.Probleme;

import java.util.List;
import java.util.Objects;

public interface ProblemeService {

    Probleme creer (Probleme probleme);
    List<Probleme> lire();
    Probleme modifier (Long id_probleme,Probleme probleme);

    String Supprimer(Long id_probleme);

    //Rechercher par mot clé
    Object recherche(String mot_cle);

}

