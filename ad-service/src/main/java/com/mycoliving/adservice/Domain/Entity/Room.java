package com.mycoliving.adservice.Domain.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "rooms")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String label; // ex: "Chambre 1"
    private Double area;
    private Boolean isAvailable = true;
    private Integer capacity = 1;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "property_id")
    private Property property;

    public Room() {}

    public Room(Long id, String label, Double area, Boolean isAvailable, Integer capacity, Property property) {
        this.id = id;
        this.label = label;
        this.area = area;
        this.isAvailable = isAvailable;
        this.capacity = capacity;
        this.property = property;
    }


    //Getters
    public Long getId() {
        return id;
    }
    public String getLabel() {
        return label;
    }
    public Double getArea() {
        return area;
    }
    public Boolean getAvailable() {
        return isAvailable;
    }
    public Integer getCapacity() {
        return capacity;
    }
    public Property getProperty() {
        return property;
    }

    //Setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public void setArea(Double area) {
        this.area = area;
    }
    public void setAvailable(Boolean available) {
        isAvailable = available;
    }
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
    public void setProperty(Property property) {
        this.property = property;
    }

}
