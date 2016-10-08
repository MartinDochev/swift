
public class Calculator {

    String command;
    double firstOperand;
    double secoundOperand;

    Calculator(String command, double firstOperand, double secoundOperand) {
        this.command = command;
        this.firstOperand = firstOperand;
        this.secoundOperand = secoundOperand;
    }

    double suming(double firstOperand, double secoundOperand) {

        double sum = firstOperand + secoundOperand;

        return sum;
    }

    double subtracting(double firstOperand, double secoundOperand) {

        double sub = secoundOperand - firstOperand;

        return sub;
    }

    double multiplying(double firstOperand, double secoundOperand) {

        double mul = firstOperand * secoundOperand;

        return mul;
    }

    double divade(double firstOperand, double secoundOperand) {

       

        double div = firstOperand / secoundOperand;

        return div;
    }

    double percentage(double firstOperand, double secoundOperand) {

        double perc = (firstOperand * secoundOperand) / 100;

        return perc;
    }

    double switchCase() {
        double rezult = 0;
        
        switch (command) {

            case "SUM":
                rezult = suming(firstOperand, secoundOperand);
                break;
            case "SUB":
                rezult = subtracting(firstOperand, secoundOperand);
                break;
            case "MUL":
                rezult = multiplying(firstOperand, secoundOperand);
                break;
            case "DIV":
                rezult = divade(firstOperand, secoundOperand);
                break;
            case "PER":
                rezult = percentage(firstOperand, secoundOperand);
                break;
            case "END":
                break;
            default:
                System.out.println("Wrong command");
                break;

        }
        return rezult;
    }
}
