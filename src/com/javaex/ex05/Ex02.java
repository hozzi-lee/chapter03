package com.javaex.ex05;

public class Ex02 {
	public static void main(String[] args) {

		String a = new String(" abcd");
		String b = new String(",efg ");

		System.out.println("-------a + b-------");
		System.out.println(a.concat(b)); // 문자열 a와 b를 합쳐라 == a + b
		System.out.println("-------output a, b-------");
		System.out.println("a= \"" + a + "\"");
		System.out.println("b= \"" + b + "\"");
		System.out.println();
		System.out.println();


		System.out.println("-------a = a.concat(b) == a + b-------");
		a = a.concat(b); // a에 a+b 대입
		System.out.println("-------output a-------");
		System.out.println(a);
		System.out.println();
		System.out.println();


		System.out.println("-------delete space of a.trim()-------");
		a = a.trim();
		System.out.println("-------output a-------");
		System.out.println(a);
		System.out.println();
		System.out.println();


		System.out.println("-------change \"ab\" to \"12\" in a-------");
		a = a.replace("ab", "12");
		System.out.println("-------output a-------");
		System.out.println(a);
		System.out.println();
		System.out.println();


		System.out.println("-------a.split() 매개변수값을 삭제하고 그 값을 기준으로 문자열 나누기 --> 배열-------");
		String[] sArray = a.split(",");
		System.out.println("-------output Array-------");
		for ( int i = 0; i < sArray.length; i++ ) {
			System.out.println(sArray[i]);
		}
		System.out.println();
		System.out.println();

		System.out.println("-------str.charAt() 매개변수값에 맞는 위치의 문자(char)가 출력됨 --> 문자열자체가 배열이됨(문자열을 이루고 있는 문자 하나하나가 char형으로 배열값이 됨)-------");
		String str = "Hello Java!";
		System.out.println(str.charAt(6));
		System.out.println();
		System.out.println();


		System.out.println("-------str.substring() 매개변수값에 맞는 위치의 문자(char)부터 끝까지 출력됨 --> 문자열자체가 배열이됨(문자열을 이루고 있는 문자 하나하나가 char형으로 배열값이 됨)-------");
		String result = str.substring(3);
		System.out.println(result);
		System.out.println();

		System.out.println("-------str.substring() 매개변수값에 맞는 위치의 문자(char)부터 문자(char)까지 출력됨 --> 문자열자체가 배열이됨(문자열을 이루고 있는 문자 하나하나가 char형으로 배열값이 됨)-------");
		String result2 = str.substring(3, 8);
		System.out.println(result2);
	}

}
