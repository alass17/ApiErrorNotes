package com.apierrornotes.ApiErrorNotes.Repository;

import com.apierrornotes.ApiErrorNotes.Models.Probleme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProblemeRepo extends JpaRepository<Probleme,Long> {
}
