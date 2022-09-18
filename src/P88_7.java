import java.util.Scanner;
public class P88_7 {

	public static void main(String[] args) {
		System.out.println("성적을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		char score = scanner.next().charAt(0);
		
		switch(score) {
		case 'A':
		case 'B':
			System.out.println("Excellent");
			break;
			
		case 'C':
		case 'D':
			System.out.println("Good");
			break;
			
		case 'F':
			System.out.println("Bye");
			break;
			
		default :
			System.out.println("다시입력해주세요");
		}
	}

}
