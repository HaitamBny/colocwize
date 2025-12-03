package com.mycoliving.adservice.Repository;

import com.mycoliving.adservice.Domain.Entity.Ad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdRepository extends JpaRepository<Ad, Long> {
    List<Ad> findByVille(String ville);
    List<Ad> findByPricePerMonthBetween(Double min, Double max);
    List<Ad> findByMaxColocatairesGreaterThanEqual(Integer minColocs);
    List<Ad> findByPublishedTrue();
    // Combined queries can be added with @Query or Specification
}