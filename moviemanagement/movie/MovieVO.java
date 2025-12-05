package moviemanagement.movie;

public class MovieVO {
    private String movieNo;
    private String movieTitle;
    private int runtime;
    private String genre;
    private String rating;

    public String getMovieNo() {
        return movieNo;
    }

    public void setMovieNo(String movieNo) {
        this.movieNo = movieNo;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
