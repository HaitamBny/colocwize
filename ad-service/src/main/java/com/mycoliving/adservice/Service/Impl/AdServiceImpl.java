package com.mycoliving.adservice.Service.Impl;

import com.mycoliving.adservice.Domain.Entity.Ad;
import com.mycoliving.adservice.Repository.AdRepository;
import com.mycoliving.adservice.Service.IAdService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AdServiceImpl implements IAdService {

    private final AdRepository adRepository;

    public AdServiceImpl(AdRepository adRepository) {
        this.adRepository = adRepository;
    }

    @Override
    public Ad createAd(Ad ad) {
        return adRepository.save(ad);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Ad> findById(Long id) {
        return adRepository.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Ad> findAll() {
        return adRepository.findAll();
    }

    @Override
    public Ad updateAd(Ad ad) {
        Ad existing = adRepository.findById(ad.getId())
                .orElseThrow(() -> new EntityNotFoundException("Ad not found: " + ad.getId()));

        existing.setTitle(ad.getTitle());
        existing.setDescription(ad.getDescription());
        existing.setVille(ad.getVille());
        existing.setPricePerMonth(ad.getPricePerMonth());
        existing.setPublished(ad.getPublished());
        existing.setMaxColocataires(ad.getMaxColocataires());

        return adRepository.save(existing);
    }

    @Override
    public void deleteAd(Long id) {
        if (adRepository.existsById(id)) {
            adRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Ad not found: " + id);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<Ad> searchByVille(String ville) {
        return adRepository.findByVille(ville);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Ad> searchByPriceRange(Double min, Double max) {
        return adRepository.findByPricePerMonthBetween(min, max);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Ad> findPublished() {
        return adRepository.findByPublishedTrue();
    }
}
