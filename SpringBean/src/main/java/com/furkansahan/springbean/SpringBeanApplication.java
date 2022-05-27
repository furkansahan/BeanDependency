package com.furkansahan.springbean;

import com.furkansahan.springbean.service.VehicleService;
import com.furkansahan.springbean.service.VehicleTestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBeanApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context=SpringApplication.run(SpringBeanApplication.class, args);
        //VehicleService vehicleService=context.getBean(VehicleService.class);
        //vehicleService.startEngine();
        //vehicleService.move();
        //vehicleService.stopEngine();
        VehicleTestService vehicleTestService= context.getBean(VehicleTestService.class);
        vehicleTestService.testVehicle();

    }

}
