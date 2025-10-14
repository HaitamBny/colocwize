package com.mycoliving.userservice.Service.Impl;

import com.mycoliving.userservice.Domain.Entity.Preference;
import com.mycoliving.userservice.Repository.PreferenceRepository;
import com.mycoliving.userservice.Service.IServicePreference;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ServicePreferenceImpl implements IServicePreference {

    private final PreferenceRepository preferenceRepository;

    @Autowired
    public ServicePreferenceImpl(PreferenceRepository preferenceRepository) {
        this.preferenceRepository = preferenceRepository;
    }

    @Override
    public Preference createPreference(Preference preference) {
        return preferenceRepository.save(preference);
    }

    @Override
    public Preference savePreference(Preference preference) {
        return preferenceRepository.save(preference);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Preference> findById(Long id) {
        return Optional.ofNullable(preferenceRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Préférence non trouvée : " + id)));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Preference> findAll() {
        return preferenceRepository.findAll();
    }

    @Override
    public Preference updatePreference(Preference preference) {
        Preference existing = preferenceRepository.findById(preference.getId())
                .orElseThrow(() -> new EntityNotFoundException("Préférence non trouvée : " + preference.getId()));

        existing.setMinBudget(preference.getMinBudget());
        existing.setMaxBudget(preference.getMaxBudget());
        existing.setLocationPreferee(preference.getLocationPreferee());
        existing.setGenreColoc(preference.getGenreColoc());
        existing.setApartmentType(preference.getApartmentType());
        existing.setPetsAllowed(preference.getPetsAllowed());

        return preferenceRepository.save(existing);
    }

    @Override
    public void deletePreference(Long id) {
        if (preferenceRepository.existsById(id)) {
            preferenceRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Préférence non trouvée : " + id);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<Preference> findByLocation(String location) {
        return preferenceRepository.findByLocationPreferee(location);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Preference> findByBudgetRange(Double min, Double max) {
        return preferenceRepository.findByMinBudgetGreaterThanEqualAndMaxBudgetLessThanEqual(min, max);
    }
}
