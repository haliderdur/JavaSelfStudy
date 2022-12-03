package SelfStudy.ConstructorsPractise.MovieTask;

/*
create a class called MovieObjects
    create an object of the movie:
        title: Journey to SDET: Cydeo Batch 25
        country: USA
    Genre: Adventure, Comedy, Thriller
    release date: 10/25/2021
    director: Kuzzat Altay
    Casts: Asiya, Adam, Muhtar and 5 more students from your group

    print the full info of the movie
 */
public class MovieObjects {
    public static void main(String[] args) {
        Movie movie = new Movie("US", "Journey to SDET", "Adventure, Comedy, Thriller", "5.5.2023", "Kuzzat Altay");
        String[] cast = {"Asiya", "Adam", "Muhtar", "Gorkem", "Salim", "Burhan", "Ismail", "Halid"};

        movie.addCasts(cast);
        movie.addCast("Sally");

        System.out.println(movie);

        System.out.println("Cast: " + movie.castList);
    }

}
