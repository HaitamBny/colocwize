package com.mycoliving.userservice.Service;

import com.mycoliving.userservice.Domain.Entity.Locataire;
import com.mycoliving.userservice.Domain.Entity.Review;

import java.util.List;
import java.util.Optional;

public interface IServiceReview {
    Review createReview(Review review);
    Review saveReview(Review review);
    Optional<Review> findById(Long id);
    List<Review> findAll();
    Review updateReview(Review review);
    void deleteReview(Long id);

    List<Review> findByLocataire(Locataire locataire);
    List<Review> findByTargetUserId(Long targetUserId);
}
