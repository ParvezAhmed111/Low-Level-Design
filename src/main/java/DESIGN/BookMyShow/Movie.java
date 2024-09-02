package DESIGN.BookMyShow;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie {
    int movieId;
    String movieName;
    int movieDurationInMinutes;
    //other details like Genere, Language etc.
}
