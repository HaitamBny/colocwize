package com.mycoliving.userservice.Mapper;

import com.mycoliving.userservice.Domain.DTO.role.RoleReadDto;
import com.mycoliving.userservice.Domain.Entity.Role;
import org.mapstruct.*;

import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,
        componentModel = MappingConstants.ComponentModel.SPRING)
public interface RoleMapper {
    Role toEntity(RoleReadDto dto);
    RoleReadDto toDto(Role entity);

    Set<RoleReadDto> toDtoSet(Set<Role> roles);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Role partialUpdate(RoleReadDto dto, @MappingTarget Role entity);
}
