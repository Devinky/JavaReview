package controller;

import java.util.Scanner;

import commend.ExecuteCommend;
import commend.MemberDelete;
import commend.MemberInsert;
import commend.MemberSelect;
import commend.MemberUpdate;

public class MemberController {
	
	public static void main(String[] args) {
		
		System.out.println("회원 프로그램 실행");
		Scanner input = new Scanner(System.in);
		
		
		ExecuteCommend commend = null;
		
		while(true) {
			System.out.print("\n무엇을 실행할까요? ");
			String query = input.next();
			
			if(query.equals("insert")) {
				commend = new MemberInsert();
				commend.executeQueryCommend();
			}else if(query.equals("update")) {
				commend = new MemberUpdate();
				commend.executeQueryCommend();
			}else if(query.equals("select")) {
				commend = new MemberSelect();
				commend.executeQueryCommend();
			}else if(query.equals("delete")) {
				commend = new MemberDelete();
				commend.executeQueryCommend();
			}
			else if(query.equals("exit")) {
				System.out.println("실행을 종료합니다.");
				break;
			}
		}
		
	}

}
