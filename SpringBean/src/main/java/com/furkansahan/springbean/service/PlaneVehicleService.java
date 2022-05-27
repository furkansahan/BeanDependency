package com.furkansahan.springbean.service;

import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

public class PlaneVehicleService implements VehicleService{

    private Logger log = (Logger) LoggerFactory.getLogger(CarVehicleService.class);


    @Override
    public void startEngine() {
        log.info("Starting plane engine");
    }

    @Override
    public void move() {
        log.info("Flying away");
    }

    @Override
    public void stopEngine() {
        log.info("Landing and turning off plane engine");
    }
}
