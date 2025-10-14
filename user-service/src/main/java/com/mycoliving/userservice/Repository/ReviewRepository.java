package com.mycoliving.userservice.Repository;

import com.mycoliving.userservice.Domain.Entity.Locataire;
import com.mycoliving.userservice.Domain.Entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByLocataire(Locataire locataire);
    List<Review> findByTargetUserId(Long targetUserId);
}