package com.mycoliving.userservice.Domain.Entity;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "locataires")
public class Locataire extends User{

    private Double Budget ;
    private String Villepreferee ;

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
        this.Budget = budget;
        this.Villepreferee = villepreferee;
        this.reviews = reviews;
        this.profile = profile;
        this.preference = preference;
    }

    // Getters
    public Double getBudget() {
        return Budget;
    }
    public String getVillepreferee() {
        return Villepreferee;
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
        Budget = budget;
    }
    public void setVillepreferee(String villepreferee) {
        Villepreferee = villepreferee;
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
