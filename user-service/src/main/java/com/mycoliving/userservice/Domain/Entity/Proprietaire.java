package com.mycoliving.userservice.Domain.Entity;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.List;
import java.util.Set;


@Entity
@DiscriminatorValue("PROPRIETAIRE")
public class Proprietaire extends User{

    private Boolean verified = false;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id")
    private Profile profile;

    // Les propriétés seront dans le service ad-service,
    // donc on ne fait ici qu'une référence symbolique.
    @ElementCollection
    @CollectionTable(name = "proprietaire_properties", joinColumns = @JoinColumn(name = "proprietaire_id"))
    @Column(name = "property_id")
    private List<Long> propertyIds; // Références d'annonces dans ad-service

    public Proprietaire() {
    }

    public Proprietaire(Long id, String email, String password, String nom, String prenom, String telephone, Integer age, String ville, Instant createdAt, Instant updatedAt, Set<Role> roles, Boolean verified, Profile profile, List<Long> propertyIds) {
        super(id, email, password, nom, prenom, telephone, age, ville, createdAt, updatedAt, roles);
        this.verified = verified;
        this.profile = profile;
        this.propertyIds = propertyIds;
    }


    // Getters
    public Boolean getVerified() {
        return verified;
    }
    public Profile getProfile() {
        return profile;
    }
    public List<Long> getPropertyIds() {
        return propertyIds;
    }


    // Setters
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }
    public void setProfile(Profile profile) {
        this.profile = profile;
    }
    public void setPropertyIds(List<Long> propertyIds) {
        this.propertyIds = propertyIds;
    }
}
