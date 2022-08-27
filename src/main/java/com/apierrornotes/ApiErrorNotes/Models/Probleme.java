package com.apierrornotes.ApiErrorNotes.Models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    private String description, Technologie;
}