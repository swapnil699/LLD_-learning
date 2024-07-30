package com.shoppingcart.lld.ParkingLot.strategies;

import com.shoppingcart.lld.ParkingLot.models.Gate;
import com.shoppingcart.lld.ParkingLot.models.ParkingSpot;
import com.shoppingcart.lld.ParkingLot.models.VehicleType;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(VehicleType vehicleType,
                           Gate gate);
}
