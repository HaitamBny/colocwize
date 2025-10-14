package com.mycoliving.userservice.Domain.Entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int rating; // 1 à 5
    private String comment;
    private LocalDateTime createdAt = LocalDateTime.now();

    // Relation vers le locataire (auteur)
    @ManyToOne
    @JoinColumn(name = "locataire_id")
    private Locataire locataire;

    // Cible de l’avis (peut être un autre locataire ou un propriétaire)
    @Column(name = "target_user_id")
    private Long targetUserId;

    public Review() {}

    public Review(Long id, int rating, String comment, LocalDateTime createdAt, Locataire locataire, Long targetUserId) {
        this.id = id;
        this.rating = rating;
        this.comment = comment;
        this.createdAt = createdAt;
        this.locataire = locataire;
        this.targetUserId = targetUserId;
    }

    // Getters
    public Long getId() {
        return id;
    }
    public int getRating() {
        return rating;
    }
    public String getComment() {
        return comment;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public Locataire getLocataire() {
        return locataire;
    }
    public Long getTargetUserId() {
        return targetUserId;
    }


    // Setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public void setLocataire(Locataire locataire) {
        this.locataire = locataire;
    }
    public void setTargetUserId(Long targetUserId) {
        this.targetUserId = targetUserId;
    }
}
