package com.mycoliving.adservice.Domain.DTO.room;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.mycoliving.adservice.Domain.Entity.Room}
 */
public class RoomReadDto implements Serializable {
    private final Long id;
    private final String label;
    private final Double area;
    private final Boolean isAvailable;
    private final Integer capacity;

    public RoomReadDto(Long id, String label, Double area, Boolean isAvailable, Integer capacity) {
        this.id = id;
        this.label = label;
        this.area = area;
        this.isAvailable = isAvailable;
        this.capacity = capacity;
    }

    public Long getId() {
        return id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoomReadDto entity = (RoomReadDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.label, entity.label) &&
                Objects.equals(this.area, entity.area) &&
                Objects.equals(this.isAvailable, entity.isAvailable) &&
                Objects.equals(this.capacity, entity.capacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, label, area, isAvailable, capacity);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "label = " + label + ", " +
                "area = " + area + ", " +
                "isAvailable = " + isAvailable + ", " +
                "capacity = " + capacity + ")";
    }
}