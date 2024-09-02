package DESIGN.ParkingLot;

import DESIGN.ParkingLot.Payment.PaymentInfo;
import DESIGN.ParkingLot.Payment.PaymentType;

public class ParkingAttendant extends Account{
    public boolean processVehicleEntry(Vehicle vehicle){
        return true;
    }
    public PaymentInfo processPayment(ParkingTicket parkingTicket, PaymentType paymentType){
        return null;
    }
}
