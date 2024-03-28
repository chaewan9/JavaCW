import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number; //정수를 저장한다.
		
		System.out.println("정수를 입력하시오: ");
		number = input.nextInt(); //정수를 입력받는다.
		if(number % 2 == 0) //2로 나누었을 때 나머지가 0이면 짝수, 1이면 홀수이다.
			System.out.println("입력된 정수는 짝수입니다.");
		else
			System.out.println("입력된 정수는 홀수입니다.");
	}

}
