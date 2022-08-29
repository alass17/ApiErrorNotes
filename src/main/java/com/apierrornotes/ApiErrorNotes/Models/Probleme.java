package com.apierrornotes.ApiErrorNotes.Models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "PROBLEMES")

public class Probleme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_probleme;
    private String titre;
    private String description, technologie;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @Autowired
    private User user;

    @OneToOne
    @JoinColumn(name = "solution_id_solution")
    @Autowired
    private Solution solution;

}