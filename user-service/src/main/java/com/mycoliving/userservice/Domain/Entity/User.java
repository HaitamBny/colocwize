package com.mycoliving.userservice.Domain.Entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user_type",length = 20)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false,length = 50)
    private String nom;
    @Column(nullable = false,length = 50)
    private String prenom;
    private String telephone;
    private Integer age;
    private String ville;
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private Instant createdAt;
    @UpdateTimestamp
    @Column(nullable = false)
    private Instant updatedAt;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles= new HashSet<>();

    // ✅ Constructeur sans arguments requis par JPA
    public User() {
    }

    public User(Long id, String email, String password, String nom, String prenom, String telephone, Integer age, String ville, Instant createdAt, Instant updatedAt, Set<Role> roles) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.age = age;
        this.ville = ville;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.roles = roles;
    }

    // Getters
    public Long getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getTelephone() {
        return telephone;
    }
    public Integer getAge() {
        return age;
    }
    public String getVille() {
        return ville;
    }
    public Instant getCreatedAt() {
        return createdAt;
    }
    public Instant getUpdatedAt() {
        return updatedAt;
    }
    public Set<Role> getRoles() {
        return roles;
    }


    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
