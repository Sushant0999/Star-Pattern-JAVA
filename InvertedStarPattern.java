/*

1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

*/

package com.company;

import java.util.Scanner;

public class pattern {
   public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       int n;
       n = s.nextInt();
       //Outer Loop for number of Rows
       for(int i=n ;i>= 1;i--)
       {
           // printing '*' in each column.
           for(int j=1;j<=i;j++)
           {
               System.out.print(j+" ");
           }
           System.out.println();
       }
    }
}
