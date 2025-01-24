// Program for Static patterns1 
// This like print sequence of numbers in the form of Static pattern way
import java.util.Scanner;
class StaticPattern1{
  public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number of rows you want to print");
    int n=scan.nextInt();
    for(int i =1;i<=n;i++){
       for(int j=1;j<=n;j++){
         System.out.print(i);
       }
      System.out.println("");
  }
}
}
