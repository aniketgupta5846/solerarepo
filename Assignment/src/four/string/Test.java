package assignment.four.string;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int freq[]=new int[26];
         char string[] = str.toCharArray();  
         
            for(int i = 0; i <str.length(); i++) {  
                freq[i] = 1;  
                for(int j = i+1; j <str.length(); j++) {  
                    if(string[i] == string[j]) {  
                        freq[i]++;    
                        string[j] = '0';  
                    }  
                }  
            }
            System.out.println("Vowels and their corresponding frequencies");  
            for(int i = 0; i<freq.length; i++) {  
                if(string[i] != ' ' && string[i] != '0') {
                    char c=string[i];
                    if(c=='a'| c=='e'|c=='i'| c=='o'|c=='u')
                        System.out.println(string[i]+"---"+freq[i]);
                }
                        
            }  
            System.out.println("Consonants and their corresponding frequencies");
            for(int i = 0; i <freq.length; i++) {  
                if(string[i] != ' ' && string[i] != '0') {
                    char c=string[i];
                    if(c!='a'| c!='e'|c!='i'| c!='o'|c!='u')
                        System.out.println(string[i]+"---"+freq[i]);
                }
                        
            }
    }
}
