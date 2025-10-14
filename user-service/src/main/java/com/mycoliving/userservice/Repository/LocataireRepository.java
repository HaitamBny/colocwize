package com.mycoliving.userservice.Repository;

import com.mycoliving.userservice.Domain.Entity.Locataire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocataireRepository extends JpaRepository<Locataire, Long> {
    List<Locataire> findByVillepreferee(String villepreferee);
    List<Locataire> findByBudgetBetween(Double min, Double max);
    boolean existsByEmail(String email);
}