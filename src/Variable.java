/*
 * int :������
 * sring : ������
 ������ ������ �� �������� �ϳ��� �ڷ�� �����ϴ�.
 �������� ���� �����ϴ�.
 ex) 
 ������ �޸�(RAM)�� ���� ����ϱ� ���� ����
 ������ ���� : �޸� ������ �����͸� ������ �� �ִ� ������ �Ҵ��ϴ� ��
 ���� ���� ��� : 
 1) �ڷ��� / ������;
 2) �ڷ��� ������ = ��;
 
  */
public class Variable {
	public static void main(String[] args) {
		int age = 24;
		System.out.println("���� : "+age + "��");
	
		age = 48;
		System.out.println("����: "+age +"��");
		int month = 8;
		int day =28;
		System.out.println(month+"�� "+ day+"��");
		String date = "��";
		String day2 = "��";
		System.out.println(month+date + day+day2);
		
		String name = "�谡��";
		month =7;
		day =22;
		System.out.println(name+" �� ������ "+month+"�� "+day+"���̿���");
	
		//�ڷ��� ������;
		int number1;
		number1= 100;
		System.out.println("number1:" + number1);
	
		number1=200;

		System.out.println("number1(����) : "+number1);
		//�ڷ��� ������ = ������;
		int number2 =300;
		System.out.println("number2 :" +number2);
		
		String name1 =  "�谡��";
		System.out.println("name1 : "+name1);
		name1 = "hi java";
		System.out.println("name1 : " + name1);
		
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		System.out.println(a+"X"+b+"="+a*b);
		
		// ������ �ȿ� ���ڸ� �ְ� ���ϱ� ���� ���ϱ� ������ �ֱ� 
		int number5=2;
		int number6 =4;
		System.out.println(number5+number6);
		//1 ���ϱ�(+)
		System.out.print("���ϱ�");
		System.out.println(number5+number6);
		
		//2 ����(-)
		System.out.print("����: ");
		System.out.println(number6-number5);
		
		//3 ���ϱ� (*)
		System.out.print("���ϱ�: ");
		System.out.println(number5*number6);
		
		//4 ������ (/)
		System.out.print("������(/): ");
		System.out.println(number6/number5);
		
		//5 ������ ���ϱ� (%)
		System.out.print("������(%): ");
		System.out.println(number6%number5);
				
	}

}
