package com.mycoliving.adservice.Mapper;

import com.mycoliving.adservice.Domain.DTO.photo.PhotoCreateUpdateDto;
import com.mycoliving.adservice.Domain.DTO.photo.PhotoReadDto;
import com.mycoliving.adservice.Domain.Entity.Photo;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,
        componentModel = MappingConstants.ComponentModel.SPRING)
public interface PhotoMapper {

    @Mapping(target = "id", ignore = true)
    Photo toEntity(PhotoCreateUpdateDto dto);

    PhotoReadDto toReadDto(Photo entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Photo partialUpdate(PhotoCreateUpdateDto dto, @MappingTarget Photo entity);
}
