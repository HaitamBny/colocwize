package com.mycoliving.userservice.Domain.DTO.review;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * DTO for {@link com.mycoliving.userservice.Domain.Entity.Review}
 */
public class ReviewReadDto implements Serializable {
    private final Long id;
    private final int rating;
    private final String comment;
    private final LocalDateTime createdAt;
    private final Long targetUserId;

    public ReviewReadDto(Long id, int rating, String comment, LocalDateTime createdAt, Long targetUserId) {
        this.id = id;
        this.rating = rating;
        this.comment = comment;
        this.createdAt = createdAt;
        this.targetUserId = targetUserId;
    }

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

    public Long getTargetUserId() {
        return targetUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReviewReadDto entity = (ReviewReadDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.rating, entity.rating) &&
                Objects.equals(this.comment, entity.comment) &&
                Objects.equals(this.createdAt, entity.createdAt) &&
                Objects.equals(this.targetUserId, entity.targetUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, rating, comment, createdAt, targetUserId);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "rating = " + rating + ", " +
                "comment = " + comment + ", " +
                "createdAt = " + createdAt + ", " +
                "targetUserId = " + targetUserId + ")";
    }
}