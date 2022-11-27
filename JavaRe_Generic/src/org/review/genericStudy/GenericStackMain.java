package org.review.genericStudy;
//GenericStack 구현
public class GenericStackMain {
	
	public static void main(String[] args) {
		
		GenericStack<Integer> gStack = new GenericStack<Integer>();
		
		int size = gStack.oStack.length;
		
		for(int i=0;i<20;i++) {
			int i2 = i+1;
			gStack.push(i2);
			System.out.println(gStack.oStack[i]);
		}
		
		for(int i=0;i<size;i++) {
			System.out.println(gStack.idx);
			System.out.println(gStack.pop());
		}
	
	}

}
