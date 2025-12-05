package moviemanagement.user;

import moviemanagement.JDBCConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserRepository {
    ArrayList<UserVO> userList;

    // 회원 검색
    public ArrayList<UserVO> select(String searchWord, int selectedIndex) {
        Connection con = JDBCConnector.getConnection();
        userList = new ArrayList<>();
        ResultSet rs = null;
        PreparedStatement ps = null;

        // 0: 아이디, 1: 이름, 2: 전화번호 기준 검색
        String[] columnName = {"아이디", "이름", "전화번호"};

        String sql =
                "SELECT 아이디, 비밀번호, 이름, 전화번호, 등급, 적립금, 권한 " +
                        "FROM 회원 " +
                        "WHERE " + columnName[selectedIndex] + " LIKE ? " +
                        "ORDER BY 아이디";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + searchWord + "%");
            rs = ps.executeQuery();

            while (rs.next()) {
                UserVO vo = new UserVO();
                vo.setUserId(rs.getString("아이디"));
                vo.setPassword(rs.getString("비밀번호"));
                vo.setName(rs.getString("이름"));
                vo.setPhone(rs.getString("전화번호"));
                vo.setGrade(rs.getString("등급"));
                vo.setPoint(rs.getInt("적립금"));
                vo.setRole(rs.getString("권한"));
                userList.add(vo);
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

        return userList;
    }

    // 회원 추가
    public void insert(UserVO vo) {
        Connection con = JDBCConnector.getConnection();
        String sql =
                "INSERT INTO 회원 (아이디, 비밀번호, 이름, 전화번호, 등급, 적립금, 권한) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, vo.getUserId());
            ps.setString(2, vo.getPassword());
            ps.setString(3, vo.getName());
            ps.setString(4, vo.getPhone());
            ps.setString(5, vo.getGrade());
            ps.setInt(6, vo.getPoint());
            ps.setString(7, vo.getRole());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("insert close 문제발생");
                e.printStackTrace();
            }
        }
    }

    // 회원 수정
    public void update(UserVO vo) {
        Connection con = JDBCConnector.getConnection();
        String sql =
                "UPDATE 회원 " +
                        "SET 비밀번호 = ?, 이름 = ?, 전화번호 = ?, 등급 = ?, 적립금 = ?, 권한 = ? " +
                        "WHERE 아이디 = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, vo.getPassword());
            ps.setString(2, vo.getName());
            ps.setString(3, vo.getPhone());
            ps.setString(4, vo.getGrade());
            ps.setInt(5, vo.getPoint());
            ps.setString(6, vo.getRole());
            ps.setString(7, vo.getUserId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("update close 문제발생");
                e.printStackTrace();
            }
        }
    }

    // 회원 삭제
    public void delete(UserVO vo) {
        Connection con = JDBCConnector.getConnection();
        String sql = "DELETE FROM 회원 WHERE 아이디 = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, vo.getUserId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("delete close 문제발생");
                e.printStackTrace();
            }
        }
    }
}