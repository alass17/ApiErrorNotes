package com.apierrornotes.ApiErrorNotes.Services;

import com.apierrornotes.ApiErrorNotes.Models.Probleme;
import com.apierrornotes.ApiErrorNotes.Models.Solution;
import com.apierrornotes.ApiErrorNotes.Models.User;
import com.apierrornotes.ApiErrorNotes.Repository.SolutionRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service

public class SolutionServiceImpl implements SolutionService {
    @Autowired
    private final SolutionRepo solutionRepo;

    @Override
    public String creer(Solution solution) {
        solutionRepo.save(solution);

        return "Solution ajoutée";
    }

    @Override
    public List<Solution> lire() {
        return solutionRepo.findAll();
    }

    @Override
    public String Supprimer(Long id_solution) {
        solutionRepo.deleteById(id_solution);
        return "Solution supprimée";
    }

    @Override
    public Solution modifier(Long id_solution, Solution solution) {
        return solutionRepo.findById(id_solution)
                .map(s -> {
                    s.setDescription(solution.getDescription());
                    s.setMethodologie(solution.getMethodologie());
                    s.setRessource(solution.getRessource());

                    return solutionRepo.save(s);
                }).orElseThrow(() -> new RuntimeException("Probleme non trouvé!!"));
    }
}