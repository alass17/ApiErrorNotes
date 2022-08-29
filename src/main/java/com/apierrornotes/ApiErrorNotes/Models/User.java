package com.apierrornotes.ApiErrorNotes.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50,nullable = false)
    private String nom,prenom;
    private Long contacts;
    @Column(length = 10,nullable = false)
    private String mdp;
    private String email;
    @Enumerated(EnumType.STRING)
    private Role role;

}
