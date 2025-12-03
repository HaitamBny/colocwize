package com.mycoliving.adservice.Service;

import com.mycoliving.adservice.Domain.Entity.Photo;

import java.util.List;
import java.util.Optional;

public interface IPhotoService {
    Photo createPhoto(Photo photo);
    Optional<Photo> findById(Long id);
    List<Photo> findAll();
    void deletePhoto(Long id);

    List<Photo> findByAdId(Long adId);
}
