// Program for Dynamic patterns in right angled Triangle
//Output like 
//*
//* * 
//* * * 
//* * * *
//* * *
//* *
//*
import java.util.Scanner;
class RightAngledTriangle6{
  public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number of rows you want to print");
    int n=scan.nextInt();
    for(int i =1;i<=(n*2)-1;i++){
        int row=(n<i)?n*2-i : i;
       for(int j=1;j<=row;j++){
           System.out.print("*");
           
       }
           System.out.println("");
  }
 }
}
