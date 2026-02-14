import java.util.Scanner;
public class calculator {
  public static void main(String[] args)throws InterruptedException{ 
    Scanner scanner = new Scanner(System.in);
    boolean validop= true;
    System.out.print("enter the first number: ");
    double num1 = scanner.nextDouble();
    System.out.print("enter an operator(+, -, *, /, ^ ): "); 
    char operator=scanner.next().charAt(0);
    System.out.print("enter the second number: ");
    double num2 =scanner.nextDouble();
    double result = 0;
    switch (operator) {
        case '+' -> result= num1+num2;
        case '-' -> result= num1-num2;
        case '*' -> result= num1*num2;
        case '/' -> {
                     if(num2==0){
                       System.out.println("cannot divide by 0");
                       validop= false;
                        }
                       else{
                          result= num1/num2;
                      }
                    }
        case '^' -> result= Math.pow(num1, num2);
        default ->{
        System.out.println("invalid operation!");
        validop= false;
         }
      }
      if(validop==true){
    System.out.println(result);
      }

      
    scanner.close();  
  }
}