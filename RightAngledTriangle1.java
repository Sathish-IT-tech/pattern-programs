// Program for Static patterns 
// Like print sequence of incremented number in the form of Right Angled Trangle
import java.util.Scanner;
class RightAngledTriangle1{
  public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number of rows you want to print");
    int n=scan.nextInt();
    for(int i =1;i<=n;i++){
       for(int j=1;j<=i;j++){
         System.out.print(j);
       }
      System.out.println("");
  }
}
}
