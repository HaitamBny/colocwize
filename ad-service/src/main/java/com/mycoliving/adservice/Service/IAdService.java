package com.mycoliving.adservice.Service;

import com.mycoliving.adservice.Domain.Entity.Ad;
import java.util.List;
import java.util.Optional;

public interface IAdService {
    Ad createAd(Ad ad);
    Optional<Ad> findById(Long id);
    List<Ad> findAll();
    Ad updateAd(Ad ad);
    void deleteAd(Long id);

    List<Ad> searchByVille(String ville);
    List<Ad> searchByPriceRange(Double min, Double max);
    List<Ad> findPublished();
}
