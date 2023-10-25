public class Main {

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        myCalculator.add(5,8);
        System.out.println(myCalculator.add(5,8));
        System.out.println("The difference is " + myCalculator.subtract(20,9));
        System.out.println("The product is " + myCalculator.multiply(20,1));
        System.out.println("The quotient is " + myCalculator.divide(4,3));
        System.out.println("The squaredResult is " + myCalculator.squared(4));
        System.out.println("The cubedResult is " + myCalculator.cubed(5));
        System.out.println("The result is " + myCalculator.power(2,3));

    }
}
