package org.review.classEX;

//인스턴스화 연습
//실행을 하려면 Main메서드를 먼저 선언해야함
//new로 객체 생성 - 어느 클래스에서 객체를 만들어낼 건지 선언
//.메서드호출
public class ClassMain {
	
	public static void main(String[] args) {
		ClassEX ex1 = new ClassEX();
		ex1.userName = "Inky";
		ex1.userID = "뭐로 나올까";
		ex1.userPW = 1234;
		
		System.out.println(ex1.userID);
		
	}

}
