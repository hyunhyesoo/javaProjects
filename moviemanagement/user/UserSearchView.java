package moviemanagement.user;

import moviemanagement.movie.MovieVO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class UserSearchView extends JPanel {
    JTable table;
    DefaultTableModel model;
    ArrayList<UserVO> userVOList;
    String[] header = {"아이디", "비밀번호", "이름", "전화번호", "등급", "적립금", "권한"};
    JLabel label;
    JTextField textField;
    JButton button;
    String searchWord = "";
    JPanel panel;
    JComboBox<String> comboBox;
    String[] comboStr = {"아이디", "이름", "전화번호", "권한"};

    public UserSearchView() {
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
        model = new DefaultTableModel(header, userVOList.size()) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table = new JTable(model);
        //테이블 컬럼 너비
        table.getColumnModel().getColumn(0).setPreferredWidth(100);  // 아이디
        table.getColumnModel().getColumn(1).setPreferredWidth(100);  // 비밀번호
        table.getColumnModel().getColumn(2).setPreferredWidth(80);   // 이름
        table.getColumnModel().getColumn(3).setPreferredWidth(120);  // 전화번호
        table.getColumnModel().getColumn(4).setPreferredWidth(60);   // 등급
        table.getColumnModel().getColumn(5).setPreferredWidth(80);   // 적립금
        table.getColumnModel().getColumn(6).setPreferredWidth(80);   // 권한

        //테이블의 행 개수가 많을 때는 스크롤바가 필요
        JScrollPane scrollPane = new JScrollPane(table);

        //각 셀에 리스트에 저장된 BookV0객체가 가지고 있는 값들을 설정
        putSearchResult();

        //현재 패널에 north에는 panel, center에는 스크롤바가 있는 테이블
        add(panel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    //defaultTablemodel에 회원정보들을 설정
    public void putSearchResult() {
        model.setRowCount(userVOList.size());
        UserVO vo;
        for (int i = 0; i < userVOList.size(); i++) {
            vo = userVOList.get(i);
            model.setValueAt(vo.getUserId(), i, 0);
            model.setValueAt(vo.getPassword(), i, 1);
            model.setValueAt(vo.getName(), i, 2);
            model.setValueAt(vo.getPhone(), i, 3);
            model.setValueAt(vo.getGrade(), i, 4);
            model.setValueAt(vo.getPoint(), i, 5);
            model.setValueAt(vo.getRole(), i, 6);
        }
    }

    public String getSearchWord() {
        searchWord = textField.getText();
        return searchWord;
    }

    public void setUserVOList(ArrayList<UserVO> userVOList) {
        this.userVOList = userVOList;
    }

    public JButton getBtnSearch() {return button;}

    public JComboBox<String> getComboBox() {return comboBox;}

    public JTable getTable() {return table;}
}
