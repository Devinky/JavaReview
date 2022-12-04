package controller1204;

import java.util.Scanner;

import commend1204.ExcuteQueryCommend;
import commend1204.InsertDo;

public class MemberController {
	
	public static void main(String[] args) {
		
		System.out.println("회원가입 프로그램 실행");
		Scanner input = new Scanner(System.in);
		String query = "";
		
		ExcuteQueryCommend commend = null;
		
		while(true) {
			System.out.print("\n회원가입(insert)\n회원조회(select)\n회원수정(update)\n회원탈퇴(delete)\n : ");
			query = input.next();
			if(query.equals("insert")) {
				commend = new InsertDo();
				commend.excuetQueryCommend();
			}
			
		}
		
		
	}

}
