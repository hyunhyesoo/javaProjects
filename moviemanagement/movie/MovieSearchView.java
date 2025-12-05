package moviemanagement.movie;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class MovieSearchView extends JPanel {
    JTable table;
    DefaultTableModel model;
    ArrayList<MovieVO> movieVOList;
    String[] header = {"영화번호", "영화제목", "상영시간(분)", "장르", "관람등급"};
    JLabel label;
    JTextField textField;
    JButton button;
    String searchWord = "";
    JPanel panel;
    JComboBox<String> comboBox;
    String[] comboStr = {"영화번호", "영화제목", "장르", "관람등급"};

    public MovieSearchView() {
        setLayout(new BorderLayout());
        comboBox = new JComboBox<>(comboStr);
        label = new JLabel("검색어: ");
        textField = new JTextField(20);
        button = new JButton("검색");
        panel = new JPanel();
        panel.add(comboBox);
        panel.add(label);
        panel.add(textField);
        panel.add(button);
    }


    //JTable과 DefaultTableModel을 연결하고 테이블과 관련된 내용을 초기화
    public void initview() {
        model = new DefaultTableModel(header, movieVOList.size()) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table = new JTable(model);
        //테이블 컬럼 너비
        table.getColumnModel().getColumn(0).setPreferredWidth(80);   // 영화번호
        table.getColumnModel().getColumn(1).setPreferredWidth(200);  // 영화제목
        table.getColumnModel().getColumn(2).setPreferredWidth(60);   // 상영시간
        table.getColumnModel().getColumn(3).setPreferredWidth(100);  // 장르
        table.getColumnModel().getColumn(4).setPreferredWidth(80);   // 관람등급

        //테이블의 행 개수가 많을 때는 스크롤바가 필요
        JScrollPane scrollPane = new JScrollPane(table);

        //각 셀에 리스트에 저장된 BookV0객체가 가지고 있는 값들을 설정
        putSearchResult();

        //현재 패널에 north에는 panel, center에는 스크롤바가 있는 테이블
        add(panel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    //defaultTablemodel에 영화정보들을 설정
    public void putSearchResult() {
        model.setRowCount(movieVOList.size());
        MovieVO vo;
        for (int i = 0; i < movieVOList.size(); i++) {
            vo = movieVOList.get(i);
            model.setValueAt(vo.getMovieNo(), i, 0);
            model.setValueAt(vo.getMovieTitle(), i, 1);
            model.setValueAt(vo.getRuntime(), i, 2);
            model.setValueAt(vo.getGenre(), i, 3);
            model.setValueAt(vo.getRating(), i, 4);
        }
    }

    public String getSearchWord() {
        searchWord = textField.getText();
        return searchWord;
    }

    public void setMovieVOList(ArrayList<MovieVO> movieVOList) {
        this.movieVOList = movieVOList;
    }

    public JButton getBtnSearch() {return button;}

    public JComboBox<String> getComboBox() {return comboBox;}

    public JTable getTable() {return table;}
}
