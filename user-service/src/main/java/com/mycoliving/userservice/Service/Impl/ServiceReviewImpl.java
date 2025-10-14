package com.mycoliving.userservice.Service.Impl;

import com.mycoliving.userservice.Domain.Entity.Locataire;
import com.mycoliving.userservice.Domain.Entity.Review;
import com.mycoliving.userservice.Repository.ReviewRepository;
import com.mycoliving.userservice.Service.IServiceReview;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ServiceReviewImpl implements IServiceReview {

    private final ReviewRepository reviewRepository;

    @Autowired
    public ServiceReviewImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public Review saveReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Review> findById(Long id) {
        return Optional.ofNullable(reviewRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Avis non trouvé : " + id)));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Review> findAll() {
        return reviewRepository.findAll();
    }

    @Override
    public Review updateReview(Review review) {
        Review existing = reviewRepository.findById(review.getId())
                .orElseThrow(() -> new EntityNotFoundException("Avis non trouvé : " + review.getId()));

        existing.setComment(review.getComment());
        existing.setRating(review.getRating());
        existing.setTargetUserId(review.getTargetUserId());

        return reviewRepository.save(existing);
    }

    @Override
    public void deleteReview(Long id) {
        if (reviewRepository.existsById(id)) {
            reviewRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Avis non trouvé : " + id);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<Review> findByLocataire(Locataire locataire) {
        return reviewRepository.findByLocataire(locataire);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Review> findByTargetUserId(Long targetUserId) {
        return reviewRepository.findByTargetUserId(targetUserId);
    }
}
