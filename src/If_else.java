import java.util.Scanner;
public class If_else {

	public static void main(String[] args) {
//		다중 if else를 사용하여 성적을 산출하세요. 
		Scanner scanner = new Scanner(System.in);
		System.out.println("성적을 입력하세요");
		
		int score = scanner.nextInt();
		
		if(score>=90) {
			if(score>=95) {
				System.out.println("A+");
			} else {
				System.out.println("A");
			}
		}
		else if(score>=80) {
			if(score>=85) {
				System.out.println("B+");
			} else {
				System.out.println("B");
			}
		}
		else if(score>=70) {
			if(score>=75) {
				System.out.println("c+");
			} else {
				System.out.println("c");
			}
		}
		else if(score>=60) {
			if(score>=65) {
				System.out.println("d+");
			} else {
				System.out.println("d");
			}
		} else {
			System.out.println("f");
		}
	}

}
