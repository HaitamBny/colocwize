package com.mycoliving.userservice.Domain.DTO.locataire;

import com.mycoliving.userservice.Domain.DTO.preference.PreferenceReadDto;
import com.mycoliving.userservice.Domain.DTO.profile.ProfileReadDto;
import com.mycoliving.userservice.Domain.DTO.review.ReviewReadDto;
import com.mycoliving.userservice.Domain.DTO.role.RoleReadDto;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * DTO for {@link com.mycoliving.userservice.Domain.Entity.Locataire}
 */
public class LocataireReadDto implements Serializable {
    private final Long id;
    private final String email;
    private final String nom;
    private final String prenom;
    private final String telephone;
    private final Integer age;
    private final String ville;
    private final Set<RoleReadDto> roles;
    private final Double Budget;
    private final String Villepreferee;
    private final List<ReviewReadDto> reviews;
    private final ProfileReadDto profile;
    private final PreferenceReadDto preference;

    public LocataireReadDto(Long id, String email, String nom, String prenom, String telephone, Integer age, String ville, Set<RoleReadDto> roles, Double budget, String villepreferee, List<ReviewReadDto> reviews, ProfileReadDto profile, PreferenceReadDto preference) {
        this.id = id;
        this.email = email;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.age = age;
        this.ville = ville;
        this.roles = roles;
        Budget = budget;
        Villepreferee = villepreferee;
        this.reviews = reviews;
        this.profile = profile;
        this.preference = preference;
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

    public Double getBudget() {
        return Budget;
    }

    public String getVillepreferee() {
        return Villepreferee;
    }

    public List<ReviewReadDto> getReviews() {
        return reviews;
    }

    public ProfileReadDto getProfile() {
        return profile;
    }

    public PreferenceReadDto getPreference() {
        return preference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocataireReadDto entity = (LocataireReadDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.email, entity.email) &&
                Objects.equals(this.nom, entity.nom) &&
                Objects.equals(this.prenom, entity.prenom) &&
                Objects.equals(this.telephone, entity.telephone) &&
                Objects.equals(this.age, entity.age) &&
                Objects.equals(this.ville, entity.ville) &&
                Objects.equals(this.roles, entity.roles) &&
                Objects.equals(this.Budget, entity.Budget) &&
                Objects.equals(this.Villepreferee, entity.Villepreferee) &&
                Objects.equals(this.reviews, entity.reviews) &&
                Objects.equals(this.profile, entity.profile) &&
                Objects.equals(this.preference, entity.preference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, nom, prenom, telephone, age, ville, roles, Budget, Villepreferee, reviews, profile, preference);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "email = " + email + ", " +
                "nom = " + nom + ", " +
                "prenom = " + prenom + ", " +
                "telephone = " + telephone + ", " +
                "age = " + age + "ans, " +
                "ville = " + ville + ", " +
                "roles = " + roles + ", " +
                "Budget = " + Budget + ", " +
                "Villepreferee = " + Villepreferee + ", " +
                "reviews = " + reviews + ", " +
                "profile = " + profile + ", " +
                "preference = " + preference + ")";
    }
}