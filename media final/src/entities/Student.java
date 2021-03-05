package entities;

public class Student {
	public	String	name;
	public	double	score1,score2,score3;
	
	public double finalGrade() {
		return (score1 + score2 + score3);
	}
	public String toString() {
		String message = "Final Grade = " + String.format("%.2f%n", finalGrade());
		if (finalGrade()>=60.00) {
			message += "PASS";
		}
		else {
			double missingPoints = 60.00-finalGrade();
			message += "Failed" + String.format("%nMissing Points %.2f%n", missingPoints);
		}
		return message;
	}
	

}
