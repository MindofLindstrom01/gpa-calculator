/*/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
                                                                                                                                 //
  Created By- Austin Lindstrom               Date Created- 10/15/2019                          //
                                                                                                                                 //
                                                                                                                                 //
                           Program - UNGStudent                                                                 //
                                                                                                                                 //
           *Created to support the main Part2.java class by defining methods created //
             by the programmer and also provides formal parameters that set the        //
             outline of the methods. Also establishes calculations for grade averages   //
                                                                                                                                //
*/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





public class UNGStudent {
  
  
  private String fname, lname;                               //instance variables
  private double hw1, hw2, q1, q2, q3, e1, e2;       //private visibility
  
  //constructor method, defines formal parameters
  public UNGStudent (String firstname, String lastname, double homework1, double homework2, double quiz1, double quiz2, double quiz3, double exam1, double exam2)
  {
    fname=firstname;
    lname=lastname;
    hw1=homework1;
    hw2=homework2;
    q1=quiz1;                         //sets class variables equal to instance variables
    q2=quiz2;
    q3=quiz3;
    e1=exam1;
    e2=exam2;
  }
    
                   //this method returns the full name
 public String getFullName() 
 {
     
     return fname + " " + lname; //concatinates the first and the last name
     
  }
  
                    //method for setting all 7 grades
 public void setGrades(double homework1, double homework2, double quiz1, double quiz2, double quiz3, double exam1, double exam2)

 {
  
    hw1=homework1;
    hw2=homework2;
    q1=quiz1;
    q2=quiz2;                //sets class variables equal to initial variables///////////
    q3=quiz3;
    e1=exam1;
    e2=exam2;
   
 }
  
        //method to calculate weighted homework average
  public double calcHW()
  {
    
    double hwanswer = (hw1+hw2)/2;
    return hwanswer*.25;                      //multiplys the average of the two homeworks and multiplys it by a weight of .25
    
  }
  
        //calcuates the quiz average
  public double calcQuiz()
  {
    
    double quizanswer = (q1+q2+q3)/3;    //multiplys the average of the three quizzes and multiplys it by a weight of .32
    return quizanswer*.32;
    
  }
  
         //calculates the exam average
  public double calcExam()
  {
    
    double examanswer = (e1+e2)/2;    //multiplys the average of the two exams and multiplys it by a weight of .43
    return examanswer*.43;
    
  }
  
            //a method that is called whenever the object is refrenced in the driving program
  public String toString()
  {
    //a basic return statement for the output window
    return "Homework 1: "+hw1+"\n" + "Homework 2: " + hw2+"\n" + "Quiz 1: " + q1+"\n" + "Quiz 2: "+q2+"\n"+"Quiz 3: " +q3+"\n" +"Exam 1: " +e1 + "\n" + "Exam 2: " + e2;
    
  }

  
  
  
  
  
  
  
  
  
  
}