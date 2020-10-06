package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Entity
@Table(name = "app_users")
public class AppUser {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private Long id;

        @Column(unique = true,nullable = false)
        private String userName;

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Column
        private String password;

        @Column
        private String image;


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public AppUser() {
        }

        @ManyToOne
        @JoinColumn(name = "role_id")
        private AppRole role;

        public AppRole getRole() {
            return role;
        }

        public void setRole(AppRole appRole) {
            this.role = appRole;
        }

        public AppUser(String userName, String address) {
            this.userName = userName;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String name) {
            this.userName = name;
        }
}
