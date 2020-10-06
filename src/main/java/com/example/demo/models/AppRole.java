package com.example.demo.models;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "app_roles")
public class AppRole {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String name;

    @OneToMany(targetEntity = AppUser.class,cascade = {CascadeType.ALL})
    private List<AppUser> appUsers;


    public AppRole() {
    }

    public AppRole(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AppUser> getCustomers() {
        return appUsers;
    }

    public void setCustomers(List<AppUser> customers) {
        this.appUsers = appUsers;
    }
}