/*/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
                                                                                                                                 //
  Created By- Austin Lindstrom               Date Created- 10/16/2019                          //
                                                                                                                                 //
                                                                                                                                 //
                                       Program - Part2                                                                 //
                                                                                                                                 //
           *Prompts for two students first and last names along with a total of 7         //
            grades and calculates the final average for each student usgin the             // 
            supporting class methods.                                                                           //
                                                                                                                                 //
*/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





import java.util.Scanner; //imports the scanner class for prompting

public class Part2 {
  
  public static void main (String args [] ) { //main method to represent driving program
    
    String fname, lname;              //class variables
    double hw1, hw2, q1, q2, q3, e1, e2, hwaverage1, qaverage1, eaverage1, hwaverage2, qaverage2, eaverage2, finalavg1, finalavg2;
    
Scanner input = new Scanner(System.in);


System.out.println("Please enter your first name"); //prompts for users first name
fname = input.next();

System.out.println("Please enter your last name"); //prompts for users last name
lname = input.next();

System.out.println("Please enter your first homework grade"); //prompts for users homework grades
hw1 = input.nextFloat();

System.out.println("Please enter your second homework grade");
hw2 = input.nextFloat();

System.out.println("Please enter your first quiz grade"); //prompts for users quiz grades
q1 = input.nextFloat();

System.out.println("Please enter your second quiz grade");
q2 = input.nextFloat();

System.out.println("Please enter your third quiz grade");
q3 = input.nextFloat();

System.out.println("Please enter your first exam grade");      //prompts users for exam grades
e1 = input.nextFloat();

System.out.println("Please enter your second exam grade");
e2 = input.nextFloat();



UNGStudent student1 = new UNGStudent(fname, lname, hw1, hw2,  q1, q2, q3, e1, e2);  //creates a new student object to hold values associated with the student
  hwaverage1 = student1.calcHW(); //calculates the homework average for student1 and assigns it to a variable
  qaverage1 = student1.calcQuiz();  //calculates the quiz average for student1 and assigns it to a variable
  eaverage1 = student1.calcExam(); //calculates the exam average for student1 and assigns it to a variable




System.out.println("Please enter your first name");
fname = input.next();

System.out.println("Please enter your last name");
lname = input.next();

System.out.println("Please enter your first homework grade");
hw1 = input.nextFloat();

System.out.println("Please enter your second homework grade");
hw2 = input.nextFloat();

System.out.println("Please enter your first quiz grade");
q1 = input.nextFloat();

System.out.println("Please enter your second quiz grade");
q2 = input.nextFloat();

System.out.println("Please enter your third quiz grade");
q3 = input.nextFloat();

System.out.println("Please enter your first exam grade");
e1 = input.nextFloat();

System.out.println("Please enter your second exam grade");
e2 = input.nextFloat();



UNGStudent student2 = new UNGStudent(fname, lname, hw1, hw2,  q1, q2, q3, e1, e2); //creates the student2 object

  student2.setGrades(97, 77, 84, 91, 64, 55, 72); //uses the setGrades method to change all of the parameters of the student2 object
  hwaverage2 = student2.calcHW();
  qaverage2 = student2.calcQuiz();              //calculates averages for student2 object using user defined methods
  eaverage2 = student2.calcExam();
  
  

finalavg1 = hwaverage1 + qaverage1 + eaverage1; //formulates the final average for student1
finalavg2 = hwaverage2 + qaverage2 + eaverage2; //formulates the final average for student2


System.out.println(student1.getFullName() + "-" + " Final Average: " + finalavg1); //prints out the full name and final average of student1
System.out.println(student2.getFullName() + "-" + " Final Average: " + finalavg2); //prints out the full name and final average of student2













  }
}