package org.review.threadStudy;

//java.lang패키지의 Thread클래스를 상속받는다
public class ThreadEx1128 extends Thread{
	
	@Override
	public void run() {
		System.out.println("상속받은 Thread클래스의 run메서드 오버라이드");
	}
	
	public static void main(String[] args) {
		
		ThreadEx1128 t1 = new ThreadEx1128();
		t1.start(); //start클래스? 메서드?로 실행
		t1.run(); //run도 되네?
		
		System.out.println(t1);
		
	}

}
