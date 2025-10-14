package com.mycoliving.userservice.Domain.Entity;

import jakarta.persistence.*;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 50,unique = true)
    private String nom;


    public Role() {
    }

    public Role(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    // Getters
    public Long getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
}
