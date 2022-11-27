package org.review.genericStudy;

public class GenericRe01<T> {
	//필드
	T generic1;
	T generic2;
	T generic3;
	T generic4;
	T generic5;
	T generic6;
	
	public T method1(T a) {
		System.out.println("메소드 안에 포함된 메소드");
		return a;
	}

}
