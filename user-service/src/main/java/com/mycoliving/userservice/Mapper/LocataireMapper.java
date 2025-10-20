package com.mycoliving.userservice.Mapper;

import com.mycoliving.userservice.Domain.DTO.locataire.LocataireCreateUpdateDto;
import com.mycoliving.userservice.Domain.DTO.locataire.LocataireReadDto;
import com.mycoliving.userservice.Domain.Entity.Locataire;
import org.mapstruct.*;

import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,
        componentModel = MappingConstants.ComponentModel.SPRING,
        uses = {RoleMapper.class, ReviewMapper.class, ProfileMapper.class, PreferenceMapper.class})
public interface LocataireMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "roles", ignore = true)
    @Mapping(target = "reviews", ignore = true)
    @Mapping(target = "profile", ignore = true)
    @Mapping(target = "preference", ignore = true)
    Locataire toEntity(LocataireCreateUpdateDto dto);

    @Mapping(target = "roles", source = "roles")
    @Mapping(target = "reviews", source = "reviews")
    @Mapping(target = "profile", source = "profile")
    @Mapping(target = "preference", source = "preference")
    LocataireReadDto toReadDto(Locataire locataire);

    Set<LocataireReadDto> toReadDtoSet(Set<Locataire> locataires);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "roles", ignore = true)
    @Mapping(target = "reviews", ignore = true)
    @Mapping(target = "profile", ignore = true)
    @Mapping(target = "preference", ignore = true)
    Locataire partialUpdate(LocataireCreateUpdateDto dto, @MappingTarget Locataire locataire);

    @AfterMapping
    default void linkReviews(@MappingTarget Locataire locataire) {
        if (locataire.getReviews() != null) {
            locataire.getReviews().forEach(r -> r.setLocataire(locataire));
        }
    }
}
