package DESIGN.BookMyShow;

import DESIGN.BookMyShow.Enums.City;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Theatre {
    int theatreId;
    String address;
    City city;
    List<Screen> screens;
    List<Show> shows;
    Theatre(){
        screens= new ArrayList<>();
        shows= new ArrayList<>();
    }
}
