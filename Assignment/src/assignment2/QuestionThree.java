package assignment2;
import java.util.*;
public class QuestionThree {
   public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("Value of row");
        int m=sc.nextInt();
        System.out.println("Value of column");
        int n=sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println(" int array element:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]%2==1)
                    System.out.println(arr[i][j]);
            }
        }
    }
}

