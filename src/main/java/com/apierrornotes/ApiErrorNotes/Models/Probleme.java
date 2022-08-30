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
@Table(name = "PROBLEME")

public class Probleme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_probleme;
    @Column(length = 50,nullable = false)
    private String titre;
    @Column(length = 100,nullable = false)
    private String description;
    @Column(length = 50,nullable = false)
    private String technologie;
    @Column(length = 50,nullable = false)
    private  String etat;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @Autowired
    private User user;

    @OneToOne
    @JoinColumn(name = "solution_id_solution")
    @Autowired
    private Solution solution;

}