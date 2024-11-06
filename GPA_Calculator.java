/*/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
                                                                                                                                 //
  Created By- Austin Lindstrom               Date Created- 9/25/2019                            //
                                                                                                                                 //
                                                                                                                                 //
                           Program - UNG GPA Calculator                                                     //
                                                                                                                                 //
           *Calculates a student's GPA using information provided by                          //
           the user such as the quality points and number of credits                            //
           obtained for each of the 4 classes. Is calculated by mulitplying                     //
           each number of credits times quality points divided by the total # of credits//
                                                                                                                                //
*/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



import java.util.Scanner;
import java.text.DecimalFormat;               //import necessary packages


public class Part1 {
  
   public static void main(String args [] )  {
    
    
    
   
   int credits, credits2, credits3, credits4, length, index;                                                                                                      //variables
   String full_name, fname, lname, major, course_num, course_num2, course_num3, course_num4, qp, qp2, qp3, qp4;
   
   Scanner input = new Scanner(System.in); //creates a new scanner object
   
   System.out.println("Welcome to the UNG GPA calculater!");
   
   System.out.println("Please enter your Full Name");
     full_name=input.nextLine(); //scans for user input and stores it in full_name variable
     
    length = full_name.length(); //discovers the length of the entire name and stores it in length variable
   
    
    index=full_name.lastIndexOf(" "); //finds the number of letters up until the " " space and stores it in index variable
    
    fname = full_name.substring(0,index); //creates the first name by extracting all of the letters up until the space
    lname = full_name.substring(index+1, length); //creates the last name by extracting from the space to the end of the length

    
    
  System.out.print("Please enter your major");
    major = input.nextLine();  //scans for major
    
  System.out.print(" ");//?
    
  System.out.print("Please enter the course # of your first class");              
    course_num = input.nextLine(); //scans for course number
    
  System.out.println("Please enter the number of credits for this class");
    credits = input.nextInt();  //scans for # of credits
    
    
  String chart = ("Quality Points\n| A 4.00 | A- 3.67 | \n| B+ 3.33 | B 3.00 | B- 2.67 |\n| C+ 2.33 | C 2.00 | C- 1.67 |\n| D+ 1.33 | D 1.00 | F 0.00 |");
  System.out.println(chart); //prints out the chart of quality points
    
  System.out.println("Please enter the number of Quality Points for this class using the chart of floating point numbers above");
    qp=input.next();  //scans for quality points
    
  float fqp = Float.parseFloat(qp); //converts string value to float value
    
 
   
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
     
   System.out.println("Please enter the course # of your first class");              
     input.nextLine();      //resolves scanner bug
     course_num2 = input.nextLine();                                                                     
    
   System.out.println("Please enter the number of credits for this class");
     credits2 = input.nextInt(); 

   System.out.println(chart);
    
   System.out.println("Please enter the number of Quality Points for this class using the chart of floating point numbers above");
     qp2=input.next();
    
   float fqp2 = Float.parseFloat(qp2);
   
   ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   
   System.out.println("Please enter the course # of your first class");
     input.nextLine();
     course_num3 = input.nextLine();
    
   System.out.println("Please enter the number of credits for this class");
     credits3 = input.nextInt(); 
   
   System.out.println(chart);
    
   System.out.println("Please enter the number of Quality Points for this class using the chart of floating point numbers above");
     qp3=input.next();
    
   float fqp3 = Float.parseFloat(qp3);
   
  
   //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   
   
   System.out.println("Please enter the course # of your first class");
     input.nextLine();
     course_num4 = input.nextLine();
    
   System.out.println("Please enter the number of credits for this class");
     credits4 = input.nextInt(); 

   System.out.println(chart);
    
   System.out.println("Please enter the number of Quality Points for this class using the chart of floating point numbers above");
     qp4=input.next();
    
   float fqp4 = Float.parseFloat(qp4);
    
   DecimalFormat fmt = new DecimalFormat("0.00");  //sets the decimal format
    
   float gpa = (fqp*credits+fqp2*credits2+fqp3*credits3+fqp4*credits4) / (credits +credits2 +credits3+ credits4); //calculation
     System.out.println(lname+"- "+fmt.format(gpa));  //prints last name and the formtted GPA
    
                                                                                              
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
}