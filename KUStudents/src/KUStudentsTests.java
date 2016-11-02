// This lets you call upon the kustudents.java to use in your main method
import java.util.Scanner;

public class KUStudentsTests {
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		KUStudents KUInfo= new KUStudents();
		System.out.println("Please input the student's name (firstname lastname):");
		String fname=input.next();
		String lname=input.next();
		KUInfo.set_name(fname, lname);
		System.out.println("Please input the student's KUID and department:");
		String id=input.next();
		String department=input.next();
		KUInfo.set_kuinfo(id,department);		
		writeOutput(KUInfo);
	input.close();
	}
	public static void writeOutput(KUStudents stu)
	{
		System.out.println("Student: " + stu.get_fname()+ " " +stu.get_lname());
		System.out.println("KUID: " +stu.get_id());
		System.out.println("Department: " +stu.get_dept());
	}

}
