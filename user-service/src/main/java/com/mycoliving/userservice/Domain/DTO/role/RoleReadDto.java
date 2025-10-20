package com.mycoliving.userservice.Domain.DTO.role;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.mycoliving.userservice.Domain.Entity.Role}
 */
public class RoleReadDto implements Serializable {
    private final Long id;
    private final String nom;

    public RoleReadDto(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleReadDto entity = (RoleReadDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.nom, entity.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "nom = " + nom + ")";
    }
}