package moviemanagement;

import moviemanagement.movie.MovieRepository;
import moviemanagement.movie.MovieVO;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        MovieRepository movieRepository = new MovieRepository();
        ArrayList<MovieVO> movieVOList = movieRepository.select("", 0);
        for (MovieVO movie : movieVOList) {
            System.out.println("영화번호: " + movie.getMovieNo());
            System.out.println("영화제목: " + movie.getMovieTitle());
            System.out.println("상영시간: " + movie.getRuntime());
            System.out.println("장르: " + movie.getGenre());
            System.out.println("관람등급: " + movie.getRating());
            System.out.println("=============================");
        }
    }
}
