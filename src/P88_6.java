import java.util.Scanner;
public class P88_6 {

	public static void main(String[] args) {
		System.out.println("돈을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		 
		System.out.println("오만원권 "+money/50000+"개 ");
		money = money%50000;
		
		System.out.println("만원 권 "+money/10000+"개 ");
		money = money%10000;
		
		System.out.println("천원 권 "+money/1000+"개 ");
		money = money%1000;
		
		System.out.println("오백원 "+money/500+"개 ");
		money = money%500;
		
		System.out.println("백원 "+money/100+"개");
		money = money%100;
		
		System.out.println("십원 "+money/10+"개");
		money= money%10;
		
		System.out.println("일원 "+money/1+"개");
		money = money%1;
		
	}
}