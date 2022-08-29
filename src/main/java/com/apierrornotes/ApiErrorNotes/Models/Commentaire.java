package com.apierrornotes.ApiErrorNotes.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Commentaire")
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_commentaire;

    @Column(length = 100,nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "solution_id_solution")
    @Autowired
    private Solution solution;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @Autowired
    private User user;

}
