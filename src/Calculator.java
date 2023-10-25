public class Calculator {

    public Calculator() {

    }

    public double add(double a, double b) {
        double sum;
        sum = a + b;
        System.out.println("The sum is " + sum);
        return sum;
    }

    public double subtract(double a, double b){
        double difference;
        difference = a - b;
        return difference;
    }

    public double multiply(double a,double b){
        double product;
        product = a*b;
        return product;
    }

    //divide
    public double divide(double a, double b){
        double quotient;
        quotient=a/b;
        return quotient;
    }
    //squared
    public double squared(double a){
        double squaredResult;
        squaredResult=a*a;
        return squaredResult;
    }
    //cubed
    public double cubed (double a){
        double cubedResult;
        cubedResult = a*a*a;
        return cubedResult;
    }
    //exponent
    public double power (double a, double b){
        double result=a;
        for(double i=1; i<b; i++) {
            result = result * a;
        }
        return result;
        }
    }

