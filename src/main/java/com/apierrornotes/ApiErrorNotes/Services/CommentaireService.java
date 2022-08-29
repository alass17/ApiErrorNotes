package com.apierrornotes.ApiErrorNotes.Services;

import com.apierrornotes.ApiErrorNotes.Models.Commentaire;
import com.apierrornotes.ApiErrorNotes.Models.User;

import java.util.List;

public interface CommentaireService {

    String creer (Commentaire commentaire);
    List<Commentaire> lire();
    String Supprimer (Long id_commentaire);
    Commentaire modifier(Long id_commentaire, Commentaire commentaire);

}
