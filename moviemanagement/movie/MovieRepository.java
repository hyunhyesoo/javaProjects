package moviemanagement.movie;

import moviemanagement.JDBCConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MovieRepository {
    ArrayList<MovieVO> movieVOList;

    public ArrayList<MovieVO> select(String searchWord, int selectedIndex) {
        Connection con = JDBCConnector.getConnection();
        movieVOList = new ArrayList<MovieVO>();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String[] columnName = {"영화번호", "영화제목", "장르", "관람등급"};
        String sql = "SELECT 영화번호, 영화제목, 상영시간, 장르, 관람등급 " + "FROM 영화 " +
                "WHERE " + columnName[selectedIndex] + " LIKE ? " + "ORDER BY 영화번호";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + searchWord + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                MovieVO movie  = new MovieVO();
                movie .setMovieNo(rs.getString("영화번호"));
                movie .setMovieTitle(rs.getString("영화제목"));
                movie .setRuntime(rs.getInt("상영시간"));
                movie .setGenre(rs.getString("장르"));
                movie .setRating(rs.getString("관람등급"));
                movieVOList.add(movie);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();

                if (ps != null) ps.close();

                if (con != null) con.close();

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

        return movieVOList;
    }

    public void insert(MovieVO movieVO) {
        Connection con = JDBCConnector.getConnection();
        String sql = "insert into 영화 values(?,?,?,?,?)";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, movieVO.getMovieNo());
            ps.setString(2, movieVO.getMovieTitle());
            ps.setInt(3, movieVO.getRuntime());
            ps.setString(4, movieVO.getGenre());
            ps.setString(5, movieVO.getRating());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            try{
                if (ps != null) ps.close();
                if(con != null) con.close();
            }catch (SQLException e){
                System.out.println("insert close 문제발생");
                e.printStackTrace();
            }
        }
    }

    public void update(MovieVO movieVO) {
        Connection con = JDBCConnector.getConnection();
        String sql = "UPDATE 영화 SET 영화제목 = ?, 상영시간 = ?, 장르 = ?, 관람등급 = ? " +
                "WHERE 영화번호 = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, movieVO.getMovieTitle());
            ps.setInt(2, movieVO.getRuntime());
            ps.setString(3, movieVO.getGenre());
            ps.setString(4, movieVO.getRating());
            ps.setString(5, movieVO.getMovieNo());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try{
                if (ps != null) ps.close();
                if(con != null) con.close();
            }catch (SQLException e){
                System.out.println("update close 문제발생");
                e.printStackTrace();
            }
        }
    }

    public void delete(MovieVO movieVO) {
        Connection con = JDBCConnector.getConnection();
        String sql = "DELETE FROM 영화 WHERE 영화번호 = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, movieVO.getMovieNo());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try{
                if (ps != null) ps.close();
                if(con != null) con.close();
            }catch (SQLException e){
                System.out.println("delete close 문제발생");
                e.printStackTrace();
            }
        }
    }
}
