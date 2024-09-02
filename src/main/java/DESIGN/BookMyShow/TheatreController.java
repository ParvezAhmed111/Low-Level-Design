package DESIGN.BookMyShow;

import DESIGN.BookMyShow.Enums.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {
    Map<City, List<Theatre>> cityVsTheatreMap;
    List<Theatre> allTheatre;

    TheatreController() {
        cityVsTheatreMap = new HashMap<>();
        allTheatre = new ArrayList<>();
    }

    void addTheatre(Theatre theatre, City city) {
        allTheatre.add(theatre);
        List<Theatre> theatres = cityVsTheatreMap.getOrDefault(city, new ArrayList<>());
        theatres.add(theatre);
        cityVsTheatreMap.put(city, theatres);
    }

    Map<Theatre, List<Show>> getAllShow(Movie movie, City city) {
        Map<Theatre, List<Show>> theatreVsShows = new HashMap<>();

        //get all the theater of this city
        List<Theatre> theatres=cityVsTheatreMap.getOrDefault(city, new ArrayList<>());
        if (theatres.isEmpty()) return theatreVsShows;

        //filter the theatres which run this movie
        for (Theatre theatre: theatres){
            List<Show> givenMovieShows = new ArrayList<>();
            List<Show> shows = theatre.getShows();
            for(Show show: shows){
                if (show.getMovie().equals(movie)){
                    givenMovieShows.add(show);
                }
            }
            if(!givenMovieShows.isEmpty()){
                theatreVsShows.put(theatre, givenMovieShows);
            }
        }
        return theatreVsShows;
    }

}
