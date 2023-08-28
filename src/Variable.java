/*
 * int :정수형
 * sring : 문자형
 변수를 선언할 때 변수명은 하나의 자료명만 가능하다.
 변수형은 재사용 가능하다.
 ex) 
 변수란 메모리(RAM)에 값을 기록하기 위한 공간
 변수의 선언 : 메모리 공간에 데이터를 저장할 수 있는 공간을 할당하는 것
 변수 선언 방법 : 
 1) 자료형 / 변수형;
 2) 자료형 변수형 = 값;
 
  */
public class Variable {
	public static void main(String[] args) {
		int age = 24;
		System.out.println("나이 : "+age + "세");
	
		age = 48;
		System.out.println("나이: "+age +"세");
		int month = 8;
		int day =28;
		System.out.println(month+"월 "+ day+"일");
		String date = "월";
		String day2 = "일";
		System.out.println(month+date + day+day2);
		
		String name = "김가을";
		month =7;
		day =22;
		System.out.println(name+" 내 생일은 "+month+"월 "+day+"일이에용");
	
		//자료형 변수명;
		int number1;
		number1= 100;
		System.out.println("number1:" + number1);
	
		number1=200;

		System.out.println("number1(재사용) : "+number1);
		//자료형 변수명 = 변수값;
		int number2 =300;
		System.out.println("number2 :" +number2);
		
		String name1 =  "김가을";
		System.out.println("name1 : "+name1);
		name1 = "hi java";
		System.out.println("name1 : " + name1);
				
	}

}
