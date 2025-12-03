package com.mycoliving.adservice.Domain.DTO.ad;

import com.mycoliving.adservice.Domain.DTO.photo.PhotoReadDto;
import com.mycoliving.adservice.Domain.DTO.property.PropertyReadDto;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * DTO for {@link com.mycoliving.adservice.Domain.Entity.Ad}
 */
public class AdReadDto implements Serializable {
    private final Long id;
    private final String title;
    private final String description;
    private final Double pricePerMonth;
    private final Integer maxColocataires;
    private final String ville;
    private final Boolean published;
    private final Long ownerId;
    private final List<PhotoReadDto> photos;
    private final PropertyReadDto property;

    public AdReadDto(Long id, String title, String description, Double pricePerMonth, Integer maxColocataires, String ville, Boolean published, Long ownerId, List<PhotoReadDto> photos, PropertyReadDto property) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.pricePerMonth = pricePerMonth;
        this.maxColocataires = maxColocataires;
        this.ville = ville;
        this.published = published;
        this.ownerId = ownerId;
        this.photos = photos;
        this.property = property;
    }

    public Long getId() {
        return id;
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

    public List<PhotoReadDto> getPhotos() {
        return photos;
    }

    public PropertyReadDto getProperty() {
        return property;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdReadDto entity = (AdReadDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.title, entity.title) &&
                Objects.equals(this.description, entity.description) &&
                Objects.equals(this.pricePerMonth, entity.pricePerMonth) &&
                Objects.equals(this.maxColocataires, entity.maxColocataires) &&
                Objects.equals(this.ville, entity.ville) &&
                Objects.equals(this.published, entity.published) &&
                Objects.equals(this.ownerId, entity.ownerId) &&
                Objects.equals(this.photos, entity.photos) &&
                Objects.equals(this.property, entity.property);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, pricePerMonth, maxColocataires, ville, published, ownerId, photos, property);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "title = " + title + ", " +
                "description = " + description + ", " +
                "pricePerMonth = " + pricePerMonth + ", " +
                "maxColocataires = " + maxColocataires + ", " +
                "ville = " + ville + ", " +
                "published = " + published + ", " +
                "ownerId = " + ownerId + ", " +
                "photos = " + photos + ", " +
                "property = " + property + ")";
    }
}