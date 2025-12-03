package com.mycoliving.adservice.Domain.Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "properties")
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;
    private String city;
    private String postalCode;
    private Double surface; // m2
    private Integer roomsCount;
    private Boolean hasWifi;
    private Boolean hasParking;

    @OneToMany(mappedBy = "property", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Room> rooms;

    public Property() {}

    public Property(Long id, String address, String city, String postalCode, Double surface, Integer roomsCount, Boolean hasWifi, Boolean hasParking, List<Room> rooms) {
        this.id = id;
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
        this.surface = surface;
        this.roomsCount = roomsCount;
        this.hasWifi = hasWifi;
        this.hasParking = hasParking;
        this.rooms = rooms;
    }


    //Getters
    public Long getId() {
        return id;
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
    public List<Room> getRooms() {
        return rooms;
    }

    //Setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public void setSurface(Double surface) {
        this.surface = surface;
    }
    public void setRoomsCount(Integer roomsCount) {
        this.roomsCount = roomsCount;
    }
    public void setHasWifi(Boolean hasWifi) {
        this.hasWifi = hasWifi;
    }
    public void setHasParking(Boolean hasParking) {
        this.hasParking = hasParking;
    }
    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

}
