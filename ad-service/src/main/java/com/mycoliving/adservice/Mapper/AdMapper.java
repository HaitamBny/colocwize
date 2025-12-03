package com.mycoliving.adservice.Mapper;

import com.mycoliving.adservice.Domain.DTO.ad.AdCreateUpdateDto;
import com.mycoliving.adservice.Domain.DTO.ad.AdReadDto;
import com.mycoliving.adservice.Domain.Entity.Ad;
import org.mapstruct.*;

@Mapper(
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        componentModel = MappingConstants.ComponentModel.SPRING,
        uses = {PhotoMapper.class, PropertyMapper.class}
)
public interface AdMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "photos", ignore = true)
    @Mapping(target = "property", ignore = true)
    Ad toEntity(AdCreateUpdateDto dto);

    AdReadDto toReadDto(Ad ad);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Ad partialUpdate(AdCreateUpdateDto dto, @MappingTarget Ad ad);
}
