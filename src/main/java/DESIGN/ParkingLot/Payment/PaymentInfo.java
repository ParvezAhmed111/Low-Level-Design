package DESIGN.ParkingLot.Payment;

import DESIGN.ParkingLot.ParkingTicket;

import java.util.Date;

public class PaymentInfo {
    double amount;
    Date paymentDate;
    int transactionId;
    ParkingTicket parkingTicket;
    PaymentStatus paymentStatus;
}
