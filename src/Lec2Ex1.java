import java.util.Scanner;

public class Lec2Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num1, num2;//정수 2개를 저장합니다.
		
		System.out.println("두 개의 정수를 입력받아서 둘 중에 큰 수를 출력하는 프로그램입니다.");
		System.out.println("첫 번째 정수를 입력하세요: ");
		num1 = input.nextInt();//첫 번째 정수를 입력받습니다.
		System.out.println("두 번째 정수를 입력하세요: ");
		num2 = input.nextInt();//두 번째 정수를 입력받습니다.
		if(num1 > num2)//두 정수를 비교합니다.
			System.out.println("둘 중에 큰 수는 " + num1 + "입니다.");
		else
			System.out.println("둘 중에 큰 수는 " + num2 + "입니다.");
		System.out.println("프로그램을 종료합니다.");
	}

}
