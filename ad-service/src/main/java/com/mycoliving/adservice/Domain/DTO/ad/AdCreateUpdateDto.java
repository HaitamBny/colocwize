package com.mycoliving.adservice.Domain.DTO.ad;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * DTO for {@link com.mycoliving.adservice.Domain.Entity.Ad}
 */
public class AdCreateUpdateDto implements Serializable {
    private final String title;
    private final String description;
    private final Double pricePerMonth;
    private final Integer maxColocataires;
    private final String ville;
    private final Boolean published;
    private final Long ownerId;
    private final List<Long> photoIds;
    private final Long propertyId;

    public AdCreateUpdateDto(String title, String description, Double pricePerMonth, Integer maxColocataires, String ville, Boolean published, Long ownerId, List<Long> photoIdIds, Long propertyIdId) {
        this.title = title;
        this.description = description;
        this.pricePerMonth = pricePerMonth;
        this.maxColocataires = maxColocataires;
        this.ville = ville;
        this.published = published;
        this.ownerId = ownerId;
        this.photoIds = photoIdIds;
        this.propertyId = propertyIdId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Double getPricePerMonth() {
        return pricePerMonth;
    }

    public Integer getMaxColocataires() {
        return maxColocataires;
    }

    public String getVille() {
        return ville;
    }

    public Boolean getPublished() {
        return published;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public List<Long> getPhotoIdIds() {
        return photoIds;
    }

    public Long getPropertyIdId() {
        return propertyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdCreateUpdateDto entity = (AdCreateUpdateDto) o;
        return Objects.equals(this.title, entity.title) &&
                Objects.equals(this.description, entity.description) &&
                Objects.equals(this.pricePerMonth, entity.pricePerMonth) &&
                Objects.equals(this.maxColocataires, entity.maxColocataires) &&
                Objects.equals(this.ville, entity.ville) &&
                Objects.equals(this.published, entity.published) &&
                Objects.equals(this.ownerId, entity.ownerId) &&
                Objects.equals(this.photoIds, entity.photoIds) &&
                Objects.equals(this.propertyId, entity.propertyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, pricePerMonth, maxColocataires, ville, published, ownerId, photoIds, propertyId);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "title = " + title + ", " +
                "description = " + description + ", " +
                "pricePerMonth = " + pricePerMonth + ", " +
                "maxColocataires = " + maxColocataires + ", " +
                "ville = " + ville + ", " +
                "published = " + published + ", " +
                "ownerId = " + ownerId + ", " +
                "photoIdIds = " + photoIds + ", " +
                "propertyIdId = " + propertyId + ")";
    }
}