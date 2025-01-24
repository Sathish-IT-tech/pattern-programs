// Program for Static patterns
import java.util.Scanner;
class Static Pattern{
  public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the number of rows you want to print");
    int n=scan.nextInt();
    for(int i =1;i<=n;i++){
       for(int j=1;j<=n;j++){
         System.out.print("*");
       }
      System.out.println("");
  }
}
}
