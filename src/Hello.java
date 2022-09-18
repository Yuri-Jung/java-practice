
public class Hello {

//	public static void main(String[] args) {
//		public class Student{
//			int studentID;
//			String studentName;
//			int grade;
//			String address;
//		}
//		
//		Student studentAhn = new Student();
		//Student student1 = new Student();
//		student1.studentName="안연수";
//		System.out.println(student1.getStudentName());
//		Student student2=new Student();
//		student2.studentName="안승연";
//		System.out.println(student2.getStudentName());
//		studentAhn.studentName="안승연";
		
//		System.out.println(studentAnh.studentName);
//		System.out.println(studentAnh.getStuentName);
		
		public class Student {
			int studentID;
			String studentName;
			int grade;
	    	String address;
			
			public String getStudentName() {
				return studentName;
			}
			
			
			public static void main(String[ ] args) {		//main() 함수
				Student studentAhn = new Student();
				studentAhn.studentName = "김상민";
				
				System.out.println(studentAhn.studentName);
				System.out.println(studentAhn.getStudentName());
			}
		}
	}

}
