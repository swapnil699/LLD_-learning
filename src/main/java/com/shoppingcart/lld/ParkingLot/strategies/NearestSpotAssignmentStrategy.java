package com.shoppingcart.lld.ParkingLot.strategies;

import com.shoppingcart.lld.ParkingLot.models.Gate;
import com.shoppingcart.lld.ParkingLot.models.ParkingSpot;
import com.shoppingcart.lld.ParkingLot.models.VehicleType;

public class NearestSpotAssignmentStrategy implements SpotAssignmentStrategy{
    @Override
    public ParkingSpot assignSpot(VehicleType vehicleType, Gate gate) {
        return null;
        /*
        go for every floor and spot, check if it's available
        return the first available spot
         */
    }
}
