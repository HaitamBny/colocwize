package com.mycoliving.userservice.Repository;

import com.mycoliving.userservice.Domain.Entity.Proprietaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProprietaireRepository extends JpaRepository<Proprietaire, Long> {
    List<Proprietaire> findByVerified(boolean verified);

    boolean existsByEmail(String email);
}