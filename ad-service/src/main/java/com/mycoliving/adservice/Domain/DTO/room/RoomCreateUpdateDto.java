package com.mycoliving.adservice.Domain.DTO.room;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.mycoliving.adservice.Domain.Entity.Room}
 */
public class RoomCreateUpdateDto implements Serializable {
    private final String label;
    private final Double area;
    private final Boolean isAvailable;
    private final Integer capacity;
    private final Long propertyId;

    public RoomCreateUpdateDto(String label, Double area, Boolean isAvailable, Integer capacity, Long propertyId) {
        this.label = label;
        this.area = area;
        this.isAvailable = isAvailable;
        this.capacity = capacity;
        this.propertyId = propertyId;
    }

    public String getLabel() {
        return label;
    }

    public Double getArea() {
        return area;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public Long getPropertyId() {
        return propertyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoomCreateUpdateDto entity = (RoomCreateUpdateDto) o;
        return Objects.equals(this.label, entity.label) &&
                Objects.equals(this.area, entity.area) &&
                Objects.equals(this.isAvailable, entity.isAvailable) &&
                Objects.equals(this.capacity, entity.capacity) &&
                Objects.equals(this.propertyId, entity.propertyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, area, isAvailable, capacity, propertyId);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "label = " + label + ", " +
                "area = " + area + ", " +
                "isAvailable = " + isAvailable + ", " +
                "capacity = " + capacity + ", " +
                "propertyId = " + propertyId + ")";
    }
}