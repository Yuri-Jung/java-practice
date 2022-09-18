import java.util.Scanner;
//나이를 입력받아 20대인지 판별하는 프로그램을 만들어라 if else사용(1~99)
public class Jogun {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age = scanner.nextInt();
		
		if((30>age)&&(age>19)) {
		System.out.println("20대 입니다.");
		} else {
			System.out.println("20대가 아닙니다.");
		}
		scanner.close();
	}

}
