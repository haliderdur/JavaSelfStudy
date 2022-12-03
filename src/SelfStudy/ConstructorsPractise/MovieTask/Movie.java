package SelfStudy.ConstructorsPractise.MovieTask;

import java.util.ArrayList;
import java.util.Arrays;

/*
Movie Task:
3.1. Create a class named Movie
    Attributes:
        country (String), title (String), Genre (String), releaseDate (String), director (String), casts (ArrayList<String>)
    Add a constructor to set the country, title, release date, and director of the Movie

    Actions
        addCast(String): adds the given string argument to the arrayList casts
        addCasts(String[]): adds the given string array argument to the arrayList casts
        toString(): returns the name of country, title, release date, and total number of casts
 */
public class Movie {
    public String country, title, genre, releaseDate, director;
    public ArrayList<String> castList = new ArrayList<>();

    public Movie(String country, String title, String genre, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
    }

    public void addCast(String name) {
        castList.add(name);
    }

    public void addCasts(String[] cast) {
        castList.addAll(Arrays.asList(cast));
    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", director='" + director + '\'' +
                ", casts=" + castList +
                '}';
    }
}
