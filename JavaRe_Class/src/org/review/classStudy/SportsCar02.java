package org.review.classStudy;

public class SportsCar02 {
	
	String carName;
	int carYear;
	int carPrice;
	String carColor;

	SportsCar02(){
		System.out.println("기본생성자");
	}
	SportsCar02(String carName){
		this(carName, 2023, 2000, "초록색");
		System.out.println("1번 생성자");
	}
	SportsCar02(String carName, int carYear){
		System.out.println("2번 생성자");
	}
	SportsCar02(String carName, int carYear, int carPrice){
		System.out.println("3번 생성자");
	}	
	SportsCar02(String carName, int carYear, int carPrice, String carColor) {
		System.out.println("4번 생성자");
		this.carName = carName;
		this.carYear = carYear;
		this.carPrice = carPrice;
		this.carColor = carColor;
		
	}

}

