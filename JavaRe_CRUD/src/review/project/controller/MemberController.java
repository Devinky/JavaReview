package review.project.controller;

import java.util.Scanner;

import review.project.commend.ExecuteQueryCommend;
import review.project.commend.MemberDelete;
import review.project.commend.MemberInsert;
import review.project.commend.MemberSelect;
import review.project.commend.MemberUpdate;

public class MemberController {
	
	public static void main(String[] args) {
		
		System.out.println("회원가입 프로그램 실행");

		Scanner input = new Scanner(System.in);
		
		ExecuteQueryCommend commend = null;
		
		while(true) {
			System.out.print("\n회원가입(insert)\n회원정보수정(update)\n회원목록조회(select)\n회원탈퇴(delete)\n: ");
			String query = input.next();
			if(query.equals("insert")) {
				commend = new MemberInsert();
				commend.ExecuteCommend();
			}else if(query.equals("select")) {
				commend = new MemberSelect();
				commend.ExecuteCommend();
			}else if(query.equals("update")) {
				commend = new MemberUpdate();
				commend.ExecuteCommend();
			}else if(query.equals("delete")) {
				commend = new MemberDelete();
				commend.ExecuteCommend();
			}else if(query.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("입력 오류. 다시 입력하세요.");
			}
		}
		
	}

}
