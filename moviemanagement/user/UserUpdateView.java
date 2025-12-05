package moviemanagement.user;

import moviemanagement.movie.MovieVO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class UserUpdateView extends JPanel {
    JTable table;
    DefaultTableModel model;
    ArrayList<UserVO> userVOList;
    String[] header = {"아이디", "비밀번호", "이름", "전화번호", "등급", "적립금", "권한"};
    String[] gradeNames = {"basic", "gold", "vip"};

    JPanel panelUD;
    JLabel[] labels = new JLabel[header.length];
    JTextField[] textFields = new JTextField[header.length];
    JComboBox<String> gradeCombo;
    JButton buttonUD;
    JButton buttonDEL;


    public UserUpdateView() {
        setLayout(new BorderLayout());
        gradeCombo = new JComboBox<>(gradeNames);
        buttonUD = new JButton("회원수정");
        buttonDEL = new JButton("회원삭제");
        panelUD = new JPanel(new GridLayout(4, 4, 5, 5));
        int i;
        for (i = 0; i < labels.length; i++) {
            labels[i] = new JLabel(header[i]);
            panelUD.add(labels[i]);// 왼쪽: 라벨

            if (i == 4) { // 등급 컬럼만 콤보박스
                panelUD.add(gradeCombo);// 오른쪽: 콤보
            } else {
                textFields[i] = new JTextField();
                panelUD.add(textFields[i]);// 오른쪽: 텍스트필드
            }
        }
        textFields[0].setEditable(false);

        panelUD.add(buttonUD);
        panelUD.add(buttonDEL);
    }

    //테이블에서 선택한 행의 셀 값들이 텍스트필드에 설정되게
    public void setTextField(int rowIndex) {
        for (int i = 0; i < textFields.length; i++) {
            if (i == 4) {
                gradeCombo.setSelectedItem(model.getValueAt(rowIndex, 4).toString());
            } else {
                textFields[i].setText(model.getValueAt(rowIndex, i).toString());
            }
        }
    }

    //JTable과 DefaultTableModel을 연결하고 테이블과 관련된 내용을 초기화
    public void initView() {
        model = new DefaultTableModel(header, userVOList.size()) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table = new JTable(model);
        //테이블 컬럼 너비
        table.getColumnModel().getColumn(0).setPreferredWidth(100);
        table.getColumnModel().getColumn(1).setPreferredWidth(100);
        table.getColumnModel().getColumn(2).setPreferredWidth(80);
        table.getColumnModel().getColumn(3).setPreferredWidth(120);
        table.getColumnModel().getColumn(4).setPreferredWidth(60);
        table.getColumnModel().getColumn(5).setPreferredWidth(80);
        table.getColumnModel().getColumn(6).setPreferredWidth(80);

        //테이블의 행 개수가 많을 때는 스크롤바가 필요
        JScrollPane scrollPane = new JScrollPane(table);

        //각 셀에 리스트에 저장된 UserV0객체가 가지고 있는 값들을 설정
        putSearchResult();

        //현재 패널에 center에는 스크롤바가 있는 테이블, south에는 회원추가 패널
        add(scrollPane, BorderLayout.CENTER);
        add(panelUD, BorderLayout.SOUTH);
    }

    //defaultTablemodel에 회원정보들을 설정
    public void putSearchResult() {
        model.setRowCount(userVOList.size());
        for (int i = 0; i < userVOList.size(); i++) {
            UserVO vo = userVOList.get(i);
            model.setValueAt(vo.getUserId(), i, 0);
            model.setValueAt(vo.getPassword(), i, 1);
            model.setValueAt(vo.getName(), i, 2);
            model.setValueAt(vo.getPhone(), i, 3);
            model.setValueAt(vo.getGrade(), i, 4);
            model.setValueAt(vo.getPoint(), i, 5);
            model.setValueAt(vo.getRole(), i, 6);
        }
    }

    public JButton getButtonUD() {
            return buttonUD;
    }

    public JButton getButtonDEL() {
        return buttonDEL;
    }

    public JTable getTable() {
            return table;
    }

    public void setUserVOList(ArrayList<UserVO> userVOList) {
            this.userVOList = userVOList;
    }

    public UserVO neededUpdateData() {
        UserVO vo = new UserVO();
        vo.setUserId(textFields[0].getText());
        vo.setPassword(textFields[1].getText());
        vo.setName(textFields[2].getText());
        vo.setPhone(textFields[3].getText());
        vo.setGrade((String) gradeCombo.getSelectedItem());

        String pointText = textFields[5].getText().trim();
        int point = 0;
        if (!pointText.isEmpty()) {
            point = Integer.parseInt(pointText);
        }
        vo.setPoint(point);

        String roleText = textFields[6].getText().trim();
        if (roleText.isEmpty()) {
            roleText = "user";
        }
        vo.setRole(roleText);

        return vo;
    }

    public void initUpdateData() {
        for (int i = 0; i < textFields.length; i++) {
            if (i == 4) continue; // 등급은 콤보박스
            if (textFields[i] != null) {
                textFields[i].setText("");
            }
        }
        gradeCombo.setSelectedIndex(0);
    }
}
