package com.mycoliving.adservice.Mapper;

import com.mycoliving.adservice.Domain.DTO.room.RoomCreateUpdateDto;
import com.mycoliving.adservice.Domain.DTO.room.RoomReadDto;
import com.mycoliving.adservice.Domain.Entity.Room;
import org.mapstruct.*;

@Mapper(
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        componentModel = MappingConstants.ComponentModel.SPRING
)
public interface RoomMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "property", ignore = true)
    Room toEntity(RoomCreateUpdateDto dto);

    RoomReadDto toReadDto(Room room);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Room partialUpdate(RoomCreateUpdateDto dto, @MappingTarget Room room);
}



