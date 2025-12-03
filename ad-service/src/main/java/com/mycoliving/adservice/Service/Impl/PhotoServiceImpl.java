package com.mycoliving.adservice.Service.Impl;

import com.mycoliving.adservice.Domain.Entity.Photo;
import com.mycoliving.adservice.Repository.PhotoRepository;
import com.mycoliving.adservice.Service.IPhotoService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PhotoServiceImpl implements IPhotoService {

    private final PhotoRepository photoRepository;

    public PhotoServiceImpl(PhotoRepository photoRepository) {
        this.photoRepository = photoRepository;
    }

    @Override
    public Photo createPhoto(Photo photo) {
        return photoRepository.save(photo);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Photo> findById(Long id) {
        return photoRepository.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Photo> findAll() {
        return photoRepository.findAll();
    }

    @Override
    public void deletePhoto(Long id) {
        if (photoRepository.existsById(id)) photoRepository.deleteById(id);
        else throw new EntityNotFoundException("Photo not found: " + id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Photo> findByAdId(Long adId) {
        return photoRepository.findByAdId(adId);
    }
}
