package assignment.four.string;

import java.util.Scanner;

public class ProblemOne {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
       
        System.out.println("enter the string");
        String str =sc.next();
        str = str.toLowerCase();
         if(str.matches("[0-9]+"))
                System.out.println("It contains  digit only.");
            else if(str.matches("[a-z]+"))
                System.out.println("It contains  String only");
            else
                System.out.println("It contains String as well as digit");  
        }
}

