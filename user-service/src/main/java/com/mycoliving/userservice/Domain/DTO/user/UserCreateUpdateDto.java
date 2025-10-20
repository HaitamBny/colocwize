package com.mycoliving.userservice.Domain.DTO.user;


import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import jakarta.validation.constraints.*;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

/**
 * DTO for {@link com.mycoliving.userservice.Domain.Entity.User}
 */
public class UserCreateUpdateDto implements Serializable {
    @Email(message = "Format d'email invalide")
    @NotBlank(message = "L'email est obligatoire")
    private final String email;
    @NotBlank(message = "Le mot de passe est obligatoire")
    @Size(min = 6, max = 20, message = "Le mot de passe doit contenir entre 6 et 20 caractères")
    private final String password;
    @NotBlank(message = "Le nom est obligatoire")
    @Size(max = 50)
    private final String nom;
    @NotBlank(message = "Le prénom est obligatoire")
    @Size(max = 50)
    private final String prenom;
    @Pattern(regexp = "^[0-9 +()-]{6,20}$")
    private final String telephone;
    @PositiveOrZero(message = "L'âge doit être positif")
    private final Integer age;
    @Size(max = 50)
    private final String ville;
    @JsonSetter(nulls = Nulls.AS_EMPTY)
    private final Set<Long> roleIds;

    public UserCreateUpdateDto(String email, String password, String nom, String prenom, String telephone, Integer age, String ville, Set<Long> roleIds) {
        this.email = email;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.age = age;
        this.ville = ville;
        this.roleIds = roleIds;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
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

    public Set<Long> getRoleIds() {
        return roleIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserCreateUpdateDto entity = (UserCreateUpdateDto) o;
        return Objects.equals(this.email, entity.email) &&
                Objects.equals(this.password, entity.password) &&
                Objects.equals(this.nom, entity.nom) &&
                Objects.equals(this.prenom, entity.prenom) &&
                Objects.equals(this.telephone, entity.telephone) &&
                Objects.equals(this.age, entity.age) &&
                Objects.equals(this.ville, entity.ville) &&
                Objects.equals(this.roleIds, entity.roleIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password, nom, prenom, telephone, age, ville, roleIds);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "email = " + email + ", " +
                "password = " + password + ", " +
                "nom = " + nom + ", " +
                "prenom = " + prenom + ", " +
                "telephone = " + telephone + ", " +
                "age = " + age + ", " +
                "ville = " + ville + ", " +
                "roleIds = " + roleIds + ")";
    }
}