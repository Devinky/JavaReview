package org.review.javaAPI;

import java.util.StringTokenizer;

public class StringTokenizerEX {
	
	public static void main(String[] args) {
		
		String ur1 = "userID=devinky&userPW=1234&userName=Inky";
		StringTokenizer token = new StringTokenizer(ur1,"&");
	}

}
