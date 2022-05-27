package com.furkansahan.springbean.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class VehicleTestService {

    //@Qualifier("carVehicleServiceConfiguration")
    @Autowired
    VehicleService vehicleService;
    public void testVehicle(){
        vehicleService.startEngine();
        vehicleService.move();
        vehicleService.stopEngine();

    }
}
