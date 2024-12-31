package com.somevelisetty.project.uber.uberApp.strategies;

import com.somevelisetty.project.uber.uberApp.dto.RideRequestDto;

public interface RideFareCalculationStrategy {

    double calculateFare(RideRequestDto rideRequestDto);

}
