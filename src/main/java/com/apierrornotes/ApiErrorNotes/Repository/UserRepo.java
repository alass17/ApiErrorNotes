package com.apierrornotes.ApiErrorNotes.Repository;

import com.apierrornotes.ApiErrorNotes.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
