package com.shoppingcart.lld.ParkingLot.factory;

import com.shoppingcart.lld.ParkingLot.models.SpotAssignmentStrategyType;
import com.shoppingcart.lld.ParkingLot.strategies.CheapestSpotAssignmentStrategy;
import com.shoppingcart.lld.ParkingLot.strategies.NearestSpotAssignmentStrategy;
import com.shoppingcart.lld.ParkingLot.strategies.SpotAssignmentStrategy;

public class SpotAssigmentStrategyFactory {
    public static SpotAssignmentStrategy getSpotAssignmentStrategy(SpotAssignmentStrategyType spotAssignmentStrategyType){
        if(spotAssignmentStrategyType.equals(SpotAssignmentStrategyType.CHEAPEST)){
            return new CheapestSpotAssignmentStrategy();
        }else if(spotAssignmentStrategyType.equals(SpotAssignmentStrategyType.NEAREST)){
            return new NearestSpotAssignmentStrategy();
        }else{
            return null;
        }
    }
}