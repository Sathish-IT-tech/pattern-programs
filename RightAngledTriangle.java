// Program for Dynamic patterns in right angled Triangle
import java.util.Scanner;
class RightAngledTriangle{
  public static void main(String[]args){
    System.out.println("Enter the number of rows you want to print Right angled Triangle :");
    Scanner scan =new Scanner(System.in);
    int n=scan.nextInt();
    for(int i =1;i<=n;i++){
       for(int j=1;j<=i;j++){
         System.out.print("*");
       }
      System.out.println("");
  }
}
}
