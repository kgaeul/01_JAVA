

/*public static void main(String[] args)
 public : 접근제한자 (public, protected, private, default)
 public : 모든 곳에서 접근가능
 protected : 같은패키지 안에서만 가능 + 상속 클래스에서만 접근가능
 private : 클래스 내에서만 접근가능
 default : 같은 패키지 안에서 가능

public을 쓰는 이유 : main은 프로그램에서 기본이 되는 것이기 때문에 public을 사용한다. 모든 클래스에서 접근 가능한 메소드 임을 선언하고 시작하는 것.
메소드 : 어떤 특정 작업을 수행하기 위한 명령문의 집합
static / heap  : 변수와 메소드를 메모리를 할당할 떄 저장되는 영역
static : 프로그램이 실행될 때 저장 GC(Garbaga Collecter)가 정리하지 못함
heap : 메소드에서 실행될 때 저장 GC(Garbaga Collecter)가 정리가능 
main에서 static을 사용하는 이유는 프로그램의 기본이 되어야 하는 함수가 정리되면 안되기 때문에 static영역에 메모리 할당을 시켜주는 것.
void : 반환이 없다는의미 (return이 없음) 메인이 죽으면 다음단계가 없이 프로그램이 종료됨 return을 가질 수 없음
main : 자바가 시작하는 문법 규칙 class의 메인을 나타냄

string[] args : String 문자열, []배열을 뜻하고, args 라는 문자열 배열을 사용한다.
메인함수에서 String[]args 생략할 수 없는 이유는 프로그램이 시작되는 부분이기 떄문에 외부에서 값을 받을수 있어야 하기 떄문 


System.out.print(); : 괄호안 내용을 단순히 출력
System.out.println(); : 줄바꿈 문자 포함돼서 출력 후 한 줄 띄워짐
*/


public class HellowWorld {

	public static void main(String[] args) {
	 System.out.print("안녕하세요");
	 System.out.println("반갑습니다");
	 System.out.println("죄송합니다");
	 System.out.print("줄 바꿈 없는 프린트!");
	 System.out.print("진짜로 줄을 안바꿉니다???????");
	 
	 System.out.println("김가을");
	 System.out.print("안녕하세요");
	}
	
}


