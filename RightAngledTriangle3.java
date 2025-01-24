// Program for Dynamic patterns
// pirnt sequence of numbers in the form of RightAngledTriangle
//Expected output is
// 1 
// 1 2 
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

import java.util.Scanner;
class RightAngledTriangle3{
  public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number of rows you want to print:");
    int a;
    int n=scan.nextInt();
    for(int i =1;i<=n;i++){
         a=1;
       for(int j=1;j<=i;j++){
           System.out.print(a);
           a=a+1;
       }
           System.out.println("");
  }
 }
}
