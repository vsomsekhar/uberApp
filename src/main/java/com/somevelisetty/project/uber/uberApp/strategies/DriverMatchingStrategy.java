package com.somevelisetty.project.uber.uberApp.strategies;

import com.somevelisetty.project.uber.uberApp.dto.RideRequestDto;
import com.somevelisetty.project.uber.uberApp.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequestDto rideRequestDto);
}
