public class MovieDTO {
    public String movieName;
    public String releasedDate;
    public String directorName;
    public String genre;
    public String certificate;

    public MovieDTO(String movieName, String releasedDate, String directorName, String genre, String certificate) {
        this.movieName = movieName;
        this.releasedDate = releasedDate;
        this.directorName = directorName;
        this.genre = genre;
        this.certificate = certificate;
    }

    public String showMovieDetails() {
        return "MovieName : " + movieName +"\nReleasedDate : " + releasedDate + "\nDirectorName : " + directorName +"\nGenre : " + genre + "\nCertificate : " + certificate ;
    }
}

class MovieMain{
    public static void main(String[] args) {
        MovieDTO movieDTO=new MovieDTO("Thuparivalan","06/11/2024","Myskinn","Action and Thriller","U/A");
        System.out.println(movieDTO.showMovieDetails());
    }
}
