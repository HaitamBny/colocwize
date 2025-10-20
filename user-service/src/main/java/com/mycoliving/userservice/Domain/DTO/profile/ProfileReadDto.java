package com.mycoliving.userservice.Domain.DTO.profile;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.mycoliving.userservice.Domain.Entity.Profile}
 */
public class ProfileReadDto implements Serializable {
    private final Long id;
    private final String prenom;
    private final String nom;
    private final Integer age;
    private final String ville;
    private final String telephone;
    private final String description;

    public ProfileReadDto(Long id, String prenom, String nom, Integer age, String ville, String telephone, String description) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.ville = ville;
        this.telephone = telephone;
        this.description = description;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfileReadDto entity = (ProfileReadDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.prenom, entity.prenom) &&
                Objects.equals(this.nom, entity.nom) &&
                Objects.equals(this.age, entity.age) &&
                Objects.equals(this.ville, entity.ville) &&
                Objects.equals(this.telephone, entity.telephone) &&
                Objects.equals(this.description, entity.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, prenom, nom, age, ville, telephone, description);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "prenom = " + prenom + ", " +
                "nom = " + nom + ", " +
                "age = " + age + ", " +
                "ville = " + ville + ", " +
                "telephone = " + telephone + ", " +
                "description = " + description + ")";
    }
}