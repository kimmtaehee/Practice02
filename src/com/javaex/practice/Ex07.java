package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int one = sc.nextInt();
		
		System.out.print("두번째 숫자 : ");
		int two = sc.nextInt();
		
		if (one>=two) {
			System.out.println("몫: " + one/two );
			System.out.println("나머지 " + one%two );
		}
		else{
			System.out.println("몫: " + two/one );
			System.out.println("나머지 " + two%one );
		}
		
		sc.close();

	}

}
