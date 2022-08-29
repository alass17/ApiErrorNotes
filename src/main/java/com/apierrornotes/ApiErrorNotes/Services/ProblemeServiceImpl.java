package com.apierrornotes.ApiErrorNotes.Services;

import com.apierrornotes.ApiErrorNotes.Models.Probleme;
import com.apierrornotes.ApiErrorNotes.Repository.ProblemeRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProblemeServiceImpl implements ProblemeService {

    ProblemeRepo problemeRepo;

    @Override
    public Probleme creer(Probleme probleme) {
        return problemeRepo.save(probleme);
    }



    @Override
    public List<Probleme> lire() {
        return problemeRepo.findAll();
    }

    @Override
    public Probleme modifier(Long id, Probleme probleme) {
        return problemeRepo.findById(id)
                .map(p -> {
                    p.setTitre(probleme.getTitre());
                    p.setDescription(probleme.getDescription());
                    p.setTechnologie(probleme.getTechnologie());

                    return problemeRepo.save(p);
                }).orElseThrow(() -> new RuntimeException("Probleme non trouvé!!"));
    }


    //L'implémentation de la méthode recherche avec les conditions
    @Override
    public Object recherche(String mot_cle) {
        if (mot_cle != null) {
            List<Probleme> resultat = problemeRepo.findAll(mot_cle);
            if (resultat.size() != 0) {
                return resultat;
            } else {
                return "Aucun résultat trouvé.";
            }
        }
        return problemeRepo.findAll();

    }

    @Override
    public String Supprimer(Long id_probleme) {
        return "Probleme supprimé !!";
    }

}
