package DESIGN.BookMyShow;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Screen {
    int screenId;
    List<Seat> seats;
    Screen(){
        seats= new ArrayList<>();
    }
}
