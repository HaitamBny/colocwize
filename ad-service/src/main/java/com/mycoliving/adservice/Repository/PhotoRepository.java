package com.mycoliving.adservice.Repository;

import com.mycoliving.adservice.Domain.Entity.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long> {
    List<Photo> findByAdId(Long adId);
}