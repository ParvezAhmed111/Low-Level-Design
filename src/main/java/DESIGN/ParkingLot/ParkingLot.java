package DESIGN.ParkingLot;

import DESIGN.ParkingLot.Gate.Entrance;
import DESIGN.ParkingLot.Gate.Exit;

import java.util.List;

public class ParkingLot {
    List<ParkingFloor> parkingFloors;
    List<Entrance> entrances;
    List<Exit> exits;
    Address address;
    String parkingLotName;

    public boolean isParkingSpaceAvailableForVehicle(Vehicle vehicle){
        return true;
    }
    public boolean updateParkingAttendant(ParkingAttendant parkingAttendant, int gateId){
        return true;
    }
}
