package com.mycoliving.adservice.Mapper;

import com.mycoliving.adservice.Domain.DTO.property.PropertyCreateUpdateDto;
import com.mycoliving.adservice.Domain.DTO.property.PropertyReadDto;
import com.mycoliving.adservice.Domain.Entity.Property;
import org.mapstruct.*;

import java.util.Set;

@Mapper(
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        componentModel = MappingConstants.ComponentModel.SPRING,
        uses = {RoomMapper.class}
)
public interface PropertyMapper {

    @Mapping(target = "id", ignore = true)
    Property toEntity(PropertyCreateUpdateDto dto);

    PropertyReadDto toReadDto(Property entity);

    Set<PropertyReadDto> toReadDtoSet(Set<Property> list);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Property partialUpdate(PropertyCreateUpdateDto dto, @MappingTarget Property entity);
}
