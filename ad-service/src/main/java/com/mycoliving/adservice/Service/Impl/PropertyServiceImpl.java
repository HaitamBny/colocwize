package com.mycoliving.adservice.Service.Impl;

import com.mycoliving.adservice.Domain.Entity.Property;
import com.mycoliving.adservice.Repository.PropertyRepository;
import com.mycoliving.adservice.Service.IPropertyService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PropertyServiceImpl implements IPropertyService {

    private final PropertyRepository propertyRepository;

    public PropertyServiceImpl(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    @Override
    public Property createProperty(Property property) {
        return propertyRepository.save(property);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Property> findById(Long id) {
        return propertyRepository.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Property> findAll() {
        return propertyRepository.findAll();
    }

    @Override
    public Property updateProperty(Property property) {
        Property existing = propertyRepository.findById(property.getId())
                .orElseThrow(() -> new EntityNotFoundException("Property not found: " + property.getId()));

        existing.setAddress(property.getAddress());
        existing.setCity(property.getCity());
        existing.setSurface(property.getSurface());
        existing.setRoomsCount(property.getRoomsCount());

        return propertyRepository.save(existing);
    }

    @Override
    public void deleteProperty(Long id) {
        if (propertyRepository.existsById(id)) propertyRepository.deleteById(id);
        else throw new EntityNotFoundException("Property not found: " + id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Property> findByVille(String ville) {
        return propertyRepository.findByCity(ville);
    }
}
