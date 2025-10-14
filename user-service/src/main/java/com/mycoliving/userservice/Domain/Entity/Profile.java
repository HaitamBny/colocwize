package com.mycoliving.userservice.Domain.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "profiles")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String prenom;
    private String nom;
    private Integer age;
    private String ville;
    private String telephone;
    private String description;

    public Profile() {}

    public Profile(Long id, String prenom, String nom, Integer age, String ville, String telephone, String description) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.ville = ville;
        this.telephone = telephone;
        this.description = description;
    }

    // Getters
    public Long getId() {
        return id;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getNom() {
        return nom;
    }
    public Integer getAge() {
        return age;
    }
    public String getVille() {
        return ville;
    }
    public String getTelephone() {
        return telephone;
    }
    public String getDescription() {
        return description;
    }


    // Setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
