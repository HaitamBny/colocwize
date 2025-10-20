package com.mycoliving.userservice.Domain.DTO.preference;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.mycoliving.userservice.Domain.Entity.Preference}
 */
public class PreferenceReadDto implements Serializable {
    private final Long id;
    private final Double minBudget;
    private final Double maxBudget;
    private final String locationPreferee;
    private final String genreColoc;
    private final String apartmentType;
    private final Boolean petsAllowed;

    public PreferenceReadDto(Long id, Double minBudget, Double maxBudget, String locationPreferee, String genreColoc, String apartmentType, Boolean petsAllowed) {
        this.id = id;
        this.minBudget = minBudget;
        this.maxBudget = maxBudget;
        this.locationPreferee = locationPreferee;
        this.genreColoc = genreColoc;
        this.apartmentType = apartmentType;
        this.petsAllowed = petsAllowed;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PreferenceReadDto entity = (PreferenceReadDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.minBudget, entity.minBudget) &&
                Objects.equals(this.maxBudget, entity.maxBudget) &&
                Objects.equals(this.locationPreferee, entity.locationPreferee) &&
                Objects.equals(this.genreColoc, entity.genreColoc) &&
                Objects.equals(this.apartmentType, entity.apartmentType) &&
                Objects.equals(this.petsAllowed, entity.petsAllowed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, minBudget, maxBudget, locationPreferee, genreColoc, apartmentType, petsAllowed);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "minBudget = " + minBudget + ", " +
                "maxBudget = " + maxBudget + ", " +
                "locationPreferee = " + locationPreferee + ", " +
                "genreColoc = " + genreColoc + ", " +
                "apartmentType = " + apartmentType + ", " +
                "petsAllowed = " + petsAllowed + ")";
    }
}