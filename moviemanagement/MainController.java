package moviemanagement;

import center_frame.CenterFrame;
import moviemanagement.movie.*;
import moviemanagement.user.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class MainController extends JFrame {
    //영화 관련
    MovieSearchView searchPanel;
    MovieInsertView insertPanel;
    MovieUpdateView updatePanel;
    MovieRepository movieRepository;
    ArrayList<MovieVO> movieVOList;
    JComboBox<String> comboBox;
    JButton searchButton;
    JButton InsertButton;
    JButton UpdateButton;
    JButton DeleteButton;
    JTable tableUpdate;

    //회원 관련
    UserSearchView userSearchPanel;
    UserInsertView userInsertPanel;
    UserUpdateView userUpdatePanel;
    UserRepository userRepository;
    ArrayList<UserVO> userVOList;
    JComboBox<String> userComboBox;
    JButton userSearchButton;
    JButton userInsertButton;
    JButton userUpdateButton;
    JButton userDeleteButton;
    JTable userTableUpdate;

    JTabbedPane tab = new JTabbedPane(JTabbedPane.TOP); //생략하면 자동으로 top

    public MainController() {
        //------영화 탭 세팅-------
        searchPanel = new MovieSearchView();
        comboBox = searchPanel.getComboBox();
        movieRepository = new MovieRepository();
        movieVOList = movieRepository.select("", comboBox.getSelectedIndex());
        searchPanel.setMovieVOList(movieVOList);
        searchPanel.initview();
        searchButton = searchPanel.getBtnSearch();
        searchButton.addActionListener(btnSearchL);
        tab.add("영화검색", searchPanel);

        //영화 추가
        insertPanel = new MovieInsertView();
        movieVOList = movieRepository.select("", 0);
        insertPanel.setMovieVOList(movieVOList);
        insertPanel.initView();
        InsertButton = insertPanel.getButtonIS();
        InsertButton.addActionListener(btnInsertL);
        tab.add("영화추가", insertPanel);

        //영화 수정 및 삭제
        updatePanel = new MovieUpdateView();
        movieVOList = movieRepository.select("", 0);
        updatePanel.setMovieVOList(movieVOList);
        updatePanel.initView();
        UpdateButton = updatePanel.getButtonUD();
        UpdateButton.addActionListener(btnUpdateL);
        DeleteButton = updatePanel.getButtonDEL();
        DeleteButton.addActionListener(btnDeleteL);
        tableUpdate = updatePanel.getTable();
        tableUpdate.addMouseListener(tableUpdateL);
        tab.add("영화수정및삭제", updatePanel);

        //-------회원 탭 세팅--------
        userSearchPanel = new UserSearchView();
        userComboBox = userSearchPanel.getComboBox();
        userRepository = new UserRepository();
        userVOList = userRepository.select("", userComboBox.getSelectedIndex());
        userSearchPanel.setUserVOList(userVOList);
        userSearchPanel.initview();
        userSearchButton = userSearchPanel.getBtnSearch();
        userSearchButton.addActionListener(userBtnSearchL);
        tab.add("회원검색", userSearchPanel);

        // 회원 추가
        userInsertPanel = new UserInsertView();
        userVOList = userRepository.select("", 0);
        userInsertPanel.setUserVOList(userVOList);
        userInsertPanel.initView();
        userInsertButton = userInsertPanel.getButtonIS();
        userInsertButton.addActionListener(userBtnInsertL);
        tab.add("회원추가", userInsertPanel);

        // 회원 수정/삭제
        userUpdatePanel = new UserUpdateView();
        userVOList = userRepository.select("", 0);
        userUpdatePanel.setUserVOList(userVOList);
        userUpdatePanel.initView();
        userUpdateButton = userUpdatePanel.getButtonUD();
        userUpdateButton.addActionListener(userBtnUpdateL);
        userDeleteButton = userUpdatePanel.getButtonDEL();
        userDeleteButton.addActionListener(userBtnDeleteL);
        userTableUpdate = userUpdatePanel.getTable();
        userTableUpdate.addMouseListener(userTableUpdateL);
        tab.add("회원수정및삭제", userUpdatePanel);

        add(tab);

        tab.addMouseListener(tabL);

        setTitle("영화관리시스템");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CenterFrame cf = new CenterFrame(600, 500);
        cf.centerXY();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());
        setVisible(true);
    }

    //영화검색버튼
    ActionListener btnSearchL = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          movieVOList = movieRepository.select(searchPanel.getSearchWord(), comboBox.getSelectedIndex());
          searchPanel.setMovieVOList(movieVOList);
          searchPanel.putSearchResult();
      }
    };

    //영화추가버튼
    ActionListener btnInsertL = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            MovieVO vo = insertPanel.neededInsertData();
            movieRepository.insert(vo);
            movieVOList = movieRepository.select("", 0); //변경된 결과 행을 화면에 보여주기 위해
            insertPanel.setMovieVOList(movieVOList);
            insertPanel.putSearchResult();
            insertPanel.initInsertData(); //관리자가 영화 추가 후에 다시 입력할 수 있도록 초기화
        }
    };

    //영화수정버튼
    ActionListener btnUpdateL = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            MovieVO vo = updatePanel.neededUpdateData();
            movieRepository.update(vo);
            movieVOList = movieRepository.select("", 0); //변경된 결과 행을 화면에 보여주기 위해
            updatePanel.setMovieVOList(movieVOList);
            updatePanel.putSearchResult();
            updatePanel.initUpdateData(); //관리자가 도서 수정 후에 다시 입력할 수 있도록 초기화
        }
    };

    //영화삭제버튼
    ActionListener btnDeleteL = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int result = JOptionPane.showConfirmDialog(MainController.this,
                    "정말 삭제하시겠습니까?","삭제",JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                MovieVO vo = updatePanel.neededUpdateData();
                movieRepository.delete(vo);
                movieVOList = movieRepository.select("", 0);
                updatePanel.setMovieVOList(movieVOList);
                updatePanel.putSearchResult();
                updatePanel.initUpdateData();
            }
        }
    };

    //영화수정탭에 테이블 클릭 이벤트
    MouseAdapter tableUpdateL = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
                int rowIndex = tableUpdate.getSelectedRow();
                if (rowIndex >= 0) {
                    updatePanel.setTextField(rowIndex);
                }
        }
    };

    //회원검색버튼
    ActionListener userBtnSearchL = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            userVOList = userRepository.select(
                    userSearchPanel.getSearchWord(),
                    userComboBox.getSelectedIndex()
            );
            userSearchPanel.setUserVOList(userVOList);
            userSearchPanel.putSearchResult();
        }
    };

    //회원추가버튼
    ActionListener userBtnInsertL = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            UserVO vo = userInsertPanel.neededInsertData();
            userRepository.insert(vo);
            userVOList = userRepository.select("", 0);
            userInsertPanel.setUserVOList(userVOList);
            userInsertPanel.putSearchResult();
            userInsertPanel.initInsertData();
        }
    };

    //회원수정버튼
    ActionListener userBtnUpdateL = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            UserVO vo = userUpdatePanel.neededUpdateData();
            userRepository.update(vo);
            userVOList = userRepository.select("", 0);
            userUpdatePanel.setUserVOList(userVOList);
            userUpdatePanel.putSearchResult();
            userUpdatePanel.initUpdateData();
        }
    };

    //회원삭제버튼
    ActionListener userBtnDeleteL = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int result = JOptionPane.showConfirmDialog(
                    MainController.this,
                    "정말 삭제하시겠습니까?",
                    "삭제",
                    JOptionPane.YES_NO_OPTION
            );
            if (result == JOptionPane.YES_OPTION) {
                UserVO vo = userUpdatePanel.neededUpdateData();
                userRepository.delete(vo);
                userVOList = userRepository.select("", 0);
                userUpdatePanel.setUserVOList(userVOList);
                userUpdatePanel.putSearchResult();
                userUpdatePanel.initUpdateData();
            }
        }
    };

    //회원수정탭에 테이블 클릭 이벤트
    MouseAdapter userTableUpdateL = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            int rowIndex = userTableUpdate.getSelectedRow();
            if (rowIndex >= 0) {
                userUpdatePanel.setTextField(rowIndex);
            }
        }
    };

    //정보 변경 시 각 탭에 바로 반영
    MouseAdapter tabL = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            int tabIndex = tab.getSelectedIndex();
            if (tabIndex == 0) { //영화검색
                movieVOList = movieRepository.select("", 0);
                searchPanel.setMovieVOList(movieVOList);
                searchPanel.putSearchResult();
            }
            if (tabIndex == 1) { //영화추가
                movieVOList = movieRepository.select("", 0);
                insertPanel.setMovieVOList(movieVOList);
                insertPanel.putSearchResult();
            }
            else if (tabIndex == 2) { //영화수정/삭제
                movieVOList = movieRepository.select("", 0);
                updatePanel.setMovieVOList(movieVOList);
                updatePanel.putSearchResult();
            }
            else if (tabIndex == 3) { //회원검색
                userVOList = userRepository.select("", 0);
                userSearchPanel.setUserVOList(userVOList);
                userSearchPanel.putSearchResult();
            }
            else if (tabIndex == 4) { //회원추가
                userVOList = userRepository.select("", 0);
                userInsertPanel.setUserVOList(userVOList);
                userInsertPanel.putSearchResult();
            }
            else if (tabIndex == 5) { //회원수정/삭제
                userVOList = userRepository.select("", 0);
                userUpdatePanel.setUserVOList(userVOList);
                userUpdatePanel.putSearchResult();
            }
        }
    };

    public static void main(String[] args) {
        new MainController();
    }
}
