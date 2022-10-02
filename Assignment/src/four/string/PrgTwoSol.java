package assignment.four.string;

import java.util.Scanner;

public class PrgTwoSol {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next().toLowerCase();
        int freq[]=new int[26];  
         
            for(int i = 0; i <str.length(); i++) {    
                freq[str.charAt(i)-'a']++;
            }
            System.out.println("Counting of vowels......");
            for(int i=0;i<freq.length;i++) {
                
                if(freq[i]!=0) {
                    char c=(char)(i+'a');
                    if( c=='a'|c=='e'|c=='i'|c=='o'|c=='u')
                        System.out.println(c+"  "+freq[i]);
                    
                }
            }
            System.out.println("Counting of consonant......");
            for(int i=0;i<freq.length;i++) {
                
                if(freq[i]!=0) {
                    char c=(char)(i+'a');
                    if( c!='a'& c!='e'& c!='i'& c!='o'& c!='u')
                        System.out.println(c+"  "+freq[i]);               
                }
            }     
    }
}
