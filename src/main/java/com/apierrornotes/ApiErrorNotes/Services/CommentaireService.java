package com.apierrornotes.ApiErrorNotes.Services;

import com.apierrornotes.ApiErrorNotes.Models.Commentaire;
import com.apierrornotes.ApiErrorNotes.Models.User;

import java.util.List;

public interface CommentaireService {
    //Permet de créer un commentaire
    String creer (Commentaire commentaire);

    //Permet de lister les commentaires
    List<Commentaire> lire();

    //Permet de supprimer les commentaires
    String Supprimer (Long id_commentaire);
    //Permet de modifier les commentaires
    Commentaire modifier(Long id_commentaire, Commentaire commentaire);

}
