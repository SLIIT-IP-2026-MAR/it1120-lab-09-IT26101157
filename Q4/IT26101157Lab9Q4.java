import java.util.Scanner;

public class IT26101157Lab9Q4{
	public static void main(String[] args){
		
		//create a Scanner object for input
		Scanner userInput=new Scanner(System.in);
		
		//create 1D string Array
		String[] names=new String[5];
		
		//create 1D double arrays
		double[] assignmentMarks=new double[5];
		double[] examMarks=new double[5];
		double[] finalMarks=new double[5];
		
		//create 1D char arrays
		char[] grades=new char[5];
		
		//input for 5 students
		for(int i=0;i<5;i++){
			System.out.println();
			System.out.print("Enter name of student "+(i+1)+" : ");
			names[i]=userInput.nextLine();
			
			System.out.print("Enter assignment mark (out of 100) for "+names[i]+" : ");
			assignmentMarks[i]=userInput.nextLine();
			
			System.out.println("Enter exam paper mark (out of 100) for "+names[i]+" : ");
			examMarks[i]=userInput.nextLine();
			userInput.nextLine();
			
			//calculate final mark and grades
			finalMarks[i]=calcfinalMark(assignmentMarks[i],examMarks[i]); 
			grade[i]=finalGrades(finalMarks[i]);
		}
		System.out.println();
		
		//print the headers
		System.out.println("Name\t\tFinal mark\tGrade");
		
		//print details of each student
		for(int i=0;i<5;i++){
			//call 'printDetails' method
			printDetails(names[i],finalMarks[i],grade[i]);
			
		}
	}
	//method to calculate the final mark
	public static double calcFinalMark(double assignment,double examMark){
		return (assignmentMarks*0.3)+(examMarks*0.7);//30% assignment 70% exam
	}
	
	//method to determine the grade based on the final mark
	public static char finalGrades(double finalMark){
		if (fnalMark >= 75){
			return 'A';
		}else if (fnalMark >=60){
			return 'B';
		}else if(fnalMark >= 50){
			return 'C';
		}else {
			return 'F';
		}
	}
	
	//method to print the details of a student
	public static void printDetails(String name,double fnalMark,char grade){
		System.out.println(name+"\t\t"+String.format("%.2f",fnalMark)+"\t\t"+grade)
	}
}