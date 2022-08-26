package com.apierrornotes.ApiErrorNotes.Services;

import com.apierrornotes.ApiErrorNotes.Models.Probleme;
import com.apierrornotes.ApiErrorNotes.Repository.ProblemeRepo;

import java.util.List;

public class ProblemeServiceImpl implements ProblemeService {

        ProblemeRepo problemeRepo;
        @Override
        public Probleme creer(Probleme probleme) {
            return problemeRepo.save(probleme);
        }

        @Override
        public String supprimer(Long id) {
            return "Probleme supprimé !!";
        }

        @Override
        public List<Probleme> lire() {
            return problemeRepo.findAll();
        }

        @Override
        public Probleme modifier(Long id, Probleme probleme) {
            return problemeRepo.findById(id)
                    .map(p->{
                        p.setTitre(probleme.getTitre());
                        p.setDescription(probleme.getDescription());
                        p.setTechnologie(probleme.getTechnologie());

                        return problemeRepo.save(p);
                    }).orElseThrow(() -> new RuntimeException("Probleme non trouvé!!"));
        };
    }

