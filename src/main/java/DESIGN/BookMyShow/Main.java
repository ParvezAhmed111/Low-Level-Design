package DESIGN.BookMyShow;

import DESIGN.BookMyShow.Enums.City;

public class Main {
    public static void main(String args[]) {

        BookMyShow bookMyShow = new BookMyShow();

        bookMyShow.initialize();

        //user1
        bookMyShow.createBooking(City.Bangalore, "BAAHUBALI");
        //user2
        bookMyShow.createBooking(City.Bangalore, "BAAHUBALI");

    }
}
