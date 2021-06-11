package com.javaex.ex05;

public class Ex01 {
	public static void main(String[] args) {

		String str01 = new String("hi");
		String str02 = new String("hi");
		String str03 = new String("hello");

		// address boolean
		System.out.println("-------address boolean-------");
		System.out.println(str01 == str02);
		System.out.println();

		// value boolean
		System.out.println("-------value boolean-------");
		System.out.println(str01.equals(str02));
		System.out.println(str01.equals(str03));
		System.out.println();

		// instance skip == value boolean
		// instance를 생략 했을 경우 "문자열"부터 찾아서 같은 문자열의 주소로 생성한다.
		// 그러므로 문자열과 주소 모두 같아진다.
		System.out.println("-------instance skip-------");
		String str04 = "hello"; // --> "hello" == new String("hello");
		String str05 = "hello"; // --> "hello" == new String("hello");
		System.out.println(str04 == str05);
		System.out.println(str04.equals(str05));
		System.out.println();

		// str04 change
		System.out.println("-------srt04 change-------");
		str04 = "!!!hello!!!"; // srt04의 주소값이 바뀜
		System.out.println("str04= \"" + str04 + "\"");
		System.out.println("str05= \"" + str05 + "\"");
		// address, value allFalse
		System.out.println(str04 == str05);
		System.out.println(str04.equals(str05));
		System.out.println();

	}

}
