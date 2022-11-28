package org.review.gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiStudy extends JFrame {
	//GridLayout 배치관리자로 회원가입 윈도우 만들어보기
	//아이디, 비밀번호, 이름, 이메일, 전화번호 5개 입력할 수 있는 칸을 작성
	//아래에 회원가입 버튼 구현
	//전화번호 칸은 텍스트박스가 3개 ㅁ-ㅁ-ㅁ 모양으로(가능?)
	
	public JButton btn;
	
	public GuiStudy() {
		setTitle("Sign up");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout signGrid = new GridLayout(5, 2);
		signGrid.setVgap(3);
		setLayout(signGrid);
		
		add(new JLabel("ID"));
		add(new JTextField("사용할 아이디를 입력해주세요."));
		add(new JLabel("Password"));
		add(new JTextField("사용할 비밀번호를 입력해주세요."));
		add(new JLabel("이름"));
		add(new JTextField(""));
		add(new JLabel("E-Mail"));
		add(new JTextField(""));
		add(new JLabel("전화번호"));
		add(new JTextField(""));

		
		
		setSize(500, 300);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		new GuiStudy();
	}

}
