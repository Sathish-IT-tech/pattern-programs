// Program for Dynamic patterns in right angled Triangle
//output
//     *
//    * *
//  * * *
//* * * *

import java.util.Scanner;
class RightAngledTriangle7{
  public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number of rows you want to print");
    int n=scan.nextInt();
    for(int i =1;i<=n;i++){
        for(int k=1;k<=n-i;k++){
            System.out.print(" ");
        }
       for(int j=1;j<=i;j++){
           System.out.print("*");
           
       }
           System.out.println("");
  }
 }
}
