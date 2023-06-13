package scanner;

import java.util.Scanner;

public class TestClass02 {

	public static void main(String[] args) {
		/*
		 * 알 수 없는 값은 출력을 진행할 수 없음 
		 	초기화 방법
		 	- 자료형의 첫 문자가 소문자면 0으로 초기화한다.
		 	- 자료현의 첫 문자가 대문자명 null으로 초기화한다.
		 */

//		int num = 0;	//초기화 진행	// 0은 양수도 아니고 음수도 아닌 의미 없는 값
		
//		String name = null;
//		Scanner sc = null;
		
		int kor, eng, mat;
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇입니까? ");
		name = sc.next();
		
		System.out.print(name + "님의 국어 점수 : ");
		kor = sc.nextInt();
		
		System.out.print(name + "님의 영어 점수 : ");
		eng = sc.nextInt();
		
		System.out.print(name + "님의 수학 점수 : ");
		mat = sc.nextInt();
		
		int sum = kor + eng + mat;
		
		System.out.println("=============");
		System.out.println("이름 : "+name);
		System.out.println("=============");
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+mat);
		System.out.println("=============");
		System.out.println("합계 : "+sum);
		System.out.println("=============");
		
	}

}
