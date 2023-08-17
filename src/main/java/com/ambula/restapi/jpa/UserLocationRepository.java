package com.ambula.restapi.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ambula.restapi.entity.UserLocation;

public interface UserLocationRepository extends JpaRepository<UserLocation, Long> {
    
}