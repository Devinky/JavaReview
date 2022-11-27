package org.review.genericStudy;
//Java1121_GStack 복습
public class GenericStack<T> {
	//필드
	public int idx;
	public Object[] oStack;
	
	//생성자(클래스 이름이랑 같아야함)
	public GenericStack() {
		idx = 0;
		oStack = new Object[20];
	}
	
	public void push(T elements) {
		if(idx==20) {
			return;
		}
		oStack[idx] = elements;
		idx++;
	}
	
	public T pop() {
		if(idx==0) {
			return null;
		}
		idx++;
		return(T) oStack[idx];
	}

}
