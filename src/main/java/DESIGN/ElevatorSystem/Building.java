package DESIGN.ElevatorSystem;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

public class Building {
    List<Floor> floors;

    //@AllArgsConstructor
    public Building(List<Floor> floors) {
        this.floors = floors;
    }

    //@Getter
    public List<Floor> getFloors() {
        return floors;
    }

    public void addFloor(Floor newFloor) {
        floors.add(newFloor);
    }

    public void removeFloor(Floor floor) {
        floors.remove(floor);
    }
}
