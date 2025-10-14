package com.mycoliving.userservice.Service.Impl;

import com.mycoliving.userservice.Domain.Entity.Locataire;
import com.mycoliving.userservice.Repository.LocataireRepository;
import com.mycoliving.userservice.Service.IServiceLocataire;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ServiceLocataireImpl implements IServiceLocataire {

    private final LocataireRepository locataireRepository;

    @Autowired
    public ServiceLocataireImpl(LocataireRepository locataireRepository) {
        this.locataireRepository = locataireRepository;
    }

    @Override
    public Locataire createLocataire(Locataire locataire) {
        if (locataireRepository.existsByEmail(locataire.getEmail())) {
            throw new DataIntegrityViolationException("Email déjà utilisé : " + locataire.getEmail());
        }
        return locataireRepository.save(locataire);
    }

    @Override
    public Locataire saveLocataire(Locataire locataire) {
        return locataireRepository.save(locataire);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Locataire> findById(Long id) {
        return Optional.ofNullable(
                locataireRepository.findById(id)
                        .orElseThrow(() -> new EntityNotFoundException("Locataire non trouvé : " + id))
        );
    }

    @Override
    @Transactional(readOnly = true)
    public List<Locataire> findAll() {
        return locataireRepository.findAll();
    }

    @Override
    public Locataire updateLocataire(Locataire locataire) {
        Locataire existing = locataireRepository.findById(locataire.getId())
                .orElseThrow(() -> new EntityNotFoundException("Locataire non trouvé : " + locataire.getId()));

        existing.setBudget(locataire.getBudget());
        existing.setVillepreferee(locataire.getVillepreferee());
        existing.setProfile(locataire.getProfile());
        existing.setPreference(locataire.getPreference());

        return locataireRepository.save(existing);
    }

    @Override
    public void deleteLocataire(Long id) {
        if (locataireRepository.existsById(id)) {
            locataireRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Locataire non trouvé : " + id);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<Locataire> findByVillepreferee(String ville) {
        return locataireRepository.findByVillepreferee(ville);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Locataire> findByBudgetRange(Double min, Double max) {
        return locataireRepository.findByBudgetBetween(min, max);
    }
}
