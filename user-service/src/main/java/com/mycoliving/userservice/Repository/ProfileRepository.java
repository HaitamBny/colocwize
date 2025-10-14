package com.mycoliving.userservice.Repository;

import com.mycoliving.userservice.Domain.Entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
}