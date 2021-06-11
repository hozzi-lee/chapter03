package com.javaex.ex01;

import com.javaex.ex02.Point;

public class ObjApp {
	public static void main(String[] args) {

		// Object.class
		System.out.println("----------Object.class----------");
		Object obj01 = new Object();
		System.out.println(obj01.hashCode());
		System.out.println(obj01.getClass());
		System.out.println(obj01.toString());
		System.out.println(obj01.equals(obj01));
		System.out.println();

		// getClass() --> 클래스 정보
		System.out.println("== Object.getClass() ==");
		System.out.println(obj01.getClass());

		// hashCode() --> 주소값(주소의 대응되는 중복되지 않는 값) --> 실제 주소는 아님
		System.out.println("== Object.hashCode() ==");
		System.out.println(obj01.hashCode() + "\t--> Object obj01.hashCode()");		
		Object o01 = new Object();
		Object o02 = new Object();
		Object o03 = new Object();
		System.out.println(o01.hashCode() + "\t--> Object o01.hashCode()");
		System.out.println(o02.hashCode() + "\t--> Object o02.hashCode()");
		System.out.println(o03.hashCode() + "\t--> Object o03.hashCode()");

		// toString() --> 객체의 값 정보
		System.out.println("== Object.toString() ==");
		System.out.println(obj01.toString());

		// equals() --> 객체가 같은지 비교
		System.out.println("== Object.equals(obj01) ==");
		System.out.println(obj01.equals(obj01));



		System.out.println();
		System.out.println();



		// Point.class
		System.out.println("----------Point.class----------");
		Point p01 = new Point(5, 5);
		System.out.println(p01.toString());

		System.out.println();
		System.out.println();

	}

}
