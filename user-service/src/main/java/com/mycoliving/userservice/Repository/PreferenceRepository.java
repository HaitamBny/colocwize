package com.mycoliving.userservice.Repository;

import com.mycoliving.userservice.Domain.Entity.Preference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PreferenceRepository extends JpaRepository<Preference, Long> {
    List<Preference> findByLocationPreferee(String locationPreferee);
    List<Preference> findByMinBudgetGreaterThanEqualAndMaxBudgetLessThanEqual(Double min, Double max);
}