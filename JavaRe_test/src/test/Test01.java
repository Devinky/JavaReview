package test;

import java.util.Scanner;

public class Test01 {
	
	public int souliton(int num1, int num2) {
		
		int answer = 0;
		
		double sum = (num1/num2)*1000;
		answer = (int) sum;
		
		return answer;
		 
	}
	
	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);
		
		System.out.print("num1 : ");
		double num1 = input.nextInt();
		
		System.out.print("num2 : ");
		double num2 = input.nextInt();
		
		double sum = (num1/num2)*1000;
		
		int answer = (int) sum;
		
		System.out.println(sum);
		System.out.println(answer);
		
	}
	
	

}
