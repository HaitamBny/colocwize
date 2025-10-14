package com.mycoliving.userservice.Service.Impl;

import com.mycoliving.userservice.Domain.Entity.Proprietaire;
import com.mycoliving.userservice.Repository.ProprietaireRepository;
import com.mycoliving.userservice.Service.IServiceProprietaire;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ServiceProprietaireImpl implements IServiceProprietaire {

    private final ProprietaireRepository proprietaireRepository;

    @Autowired
    public ServiceProprietaireImpl(ProprietaireRepository proprietaireRepository) {
        this.proprietaireRepository = proprietaireRepository;
    }

    @Override
    public Proprietaire crateProprietaire(Proprietaire proprietaire) {
        if (proprietaireRepository.existsByEmail(proprietaire.getEmail())) {
            throw new DataIntegrityViolationException("Email déjà utilisé : " + proprietaire.getEmail());
        }
        return proprietaireRepository.save(proprietaire);
    }

    @Override
    public Proprietaire saveProprietaire(Proprietaire proprietaire) {
        return proprietaireRepository.save(proprietaire);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Proprietaire> findById(Long id) {
        return Optional.ofNullable(proprietaireRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Propriétaire non trouvé : " + id)));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Proprietaire> findAll() {
        return proprietaireRepository.findAll();
    }

    @Override
    public Proprietaire updateProprietaire(Proprietaire proprietaire) {
        Proprietaire existing = proprietaireRepository.findById(proprietaire.getId())
                .orElseThrow(() -> new EntityNotFoundException("Propriétaire non trouvé : " + proprietaire.getId()));

        existing.setVerified(proprietaire.getVerified());
        existing.setProfile(proprietaire.getProfile());
        existing.setPropertyIds(proprietaire.getPropertyIds());

        return proprietaireRepository.save(existing);
    }

    @Override
    public void deleteProprietaire(Long id) {
        if (proprietaireRepository.existsById(id)) {
            proprietaireRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Propriétaire non trouvé : " + id);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<Proprietaire> findByVerified(Boolean verified) {
        return proprietaireRepository.findByVerified(verified);
    }
}
