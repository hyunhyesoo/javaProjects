package moviemanagement.movie;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class MovieInsertView extends JPanel {
    JTable table;
    DefaultTableModel model;
    ArrayList<MovieVO> movieVOList;
    String[] header = {"영화번호", "영화제목", "상영시간(분)", "장르", "관람등급"};
    String[] ratingNames = {"전체", "12세", "15세", "19세"};

    JPanel panelIS;
    JLabel[] labels = new JLabel[header.length];
    JTextField[] textFields = new JTextField[header.length - 1];
    JComboBox<String> ratingCombo;
    JButton buttonIS;


    public MovieInsertView() {
        setLayout(new BorderLayout());
        ratingCombo = new JComboBox<>(ratingNames);
        buttonIS = new JButton("영화추가");
        panelIS = new JPanel(new GridLayout(4, 4));
        int i;
        for (i = 0; i < labels.length; i++) {
            labels[i] = new JLabel(header[i]);
            panelIS.add(labels[i]);

            if (i < header.length - 1) {
                textFields[i] = new JTextField();
                panelIS.add(textFields[i]);
            } else {
                panelIS.add(ratingCombo);
            }
        }

        for (i = 0; i < 3; i++) {
            panelIS.add(new JLabel(""));
        }
        panelIS.add(buttonIS);
    }

    //JTable과 DefaultTableModel을 연결하고 테이블과 관련된 내용을 초기화
    public void initView() {
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

        //각 셀에 리스트에 저장된 movieV0객체가 가지고 있는 값들을 설정
        putSearchResult();

        //현재 패널에 center에는 스크롤바가 있는 테이블, south에는 영화추가 패널
        add(scrollPane, BorderLayout.CENTER);
        add(panelIS, BorderLayout.SOUTH);
    }

    //defaultTablemodel에 영화정보들을 설정
    public void putSearchResult() {
        model.setRowCount(movieVOList.size());
        MovieVO vo = null;
        for (int i = 0; i < movieVOList.size(); i++) {
            vo = movieVOList.get(i);
            model.setValueAt(vo.getMovieNo(), i, 0);
            model.setValueAt(vo.getMovieTitle(), i, 1);
            model.setValueAt(vo.getRuntime(), i, 2);
            model.setValueAt(vo.getGenre(), i, 3);
            model.setValueAt(vo.getRating(), i, 4);
        }
    }

    public JButton getButtonIS() {
        return buttonIS;
    }

    public void setMovieVOList(ArrayList<MovieVO> movieVOList) {
        this.movieVOList = movieVOList;
    }

    public MovieVO neededInsertData() {
        MovieVO vo = new MovieVO();
        vo.setMovieNo(textFields[0].getText());
        vo.setMovieTitle(textFields[1].getText());
        vo.setRuntime(Integer.parseInt(textFields[2].getText()));
        vo.setGenre(textFields[3].getText());
        vo.setRating((String) ratingCombo.getSelectedItem());
        return vo;
    }

    public void initInsertData() {
        for (int i = 0; i < textFields.length; i++) {
            textFields[i].setText("");
        }
        ratingCombo.setSelectedIndex(0);
    }
}
