package com.mycoliving.userservice.Mapper;

import com.mycoliving.userservice.Domain.DTO.profile.ProfileReadDto;
import com.mycoliving.userservice.Domain.Entity.Profile;
import org.mapstruct.*;

import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProfileMapper {
    Profile toEntity(ProfileReadDto profileReadDto);
    ProfileReadDto toDto(Profile profile);

    Set<ProfileReadDto> toDtoSet(Set<Profile> profiles);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Profile partialUpdate(ProfileReadDto profileReadDto, @MappingTarget Profile profile);
}