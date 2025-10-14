package com.mycoliving.userservice.Service;

import com.mycoliving.userservice.Domain.Entity.Preference;

import java.util.List;
import java.util.Optional;

public interface IServicePreference {
    Preference createPreference(Preference preference);
    Preference savePreference(Preference preference);
    Optional<Preference> findById(Long id);
    List<Preference> findAll();
    Preference updatePreference(Preference preference);
    void deletePreference(Long id);

    List<Preference> findByLocation(String location);
    List<Preference> findByBudgetRange(Double min, Double max);
}
