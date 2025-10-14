package com.mycoliving.userservice.Service;

import com.mycoliving.userservice.Domain.Entity.Proprietaire;

import java.util.List;
import java.util.Optional;

public interface IServiceProprietaire {
    Proprietaire crateProprietaire(Proprietaire proprietaire);
    Proprietaire saveProprietaire(Proprietaire proprietaire);
    Optional<Proprietaire> findById(Long id);
    List<Proprietaire> findAll();
    Proprietaire updateProprietaire(Proprietaire proprietaire);
    void deleteProprietaire(Long id);

    List<Proprietaire> findByVerified(Boolean verified);
}
