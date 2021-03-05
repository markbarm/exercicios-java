package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		System.out.print("Student Name: ");
		student.name = sc.nextLine();
		
		System.out.print("Score 1 = ");
		student.score1 = sc.nextDouble();
		System.out.print("Score 2 = ");
		student.score2 = sc.nextDouble();
		System.out.print("Score 3 = ");
		student.score3 = sc.nextDouble();
	
		System.out.println(student.toString());
		
		sc.close();

	}

}
