import util.Operator;

public class Calculator {
    public double calRes =0;
    private static final String regExp = "^[0-9]+";
    public Double getcalRes() {
        return this.calRes;
    }
    public Calculator() {
    }
    public Calculator(String input) {
        String[] inputArray = input.split(" ");
        double calRes=calculate(inputArray);
    }
    private double calculate(String[] inputArray) {
        double tempResult= Double.parseDouble(inputArray[0]);
        Operator operator=new Operator();
        for (int i = 1; i < inputArray.length; i++) {
            if (!inputArray[i].matches(regExp)) {
                tempResult = Operator.operateArithmetic(tempResult,inputArray[i],Integer.parseInt(inputArray[i + 1]));
            }
        }
        Double result=tempResult;
        return result;
    }/*
    public double operateArithmetic(double res, String operator, double temp){
        switch (operator) {
            case "+":
                return plus(res,temp);
            case "-":
                return minus(res,temp);
            case "*":
                return multiply(res,temp);
            case "/":
                return divide(res,temp);
            default:
                throw new IllegalArgumentException("");
        }
    }


    double plus(double res, double temp){
        return res+temp;
    }
    double minus(double res, double temp){
        return res+temp;
    }
    double multiply(double res, double temp){
        return res+temp;
    }
    double divide(double res, double temp){
        return res+temp;
    }*/
}
