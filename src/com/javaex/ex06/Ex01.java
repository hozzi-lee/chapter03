package com.javaex.ex06;

public class Ex01 {
	public static void main(String[] args) {

		Integer i01 = new Integer(10); // Integer i01 = 10;
		Integer i02 = new Integer(7); // Integer i02 = 7;

		//		int result = 10 + 7;
		//		Integer result = new Integer(10) + new Integer(7);
		Integer result = i01 + i02;
		System.out.println(result);
		System.out.println("-------------------------");

		// Integer 간소화
		int i10 = 7;
		Integer i11 = 10; // == Integer i11 = new Integer(10);

		// Boxing unBoxing
		Integer i100 = 15; // Boxing
		int i101 = i100; // unBoxing --> i100의 주소값이 아닌 15만 대입됨

		System.out.println(i100.toString()); // Boxing 메서드 사용 가능
		System.out.println(i101); // unBoxing 메서드 사용 불가능 --> 주소값 없음
		System.out.println();

		// String --> Integer
		System.out.println("-------String --> Integer-------");
		// String ("12345") --> Integer(12345) Ex
		Integer i999 = 999;
		int num = i999.parseInt("12345");
		System.out.println(num);
		System.out.println(i999);
		System.out.println();
		// String ("1234567") --> Integer(1234567) Use
		String str = "1234567";
		int num2 = Integer.parseInt(str);
		System.out.println(num2);
		System.out.println();

		// Integer --> String
		System.out.println("-------Integer --> String-------");
		int num3 = 12345;
		String str2 = String.valueOf(num3);
		System.out.println(str2);

		// Integer --> String useTip
		String strResult3 = "" + 9876; // 9876 --> "9876"
		System.out.println(strResult3);


		// String equals()
		String inputText = "y"; // 사용자가 입력한 값
		inputText = null;

		// null 포인트 상황이 발생할 수 있다.
		if(inputText.equals("y")) {
			System.out.println("게임 다시 시작");
		}
		// equals useTip --> null 포인트 상황이 발생하지 않는다.
		if("y".equals(inputText)) {
			System.out.println("게임 다시 시작");
		}


		// 다른 기본 자료형
		Byte b = new Byte((byte)1); // 강제 형변환 필요
		Short s = new Short((short)2); // 강제 형변환 필요

		Byte b2 = new Byte("1"); // 문자열이 아닌 정수로 초기화
		Short s2 = new Short("2"); // 문자열이 아닌 정수로 초기화
		Integer i = new Integer("4"); // 문자열이 아닌 정수로 초기화
		// 정수로 초기화 돼서 int형 변수에 대입됨
		// String str0 = i; --> 오류
		int i2 = b2;
		int i3 = s2;
		int i4 = i;
	}

}
