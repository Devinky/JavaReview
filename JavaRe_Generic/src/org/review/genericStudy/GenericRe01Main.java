package org.review.genericStudy;

public class GenericRe01Main {
	
	public static void main(String[] args) {
		
		GenericRe01<String> gen1 = new GenericRe01<String>();
		
		gen1.generic1 = new String("복습");
		gen1.generic2 = "자동 박싱";
		gen1.generic3 = "값을 여러개 넣으려면 이렇게";
		gen1.generic4 = "미리 제네릭 클래스에 필드를 여러개 선언해야 한다";
		gen1.generic5 = "필드 하나에 값을 여러개 담는 건";
		gen1.generic6 = "아무래도 불가능하지";
		
		gen1.method1("이름은 num이지만 스트링 타입");
		
		System.out.println(gen1.generic3 + " " + gen1.generic4);
		System.out.println(gen1.generic5 + " " + gen1.generic6);
		System.out.println(gen1.method1("뭐가 나올까요"));
		
		GenericRe01<Integer> gen2 = new GenericRe01<Integer>();
		
		gen2.generic1 = new Integer(10);
		gen2.generic2 = 20; //자동박싱
		gen2.generic3 = 20;
		gen2.generic4 = 20;
		gen2.generic5 = 20;
		
		System.out.println(gen2.generic1 + gen2.generic2);
		
		gen2.method1(99);
		
		System.out.println(gen2.method1(99));
		
	}

}
