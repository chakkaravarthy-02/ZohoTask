import java.util.ArrayList;

public abstract class MovieAbstract {
        public String movieName;
        public String releasedDate;
        public String directorName;
        public String genre;
        public String certificate;

        ArrayList<MovieAbstract> movies=new ArrayList<>();
        public MovieAbstract(String movieName, String releasedDate, String directorName, String genre, String certificate) {
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
        public abstract void showAllMovieDetails() ;
}
class MovieAbstractSub extends MovieAbstract{

    public MovieAbstractSub(String name, String released, String director, String genre, String certificate) {
        super(name,released,director,genre,certificate);
    }

    @Override
    public void showAllMovieDetails() {
        for(MovieAbstract movie:movies){
            System.out.println(movie.showMovieDetails());
        }
    }
}
class MovieAbstractMain{
    public static void main(String[] args) {
        MovieAbstractSub movieDTO=new MovieAbstractSub("Thuparivalan","06/11/2024","Myskinn","Action and Thriller","U/A");
        movieDTO.showAllMovieDetails();
    }
}

