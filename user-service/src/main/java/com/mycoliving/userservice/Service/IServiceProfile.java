package com.mycoliving.userservice.Service;

import com.mycoliving.userservice.Domain.Entity.Profile;

import java.util.List;
import java.util.Optional;

public interface IServiceProfile {
    Profile createProfile(Profile profile);
    Profile saveProfile(Profile profile);
    Optional<Profile> findById(Long id);
    List<Profile> findAll();
    Profile updateProfile(Profile profile);
    void deleteProfile(Long id);
}
