/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Waqas Ahmed
 */
public class ExceptionHandling {

  public static void main(String args[]) {
      try{  
	 int num=121/0;  
	 System.out.println(num);  
      }  
      catch(ArithmeticException e){
         System.out.println("Number should not be divided by zero");
      }  
      /* Finally block will always execute
       * even if there is no exception in try block
       */
      finally{
	 System.out.println("This is finally block");
      }  
      System.out.println("Out of try-catch-finally");  
   }   
}