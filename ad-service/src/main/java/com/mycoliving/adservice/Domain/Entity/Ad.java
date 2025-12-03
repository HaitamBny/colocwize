package com.mycoliving.adservice.Domain.Entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "ads")
public class Ad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(columnDefinition = "text")
    private String description;

    private Double pricePerMonth;

    private Integer maxColocataires;

    private String ville;

    private Boolean published = false;

    private Long ownerId; // référence vers user-service (proprietaire)

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "ad_id")
    private List<Photo> photos;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "property_id")
    private Property property;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private Instant createdAt;

    @UpdateTimestamp
    @Column(nullable = false)
    private Instant updatedAt;

    public Ad() {}

    public Ad(Long id, String title, String description, Double pricePerMonth, Integer maxColocataires, String ville, Boolean published, Long ownerId, List<Photo> photos, Property property, Instant createdAt, Instant updatedAt) {
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
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    //Getters
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
    public List<Photo> getPhotos() {
        return photos;
    }
    public Property getProperty() {
        return property;
    }
    public Instant getCreatedAt() {
        return createdAt;
    }
    public Instant getUpdatedAt() {
        return updatedAt;
    }


    //Setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPricePerMonth(Double pricePerMonth) {
        this.pricePerMonth = pricePerMonth;
    }
    public void setMaxColocataires(Integer maxColocataires) {
        this.maxColocataires = maxColocataires;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public void setPublished(Boolean published) {
        this.published = published;
    }
    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }
    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }
    public void setProperty(Property property) {
        this.property = property;
    }
    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

}
