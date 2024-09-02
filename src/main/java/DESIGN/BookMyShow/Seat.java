package DESIGN.BookMyShow;

import DESIGN.BookMyShow.Enums.SeatCategory;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Seat {
    int seatId;
    int row;
    SeatCategory seatCategory;
    int price;
}
