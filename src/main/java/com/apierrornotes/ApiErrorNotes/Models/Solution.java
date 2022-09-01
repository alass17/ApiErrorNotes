package com.apierrornotes.ApiErrorNotes.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Solution")
@NoArgsConstructor
public class Solution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_solution;
    //@Column(length = 150,nullable = false)
    private String description;
  //  @Column(length = 150,nullable = false)
    private String ressource;
    //@Column(length = 100,nullable = false)
    private String methodologie;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @Autowired
    private User user;



}
