import java.util.ArrayList;

public class MovieDTO {
    public String movieName;
    public String releasedDate;
    public String directorName;
    public String genre;
    public String certificate;

    ArrayList<MovieDTO>movies=new ArrayList<>();
    public MovieDTO(String movieName, String releasedDate, String directorName, String genre, String certificate) {
        this.movieName = movieName;
        this.releasedDate = releasedDate;
        this.directorName = directorName;
        this.genre = genre;
        this.certificate = certificate;
        movies.add(this);
    }

    public String showMovieDetails() {
        return "MovieName : " + movieName +"\nReleasedDate : " + releasedDate + "\nDirectorName : " + directorName +"\nGenre : " + genre + "\nCertificate : " + certificate ;
    }

    public void showAllMovieDetails() {
        for(MovieDTO movie:movies){
            System.out.println(movie.showMovieDetails());
        }
    }
}

class MovieMain{
    public static void main(String[] args) {
        MovieDTO movieDTO=new MovieDTO("Thuparivalan","06/11/2024","Myskinn","Action and Thriller","U/A");
        movieDTO.showAllMovieDetails();
    }
}
