package com.mycoliving.userservice.Domain.DTO.user;

import com.mycoliving.userservice.Domain.DTO.role.RoleReadDto;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

/**
 * DTO for {@link com.mycoliving.userservice.Domain.Entity.User}
 */
public class UserReadDto implements Serializable {
    private final Long id;
    private final String email;
    private final String nom;
    private final String prenom;
    private final String telephone;
    private final Integer age;
    private final String ville;
    private final Set<RoleReadDto> roles;

    public UserReadDto(Long id, String email, String nom, String prenom, String telephone, Integer age, String ville, Set<RoleReadDto> roles) {
        this.id = id;
        this.email = email;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.age = age;
        this.ville = ville;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public Integer getAge() {
        return age;
    }

    public String getVille() {
        return ville;
    }

    public Set<RoleReadDto> getRoles() {
        return roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserReadDto entity = (UserReadDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.email, entity.email) &&
                Objects.equals(this.nom, entity.nom) &&
                Objects.equals(this.prenom, entity.prenom) &&
                Objects.equals(this.telephone, entity.telephone) &&
                Objects.equals(this.age, entity.age) &&
                Objects.equals(this.ville, entity.ville) &&
                Objects.equals(this.roles, entity.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, nom, prenom, telephone, age, ville, roles);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "email = " + email + ", " +
                "nom = " + nom + ", " +
                "prenom = " + prenom + ", " +
                "telephone = " + telephone + ", " +
                "age = " + age + ", " +
                "ville = " + ville + ", " +
                "roles = " + roles + ")";
    }
}