package Basic;

import java.util.Scanner;

public class Basic {
    // #1
    static class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello");
            System.out.println("Misha Kubrin");
        }
    }

    // #2
    static class SumOfTwoNumbers {
        public static void main(String[] args) {
            int num1 = 74;
            int num2 = 36;
            int sum = num1 + num2;

            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        }
    }

    // #3
    static class DivisionExample {
        public static void main(String[] args) {
            int numerator = 50;
            int denominator = 3;
            int result = numerator / denominator;

            System.out.println("The result of " + numerator + " / " + denominator + " is: " + result);
        }
    }

    // #4
    static class OperationsExample {
        public static void main(String[] args) {
            int resultA = -5 + 8 * 6;
            int resultB = (55 + 9) % 9;
            int resultC = 20 + -3 * 5 / 8;
            int resultD = 5 + 15 / 3 * 2 - 8 % 3;

            System.out.println("Result of -5 + 8 * 6: " + resultA);
            System.out.println("Result of (55 + 9) % 9: " + resultB);
            System.out.println("Result of 20 + -3 * 5 / 8: " + resultC);
            System.out.println("Result of 5 + 15 / 3 * 2 - 8 % 3: " + resultD);
        }
    }

    // #5
    static class ProductOfTwoNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input first number: ");
            int firstNumber = scanner.nextInt();

            System.out.print("Input second number: ");
            int secondNumber = scanner.nextInt();

            int product = firstNumber * secondNumber;

            System.out.println(firstNumber + " x " + secondNumber + " = " + product);

            scanner.close();
        }
    }

    // #6
    static class ArithmeticOperations {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input first number: ");
            int firstNumber = scanner.nextInt();

            System.out.print("Input second number: ");
            int secondNumber = scanner.nextInt();

            int sum = firstNumber + secondNumber;
            int difference = firstNumber - secondNumber;
            int product = firstNumber * secondNumber;
            int division = firstNumber / secondNumber;
            int remainder = firstNumber % secondNumber;

            System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
            System.out.println(firstNumber + " - " + secondNumber + " = " + difference);
            System.out.println(firstNumber + " x " + secondNumber + " = " + product);
            System.out.println(firstNumber + " / " + secondNumber + " = " + division);
            System.out.println(firstNumber + " mod " + secondNumber + " = " + remainder);

            scanner.close();
        }
    }

    // #7
    static class MultiplicationTable {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input a number: ");
            int number = scanner.nextInt();

            System.out.println("Multiplication table for " + number + ":");

            for (int i = 1; i <= 10; i++) {
                int result = number * i;
                System.out.println(number + " x " + i + " = " + result);
            }

            scanner.close();
        }
    }

    // skip #8
    // #9
    static class ExpressionCalculation {
        public static void main(String[] args) {
            double result = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));

            System.out.println("Result of the expression: " + result);
        }
    }

    // #10
    static class FormulaCalculation {
        public static void main(String[] args) {
            double result = 4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));

            System.out.println("Result of the formula: " + result);
        }
    }

    // #11
    // не понял как сделать

    // #12
    static class AverageCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            double number1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double number2 = scanner.nextDouble();

            System.out.print("Enter the third number: ");
            double number3 = scanner.nextDouble();

            double average = (number1 + number2 + number3) / 3;

            System.out.println("The average of the three numbers is: " + average);

            scanner.close();
        }
    }

    //#13
    static class RectangleProperties {
        public static void main(String[] args) {
            double width = 5.5;
            double height = 8.5;

            double perimeter = 2 * (width + height);

            double area = width * height;

            System.out.println("Perimeter is = " + perimeter);
            System.out.println("Area is = " + area);
        }
    }

    // #14
    // ебучий флаг, разберусь как сделать

    // #15
    static class SwapVariables {
        public static void main(String[] args) {
            int num1 = 5;
            int num2 = 10;

            System.out.println("Before swapping:");
            System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);

            int temp = num1;
            num1 = num2;
            num2 = temp;

            System.out.println("After swapping:");
            System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);
        }
    }

    // #31
    static class WhetherJava {
        public static void main(String[] args) {
            System.out.println("Java Version is: " + System.getProperty("java.version"));
            System.out.println("Java Runtime Version is: " + System.getProperty("java.runtime.version"));
            System.out.println("Java Home is: " + System.getProperty("java.home"));
            System.out.println("Java Vendor is: " + System.getProperty("java.vendor"));
            System.out.println("Java Vendor URL is: " + System.getProperty("java.vendor.url"));
            System.out.println("Java Class Path is: " + System.getProperty("java.class.path"));
        }
    }

    // #32
    static class CompareNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input first number: ");
            int firstNumber = scanner.nextInt();

            System.out.print("Input second number: ");
            int secondNumber = scanner.nextInt();

//            if (firstNumber == secondNumber) {
//                System.out.println(firstNumber + "==" + secondNumber);
//            } else if (firstNumber < secondNumber) {
//                System.out.println(firstNumber + "<" + secondNumber);
//            } else if (firstNumber <= secondNumber) {
//                System.out.println(firstNumber + "<=" + secondNumber);
//            } else {
//                System.out.println(firstNumber + "!=" + secondNumber);
//            }

            if (firstNumber == secondNumber) {
                System.out.println(firstNumber + " == " + secondNumber);
            } else {
                System.out.println(firstNumber + " != " + secondNumber);
                if (firstNumber < secondNumber) {
                    System.out.println(firstNumber + " < " + secondNumber);
                }
                if (firstNumber <= secondNumber) {
                    System.out.println(firstNumber + " <= " + secondNumber);
                }
            }

            scanner.close();
        }
        // ещё через switch можно
    }

    // #33
    static class SumOfDigits {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
//            System.out.println("Input an integer: ");
//            int integer = scanner.nextInt();
//            int count = 0;
//            int originalInteger = integer;
//
//            while (integer != 0) {
//                int digit = integer % 10;
//                count += digit;
//                int result = integer / digit;
//            }
//
//            System.out.println("The sume of digits of " + originalInteger + "is: " + result);
//            scanner.close();

            System.out.print("Input an integer: ");
            int number = scanner.nextInt();

            int count = 0;
            int originalNumber = number;

            while (number != 0) {
                int digit = number % 10;
                count += digit;
                number /= 10;
            }

            System.out.println("The sum of the digits of " + originalNumber + " is: " + count);

            scanner.close();
        }

    }

    // #34


}

