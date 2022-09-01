package com.apierrornotes.ApiErrorNotes.Controllers;

import com.apierrornotes.ApiErrorNotes.Models.Solution;
import com.apierrornotes.ApiErrorNotes.Repository.SolutionRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SolutionControllerTest {

    @Autowired
    SolutionRepo solutionRepo;

    @Test

    void create() {
        Solution test=new Solution();
        test.setRessource("dfg");
        test.setMethodologie("edfgh");
        test.setDescription("HAHAG");
        test.setDate(new Date());
        Solution sol=solutionRepo.save(test);


    }


    @Test
    void read() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {

            Solution test=new Solution();
            test.setRessource("dfg");
            test.setMethodologie("edfgh");
            test.setDescription("HAHAG");
            test.setDate(new Date());
            Solution sol=solutionRepo.save(test);
            solutionRepo.deleteById(sol.getId_solution());
    }
}