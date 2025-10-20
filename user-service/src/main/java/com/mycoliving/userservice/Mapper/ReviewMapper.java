package com.mycoliving.userservice.Mapper;

import com.mycoliving.userservice.Domain.DTO.preference.PreferenceReadDto;
import com.mycoliving.userservice.Domain.DTO.review.ReviewReadDto;
import com.mycoliving.userservice.Domain.Entity.Preference;
import com.mycoliving.userservice.Domain.Entity.Review;
import org.mapstruct.*;

import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ReviewMapper {
    Review toEntity(ReviewReadDto reviewReadDto);
    ReviewReadDto toDto(Review review);

    Set<ReviewReadDto> toDtoSet(Set<Review> reviews);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Review partialUpdate(ReviewReadDto reviewReadDto, @MappingTarget Review review);
}