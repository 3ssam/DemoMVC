package mo.essam.Operations;

public class Calculator {

    CalculatotService  calculatorService;

    public Calculator(CalculatotService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public int perform(int number1, int number2) {
        return calculatorService.add(number1, number2) * number1;
    }
}
