package com.apierrornotes.ApiErrorNotes.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom,prenom;
    private Long contacts;
    private String mdp;
    private String email;
    @Enumerated(EnumType.STRING)
    private Role role;

}
