package se.lexicon;

import se.lexicon.model.CalculatorModel;
import java.util.Scanner;

public class Calculator{
    static void main(){

        Scanner scanner = new Scanner(System.in);
        CalculatorModel model = new CalculatorModel();
        boolean running = true;

        double num1 = 0;
        double num2;
        char operator;
        String answer;

        IO.println("\n===============Calculator===============");

        while (running){
            try{
                IO.print("Enter First Number : ");
                num1 = Double.parseDouble(scanner.nextLine());

                IO.print("Enter operator (+, -, *, /): ");
                operator = scanner.nextLine().charAt(0);

                IO.print("Enter Second Number : ");
                num2 = Double.parseDouble(scanner.nextLine());

                //Pass values to the model
                model.setNum1(num1);
                model.setNum2(num2);
                model.setOperator(operator);

                //Calculate
                double result = model.calculate();
                IO.print("Result : "+result+"\n");

                do{
                    IO.print("Do you want to continue? y/n : ");
                    answer = scanner.nextLine().trim();
                }while (!answer.equalsIgnoreCase("n") && !answer.equalsIgnoreCase("y"));

                if(answer.equalsIgnoreCase("n")){
                    running = false;
                }
            }catch (NumberFormatException e){
                IO.println("Error : Invalid number entered. Please try again.");
            }catch (ArithmeticException e){
                IO.println("Error : " + e.getMessage());
            }catch (IllegalStateException e) {
                IO.println("Error: Invalid operator. Select +, -, *, or /");
            }

        }
        IO.println("=========Calculator Closed.===========");
        scanner.close();
    }
}

