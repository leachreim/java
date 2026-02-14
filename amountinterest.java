import java.util.Scanner;
public class amountinterest {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
      double P; //principal
      double r; //interest rate 
      int n ; //times comp per yr 
      int t; //nb of yrs 
      double A; //amount 
      System.out.println("enter the principal amount of money (in $): ");
      P=scanner.nextDouble();
      System.out.println("enter the interest rate (in %): ");
      r=scanner.nextDouble()/100;
      System.out.println("enter the # of times compounded per year: ");
      n=scanner.nextInt(); 
      System.out.println("enter the # of years: ");
      t=scanner.nextInt(); 
      int nt=n*t;
      A=P*Math.pow((1+r/n),nt);
      System.out.printf("the amount after %d year/s is $%f",n,A);
      scanner.close(); 
    }
}