package com.ambula.restapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ambula.restapi.entity.UserLocation;
import com.ambula.restapi.jpa.UserLocationRepository;

@RestController
public class UserLocationController {
	@Autowired
    private UserLocationRepository userLocationRepository;

    @PostMapping("/create_data")
    public ResponseEntity<String> createData(@RequestBody UserLocation newLocation) {
        
    	// Code to create the 'user_location' table
    	userLocationRepository.save(newLocation);
        
    	return ResponseEntity.ok("Table 'user_location' created successfully.");
    }

    @PatchMapping("/update_data/{id}")
    public ResponseEntity<String> updateData(@PathVariable Long id, @RequestBody UserLocation updatedLocation) {
        
    	// Code to update user location
    	userLocationRepository.save(updatedLocation);
    	
        return ResponseEntity.ok("User location updated successfully.");
    }

    @GetMapping("/get_users/{count}")
    public ResponseEntity<Optional<UserLocation>> getUsers(@PathVariable int count) {
        //List<UserLocation> nearestUsers = ;
    	return ResponseEntity.ok(userLocationRepository.findById(Long.valueOf(count)));
    }
}
