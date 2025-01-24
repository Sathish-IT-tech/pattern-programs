// Program for Dynamic patterns in right angled Triangle
// output
// * * * *
//   * * *
//     * *
//       *
import java.util.Scanner;
class RightAnguledTriangle7{
  public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number of rows you want to print");
    int n=scan.nextInt();
    for(int i =1;i<=n;i++){
        for(int k=1;k<=i-1;k++){
            System.out.print(" ");
        }
       for(int j=1;j<=n-(i-1);j++){
           System.out.print("*");
           
       }
           System.out.println("");
  }
 }
}
