package test;

public class Return {

	public static void main(String[] args) {
//		int getTenTotal() {
//			int i;
//			int total=0;
//			for(i=1; i<=10; i++) {
//				total+=1;
//			}
//		return total;

	void divide(int num1, int num2) {
		if (num2==0) {
			System.out.println("나누는 수는 0이 될 수 없습니다.");
			return;
		}
		else {
			int result=num1/num2;
			System.out.println(num1+"/"+num2+"="+result+"입니다.");
			
		}
	}
	}
	}


