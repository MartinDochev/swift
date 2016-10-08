
import java.util.Scanner;


public class CalculatorClient {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
		
		Calculator input = new Calculator("",0,0);
		String calc;
		
	do{
		calc = scan.next();
		if (calc.equals("END")){
			break;
		}else{
			input.command = calc;
			input.firstOperand = scan.nextDouble();
			input.secoundOperand = scan.nextDouble();
			
			System.out.printf("%.3f \n",input.switchCase());
			
		}
		
		
		
	}while ( ! calc.equals("END"));
    }
    
}
