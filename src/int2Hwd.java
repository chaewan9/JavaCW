import java.util.Scanner;

public class int2Hwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수를 입력받아 한글로 출력하는 프로그램입니다.");
		System.out.println("정수를 입력하세요: ");
		int number = input.nextInt();//정수를 입력받아서 저장합니다.
		
		//1은 하나,2는 둘 나머지는 없음을 출력합니다.
		switch(number) {
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		default:
			System.out.println("없음");
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
