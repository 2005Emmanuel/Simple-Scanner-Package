package simple_scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleScanner {
   public Scanner GreetingScanner;
   public  String GreetingInstance;

   public Scanner CalculationScanner1;
   public int CalculationInstance1;
   public Scanner CalculationScanner2;
   public int CalculationInstance2;
   public Scanner OperatorScanner;
   public String OperatorInstance;
   public int result;

    public void greeting(){

        /*Greeting scanner*/
      GreetingScanner = new Scanner(System.in);
      GreetingInstance = GreetingScanner.nextLine();
     System.out.println("hello "+ GreetingInstance);
    }
    
    public void calculation(){
        try{
        CalculationScanner1 = new Scanner(System.in);
        CalculationInstance1 =   CalculationScanner1.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Invalid input you might have to re-run the Program " + e);
            }

        try{
        OperatorScanner = new Scanner(System.in);
        OperatorInstance = OperatorScanner.nextLine();
        }catch(InputMismatchException e){
            System.out.println("Invalid input you might have to re-run the Program  " + e);
            }

        try{
        CalculationScanner2 = new Scanner(System.in);
        CalculationInstance2 =   CalculationScanner1.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Invalid input you might have to re-run the Program  " + e);
            }

        switch(OperatorInstance){
            case "+":
             result = CalculationInstance1+CalculationInstance2;
             System.out.println(result);
             break;
            
             case "-":
             result = CalculationInstance1-CalculationInstance2;
             System.out.println(result);
             break;

            case "*":
             result = CalculationInstance1*CalculationInstance2;
             System.out.println(result);
             break;

            case "/":
             result = CalculationInstance1/CalculationInstance2;
             System.out.println(result);
             break;

            default:
            System.out.println("no matched case");
            break;

        }
    }

    
}

