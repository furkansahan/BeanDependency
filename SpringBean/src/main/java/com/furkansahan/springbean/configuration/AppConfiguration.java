package com.furkansahan.springbean.configuration;

import com.furkansahan.springbean.service.CarVehicleService;
import com.furkansahan.springbean.service.PlaneVehicleService;
import com.furkansahan.springbean.service.VehicleService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfiguration {
    @Bean
  //  @Qualifier("carVehicleServiceConfiguration")
    @ConditionalOnProperty(value="vehicle.service.mode",havingValue ="car",matchIfMissing = false )
    public VehicleService carVehicleServiceConfiguration(){

        return new CarVehicleService();
    }
    @Bean
    //@Primary
   // @Qualifier("carVehicleServiceConfiguration")
    @ConditionalOnProperty(value="vehicle.service.mode",havingValue ="plane",matchIfMissing = true )
    public VehicleService PlaneVehicleServiceConfiguration(){

        return new PlaneVehicleService();
    }
}
