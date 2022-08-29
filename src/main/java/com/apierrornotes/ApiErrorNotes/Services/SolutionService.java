package com.apierrornotes.ApiErrorNotes.Services;

import com.apierrornotes.ApiErrorNotes.Models.Solution;
import com.apierrornotes.ApiErrorNotes.Models.User;

import java.util.List;

public interface SolutionService {
    String creer (Solution solution);
    List<Solution> lire();
    String Supprimer (Long id_solution);
    Solution modifier(Long id_solution, Solution solution);
}
