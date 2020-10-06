package com.example.demo.services;

import com.example.demo.models.AppUser;
import org.springframework.stereotype.Service;

@Service
public interface AppUserService {
    public AppUser findByUserName(String username);
    public Iterable<AppUser> findAll();
    void save(AppUser user);
    public void delete(AppUser user);

}
