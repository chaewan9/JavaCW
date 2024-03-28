import java.util.Scanner;

public class Hwd2Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("문자를 입력받아 숫자로 출력하는 프로그램입니다.");
		System.out.println("문자를 입력하세요: ");
		String hwdNumber = input.next();//문자를 입력받아서 저장합니다.
		
		//하나는 1,둘은 2, 나머지는 없음을 출력합니다.
		switch(hwdNumber) {
		case "하나":
			System.out.println(1);
			break;
		case "둘":
			System.out.println(2);
			break;
		default:
			System.out.println("없음");
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
