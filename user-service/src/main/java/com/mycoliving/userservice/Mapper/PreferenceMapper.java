package com.mycoliving.userservice.Mapper;

import com.mycoliving.userservice.Domain.DTO.preference.PreferenceReadDto;
import com.mycoliving.userservice.Domain.Entity.Preference;
import org.mapstruct.*;

import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface PreferenceMapper {
    Preference toEntity(PreferenceReadDto preferenceReadDto);
    PreferenceReadDto toDto(Preference preference);

    Set<PreferenceReadDto> toDtoSet(Set<Preference> preferences);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Preference partialUpdate(PreferenceReadDto preferenceReadDto, @MappingTarget Preference preference);
}