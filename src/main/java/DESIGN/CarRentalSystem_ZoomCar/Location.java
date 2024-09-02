package DESIGN.CarRentalSystem_ZoomCar;

import lombok.AllArgsConstructor;

public class Location {
    String address;
    int pinCode;
    String city;
    String state;
    String country;

//    @AllArgsConstructor
    Location(int pinCode, String city, String state, String country) {
        this.pinCode = pinCode;
        this.city = city;
        this.state = state;
        this.country = country;
    }

}
