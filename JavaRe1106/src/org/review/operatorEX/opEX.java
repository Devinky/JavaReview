package org.review.operatorEX;

public class opEX {
	public static void main(String[] args) {
		
		//534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때
		//학생당 몇개를 가질 수 있고 최종적으로 몇 개가 남는지를 구하라
		
		int pencil = 534;
		int student = 30;
		
		int pencil_std = (pencil/student);
		
		System.out.println("인당 연필 갯수 : " + pencil_std + " 개");
		
		int pencil_left = (pencil%student);
		
		System.out.println("남는 연필 갯수 : " + pencil_left + " 개");
		
	}

}
