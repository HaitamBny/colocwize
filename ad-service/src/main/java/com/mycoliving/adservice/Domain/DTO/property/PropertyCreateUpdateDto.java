package com.mycoliving.adservice.Domain.DTO.property;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.mycoliving.adservice.Domain.Entity.Property}
 */
public class PropertyCreateUpdateDto implements Serializable {
    private final String address;
    private final String city;
    private final String postalCode;
    private final Double surface;
    private final Integer roomsCount;
    private final Boolean hasWifi;
    private final Boolean hasParking;

    public PropertyCreateUpdateDto(String address, String city, String postalCode, Double surface, Integer roomsCount, Boolean hasWifi, Boolean hasParking) {
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
        this.surface = surface;
        this.roomsCount = roomsCount;
        this.hasWifi = hasWifi;
        this.hasParking = hasParking;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public Double getSurface() {
        return surface;
    }

    public Integer getRoomsCount() {
        return roomsCount;
    }

    public Boolean getHasWifi() {
        return hasWifi;
    }

    public Boolean getHasParking() {
        return hasParking;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PropertyCreateUpdateDto entity = (PropertyCreateUpdateDto) o;
        return Objects.equals(this.address, entity.address) &&
                Objects.equals(this.city, entity.city) &&
                Objects.equals(this.postalCode, entity.postalCode) &&
                Objects.equals(this.surface, entity.surface) &&
                Objects.equals(this.roomsCount, entity.roomsCount) &&
                Objects.equals(this.hasWifi, entity.hasWifi) &&
                Objects.equals(this.hasParking, entity.hasParking);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, city, postalCode, surface, roomsCount, hasWifi, hasParking);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "address = " + address + ", " +
                "city = " + city + ", " +
                "postalCode = " + postalCode + ", " +
                "surface = " + surface + ", " +
                "roomsCount = " + roomsCount + ", " +
                "hasWifi = " + hasWifi + ", " +
                "hasParking = " + hasParking + ")";
    }
}