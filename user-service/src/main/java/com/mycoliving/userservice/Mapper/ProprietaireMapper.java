package com.mycoliving.userservice.Mapper;

import com.mycoliving.userservice.Domain.DTO.proprietaire.ProprietaireCreateUpdateDto;
import com.mycoliving.userservice.Domain.DTO.proprietaire.ProprietaireReadDto;
import com.mycoliving.userservice.Domain.Entity.Proprietaire;
import org.mapstruct.*;

import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,
        componentModel = MappingConstants.ComponentModel.SPRING,
        uses = {RoleMapper.class, ProfileMapper.class})
public interface ProprietaireMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "roles", ignore = true)
    @Mapping(target = "profile", ignore = true)
    Proprietaire toEntity(ProprietaireCreateUpdateDto dto);

    @Mapping(target = "roles", source = "roles")
    @Mapping(target = "profile", source = "profile")
    ProprietaireReadDto toReadDto(Proprietaire proprietaire);

    Set<ProprietaireReadDto> toReadDtoSet(Set<Proprietaire> proprietaires);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "roles", ignore = true)
    @Mapping(target = "profile", ignore = true)
    Proprietaire partialUpdate(ProprietaireCreateUpdateDto dto, @MappingTarget Proprietaire proprietaire);
}
