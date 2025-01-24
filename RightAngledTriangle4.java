// Program for Dynamic patterns
// print "*" in the form of inverted Right Angled Triangle
// Expected output is
// * * * * *
// * * * *
// * * * 
// * * 
// * 
import java.util.Scanner;
class RightAngledTriangle{
  public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number of rows you want to print");
    int n=scan.nextInt();
    int temp;
    temp=n;
    for(int i =1;i<=n;i++){
       for(int j=temp;j>=1;j--){
           System.out.print("*");
       }
        temp--;
           System.out.println("");
  }
 }
}
