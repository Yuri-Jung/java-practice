import java.util.Scanner;
public class P88_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1~99정수를 입력하세요");
		int num = scanner.nextInt();
		int first = num/10;
		int second = num%10;
		
		if(first%3==0){
		 if(second%3==0) {
			 System.out.println("박수짝짝");
		 }else {
			 System.out.println("박수짝");
		 }
		}
		else if (second%3==0) {
			System.out.println("박수짝");
		} else {
			System.out.println("박수없음");
		 }
		scanner.close();
		}
	
	}


