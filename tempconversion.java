import java.util.Scanner;
public class tempconversion{
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     double temp;
     String unit;
    System.out.print("enter the temperature: ");
    temp=scanner.nextDouble();
    System.out.println("convert to celsius or fahrenheit? (C or F): ");
    unit=scanner.next().toUpperCase();
    double newtemp= (unit.equals("C")) ? (temp -32)*9/5 : (temp*9/5)+32;
    System.out.printf("the temperature in %s is %.2f" ,unit ,newtemp);
      scanner.close(); 
      }
    }
     
    



    
    