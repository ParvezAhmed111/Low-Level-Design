package DESIGN.BookMyShow;

import DESIGN.BookMyShow.Enums.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    Map<City, List<Movie>> cityVsMovieMap;
    List<Movie> allMovies;

    MovieController(){
        cityVsMovieMap= new HashMap<>();
        allMovies= new ArrayList<>();
    }

    //ADD movie to a particular city, make use of cityVsMovies map
    public void addMovie(Movie movie, City city){
        allMovies.add(movie);
        List<Movie> movies= cityVsMovieMap.getOrDefault(city, new ArrayList<>());
        movies.add(movie);
        cityVsMovieMap.put(city, movies);
    }

    public Movie getMovieByName(String movieName){
        for (Movie movie: allMovies){
            if (movie.movieName.equals(movieName))
                return movie;
        }
        return null;
    }

    public List<Movie> getMoviesByCity(City city){
        return cityVsMovieMap.getOrDefault(city, new ArrayList<>());
    }

    //REMOVE movie from a particular city, make use of cityVsMovies map

    //UPDATE movie of a particular city, make use of cityVsMovies map

    //CRUD operation based on Movie ID, make use of allMovies list
}
