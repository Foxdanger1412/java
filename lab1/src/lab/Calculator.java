package lab;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

interface ICalculator {
	int add(int x, int y);
	float divide(int x, int y) throws RuntimeException;
}


public class Calculator implements ICalculator{
      public int add(int x, int y){
       return x + y;
   }
      public float divide(int x, int y) throws RuntimeException{
           return (float) x/y; 
       }
   
   public static void main(String[] args){
       int num_1, num_2;
       char operator;
       
       Scanner sc = new Scanner(System.in);
       num_1 = sc.nextInt();
       operator = sc.next().charAt(0);
       num_2 = sc.nextInt();
       

       if(operator == '+'){
           Calculator addition = new Calculator();
           System.out.println(addition.add(num_1,num_2));
       }else if(operator == '/'){
           if(num_2!=0) {
    	 
                Calculator division = new Calculator();
                System.out.println(division.divide(num_1,num_2));
         
           }else {
        	   System.out.println("Error");
           }
           }
       else{
           System.out.println("Error");
       }
      

 }
}
