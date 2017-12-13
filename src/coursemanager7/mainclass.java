package coursemanager7;

import java.util.Scanner;

public class mainclass {
	public static void main(String [] args) {
		coursemanager7 cm = new coursemanager7();
		Scanner i = new Scanner(System.in);
		
		System.out.print("how many student do u want to add :");
		int n = i.nextInt();
		for(int c = 0 ; c < n ; c++) {
		Student z =new Student();
		System.out.print("Set ID :");
		z.setId(i.nextInt());
		System.out.print("Set Name :");
		z.setName(i.next());
		System.out.print("Set GPA :");
		z.setGpa(i.nextDouble());
		cm.addStudent(z);
		}
		
		cm.displayallstudents();
	}
}
