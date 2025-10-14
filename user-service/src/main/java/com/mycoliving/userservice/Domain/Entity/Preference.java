package com.mycoliving.userservice.Domain.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "preferences")
public class Preference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double minBudget;
    private Double maxBudget;
    private String locationPreferee;
    private String genreColoc; // mixte / homme / femme
    private String apartmentType;  // studio, T2, T3…
    private Boolean petsAllowed;

    public Preference() {}

    public Preference(Long id, Double minBudget, Double maxBudget, String locationPreferee, String genreColoc, String apartmentType, Boolean petsAllowed) {
        this.id = id;
        this.minBudget = minBudget;
        this.maxBudget = maxBudget;
        this.locationPreferee = locationPreferee;
        this.genreColoc = genreColoc;
        this.apartmentType = apartmentType;
        this.petsAllowed = petsAllowed;
    }

    // Getters
    public Long getId() {
        return id;
    }
    public Double getMinBudget() {
        return minBudget;
    }
    public Double getMaxBudget() {
        return maxBudget;
    }
    public String getLocationPreferee() {
        return locationPreferee;
    }
    public String getGenreColoc() {
        return genreColoc;
    }
    public String getApartmentType() {
        return apartmentType;
    }
    public Boolean getPetsAllowed() {
        return petsAllowed;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setMinBudget(Double minBudget) {
        this.minBudget = minBudget;
    }
    public void setMaxBudget(Double maxBudget) {
        this.maxBudget = maxBudget;
    }
    public void setLocationPreferee(String locationPreferee) {
        this.locationPreferee = locationPreferee;
    }
    public void setGenreColoc(String genreColoc) {
        this.genreColoc = genreColoc;
    }
    public void setApartmentType(String apartmentType) {
        this.apartmentType = apartmentType;
    }
    public void setPetsAllowed(Boolean petsAllowed) {
        this.petsAllowed = petsAllowed;
    }
}
