package com.mycoliving.userservice.Service;

import com.mycoliving.userservice.Domain.Entity.Locataire;

import java.util.List;
import java.util.Optional;

public interface IServiceLocataire {
    Locataire createLocataire(Locataire locataire);
    Locataire saveLocataire(Locataire locataire);
    Optional<Locataire> findById(Long id);
    List<Locataire> findAll();
    Locataire updateLocataire(Locataire locataire);
    void deleteLocataire(Long id);

    List<Locataire> findByVillepreferee(String ville);
    List<Locataire> findByBudgetRange(Double min, Double max);
}
