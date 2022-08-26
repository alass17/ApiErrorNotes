package com.apierrornotes.ApiErrorNotes.Services;

import com.apierrornotes.ApiErrorNotes.Models.Probleme;

import java.util.List;

public interface ProblemeService {

    Probleme creer (Probleme probleme);
    String supprimer(Long id);
    List<Probleme> lire();
    Probleme modifier (Long id,Probleme probleme);
}

