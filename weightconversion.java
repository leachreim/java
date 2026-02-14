import java.util.Scanner;
public class weightconversion {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
System.out.println("weight conversion program");
 System.out.println("1: convert lbs to kgs");
        System.out.println("2: convert kgs to lbs");
 
 System.out.print("choose an option: ");
    int x=scanner.nextInt();
     switch(x){
     case 1 ->{
        System.out.print("enter the weight in lbs: ");
        double  weight=scanner.nextDouble();
        double newweight= weight*0.454;
        System.out.printf(" the weight in kgs is: %.2f ",newweight);
     }
       case 2->{
        System.out.print("enter the weight in kgs: ");
        double  weight=scanner.nextDouble();
        double newweight= weight/0.454;
        System.out.printf(" the weight in lbs is: %.2f ",newweight);
       }
        default->System.out.println("you did not pick of one of the choices above");
     
    }
      scanner.close(); 

      }
    }