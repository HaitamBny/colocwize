package com.mycoliving.userservice.Domain.Entity;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.List;
import java.util.Set;

@Entity
@DiscriminatorValue("LOCATAIRE")
public class Locataire extends User{

    private Double budget;  // ✅ Changé de "Budget" à "budget"
    private String villepreferee;  // ✅ Changé de "Villepreferee" à "villepreferee"

    @OneToMany(mappedBy = "locataire", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Review> reviews;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id")
    private Profile profile;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "preference_id")
    private Preference preference;

    public Locataire() {
    }

    public Locataire(Long id, String email, String password, String nom, String prenom, String telephone, Integer age, String ville, Instant createdAt, Instant updatedAt, Set<Role> roles, Double budget, String villepreferee, List<Review> reviews, Profile profile, Preference preference) {
        super(id, email, password, nom, prenom, telephone, age, ville, createdAt, updatedAt, roles);
        this.budget = budget;  // ✅ Changé
        this.villepreferee = villepreferee;  // ✅ Changé
        this.reviews = reviews;
        this.profile = profile;
        this.preference = preference;
    }

    // Getters
    public Double getBudget() {
        return budget;  // ✅ Changé
    }
    public String getVillepreferee() {
        return villepreferee;  // ✅ Changé
    }
    public List<Review> getReviews() {
        return reviews;
    }
    public Profile getProfile() {
        return profile;
    }
    public Preference getPreference() {
        return preference;
    }


    // Setters
    public void setBudget(Double budget) {
        this.budget = budget;  // ✅ Changé
    }
    public void setVillepreferee(String villepreferee) {
        this.villepreferee = villepreferee;  // ✅ Changé
    }
    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
    public void setProfile(Profile profile) {
        this.profile = profile;
    }
    public void setPreference(Preference preference) {
        this.preference = preference;
    }
}