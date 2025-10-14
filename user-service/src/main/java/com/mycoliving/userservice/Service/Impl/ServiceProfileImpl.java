package com.mycoliving.userservice.Service.Impl;

import com.mycoliving.userservice.Domain.Entity.Profile;
import com.mycoliving.userservice.Repository.ProfileRepository;
import com.mycoliving.userservice.Service.IServiceProfile;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ServiceProfileImpl implements IServiceProfile {

    private final ProfileRepository profileRepository;

    @Autowired
    public ServiceProfileImpl(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public Profile createProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    @Override
    public Profile saveProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Profile> findById(Long id) {
        return Optional.ofNullable(profileRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Profil non trouvé : " + id)));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Profile> findAll() {
        return profileRepository.findAll();
    }

    @Override
    public Profile updateProfile(Profile profile) {
        Profile existing = profileRepository.findById(profile.getId())
                .orElseThrow(() -> new EntityNotFoundException("Profil non trouvé : " + profile.getId()));

        existing.setNom(profile.getNom());
        existing.setPrenom(profile.getPrenom());
        existing.setAge(profile.getAge());
        existing.setVille(profile.getVille());
        existing.setTelephone(profile.getTelephone());
        existing.setDescription(profile.getDescription());

        return profileRepository.save(existing);
    }

    @Override
    public void deleteProfile(Long id) {
        if (profileRepository.existsById(id)) {
            profileRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Profil non trouvé : " + id);
        }
    }
}
