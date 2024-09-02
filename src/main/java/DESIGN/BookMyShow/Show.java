package DESIGN.BookMyShow;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Show {
    int showId;
    Movie movie;
    Screen screen;
    int showStartTime;
    List<Integer> bookedSeatIds;

    Show(){
        bookedSeatIds= new ArrayList<>();
    }

}
