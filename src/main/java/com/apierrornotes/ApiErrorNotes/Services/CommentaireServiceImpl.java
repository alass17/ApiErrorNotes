package com.apierrornotes.ApiErrorNotes.Services;

import com.apierrornotes.ApiErrorNotes.Models.Commentaire;
import com.apierrornotes.ApiErrorNotes.Models.User;
import com.apierrornotes.ApiErrorNotes.Repository.CommentaireRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CommentaireServiceImpl implements CommentaireService {
    private final CommentaireRepo commentaireRepo;

    @Override
    public String creer(Commentaire commentaire) {
        commentaireRepo.save(commentaire);
        return "Commentaire ajouté avec succès ";
    }

    @Override
    public List<Commentaire> lire() {

        return commentaireRepo.findAll();
    }

    @Override
    public String Supprimer(Long id_commentaire) {
        return "Commantaire supprimé ";
    }

    @Override
    public Commentaire modifier(Long id_commentaire, Commentaire commentaire) {
        return commentaireRepo.findById(id_commentaire)
                .map(c -> {
                    c.setDescription(commentaire.getDescription());

                    return commentaireRepo.save(c);
                }).orElseThrow(() -> new RuntimeException("Commentaire non trouvé !"));
    }
}