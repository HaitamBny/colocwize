package com.mycoliving.adservice.Service;

import com.mycoliving.adservice.Domain.Entity.Property;

import java.util.List;
import java.util.Optional;

public interface IPropertyService {
    Property createProperty(Property property);
    Optional<Property> findById(Long id);
    List<Property> findAll();
    Property updateProperty(Property property);
    void deleteProperty(Long id);

    List<Property> findByVille(String ville);
}
