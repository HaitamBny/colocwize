package com.mycoliving.userservice.Domain.DTO.locataire;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import jakarta.validation.constraints.*;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

/**
 * DTO for {@link com.mycoliving.userservice.Domain.Entity.Locataire}
 */
public class LocataireCreateUpdateDto implements Serializable {
    @Email
    @NotBlank
    private final String email;
    @NotBlank
    @Size(min = 6, max = 20)
    private final String password;
    @NotBlank
    @Size(max = 50)
    private final String nom;
    @NotBlank
    @Size(max = 50)
    private final String prenom;
    @Pattern(regexp = "^[0-9 +()-]{6,20}$")
    private final String telephone;
    @PositiveOrZero
    private final Integer age;
    @Size(max = 50)
    private final String ville;
    @PositiveOrZero(message = "Le budget doit être positif")
    private final Double Budget;
    @Size(max = 100)
    private final String Villepreferee;
    @JsonSetter(nulls = Nulls.AS_EMPTY)
    private final Set<Long> roleIds;
    private final Long profileId;
    private final Long preferenceId;

    public LocataireCreateUpdateDto(String email, String password, String nom, String prenom, String telephone, Integer age, String ville, Double budget, String villepreferee, Set<Long> roleIds, Long profileId, Long preferenceId) {
        this.email = email;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.age = age;
        this.ville = ville;
        Budget = budget;
        Villepreferee = villepreferee;
        this.roleIds = roleIds;
        this.profileId = profileId;
        this.preferenceId = preferenceId;
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

    public Double getBudget() {
        return Budget;
    }

    public String getVillepreferee() {
        return Villepreferee;
    }

    public Set<Long> getRoleIds() {return roleIds;}

    public Long getProfileId() {
        return profileId;
    }

    public Long getPreferenceId() {
        return preferenceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocataireCreateUpdateDto entity = (LocataireCreateUpdateDto) o;
        return Objects.equals(this.email, entity.email) &&
                Objects.equals(this.password, entity.password) &&
                Objects.equals(this.nom, entity.nom) &&
                Objects.equals(this.prenom, entity.prenom) &&
                Objects.equals(this.telephone, entity.telephone) &&
                Objects.equals(this.age, entity.age) &&
                Objects.equals(this.ville, entity.ville) &&
                Objects.equals(this.Budget, entity.Budget) &&
                Objects.equals(this.Villepreferee, entity.Villepreferee) &&
                Objects.equals(this.roleIds, entity.roleIds) &&
                Objects.equals(this.profileId, entity.profileId) &&
                Objects.equals(this.preferenceId, entity.preferenceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password, nom, prenom, telephone, age, ville, Budget, Villepreferee, roleIds, profileId, preferenceId);
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
                "Budget = " + Budget + ", " +
                "Villepreferee = " + Villepreferee + ", " +
                "roleIds = " + roleIds + ", " +
                "profileId = " + profileId + ", " +
                "preferenceId = " + preferenceId + ")";
    }
}