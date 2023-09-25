import java.util.Scanner;

public class FirstJavaClass {

	public static void main(String[] args) {
		//int float char string long double boolean byte short 
//		  _ $ alphanumeric  ,cannot start variable name with numbers
		
//		int age = 23;
//		float avgMarks = 23.43f;
//		char grade ='A';
////		String name = "Tejal";
//		boolean isTrue =true;
//		long bigNumber = 23434372649230702l;
		
		// Used for taking input 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your age : ");
//		int agqe = sc.nextInt();
//		String naame = sc.nextLine(); // Takes the entire input entered with spaces
//		String name = sc.next(); //Takes only the 1st part before the space
		
//
//		System.out.println(name);
//		int marks[] = new int[5];
//		marks[0] = 22;
//		marks[1] =33;
//		marks[2] = 11;
//		marks[3] = 51;
//		marks[4] = 41;
//		int m[] = {1,55,2,23,552,23};
//		
//		for (int i = 0; i < marks.length; i++) {
//			System.out.println(marks[i]);
//		}
		//two dimensional array || matrix
//		int a[][] = new int [2][3];
//		int b[][] = {{1,2},{2,3}}
		
		
		//function / method
		// returnType functionName(args) {};
			
//		System.out.println(average(2,4));
		
		//Error handling - 
		int marks[] = new int[5];
		try {
			System.out.println(marks[5]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Errorrr" +  e.getLocalizedMessage());
		}
	}	

//	static int average(int num1,int num2) {
//		int sum = num1 + num2;
//		return sum/2;
//	}

	
}
