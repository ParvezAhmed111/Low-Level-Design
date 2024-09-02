package DESIGN.BookMyShow;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Booking {
    Show show;
    List<Seat> bookedSeats;
    Payment payment;

    Booking(){
        bookedSeats= new ArrayList<>();
    }
}
