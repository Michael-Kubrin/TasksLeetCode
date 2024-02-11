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
//            double result = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
            double result = ((25.5 * 3.5 - Math.pow(3.5, 2)) / (40.5 - 4.5));

            System.out.println("Result of the expression: " + result);
        }
    }

    // #10
    static class FormulaCalculation {
        public static void main(String[] args) {
            double result = 4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));

            double resultTwo = 1.0 / 3;
            double resultThree = 1 / 3;

            System.out.println("Result of the formula: " + resultThree);
        }
    }

    // #11
    static class Circle {
        public static void main(String[] args) {
            double radius = 7.5;

            double perimeter = 2 * Math.PI * radius;
            double area = 3.14 * Math.PI * radius;

            System.out.println("Perimeter is = " + perimeter);
            System.out.println("Area is = " + area);
        }
    }

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
    static class AmericanFlag {
        public static void main(String[] args) {
            int rows = 9;
            int columns = 30;

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= columns; j++) {
                    if (i % 2 == 0) {
                        System.out.print(" ");
                        System.out.print("*");
                    } else {
                        System.out.print("*");
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print("=");
                }
                System.out.println();
            }
        }
    }

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

    // #16 skip

    // №17

    static class AddBinaryNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input the first binary: ");
            String binary1 = scanner.nextLine();

            System.out.print("Input the second binary: ");
            String binary2 = scanner.nextLine();

            int first = Integer.parseInt(binary1, 2);
            int second = Integer.parseInt(binary2, 2);

            int sum = first + second;

            String binary = Integer.toBinaryString(sum);

            System.out.println("Sum of two binary numbers: " + binary);

            scanner.close();
        }
    }

    // #18
    static class MultiplyBinaryNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input the first binary: ");
            String binary1 = scanner.nextLine();

            System.out.print("Input the second binary: ");
            String binary2 = scanner.nextLine();

            int decimal1 = Integer.parseInt(binary1, 2);
            int decimal2 = Integer.parseInt(binary2, 2);

            int sum = decimal1 * decimal2;

            String binaryProduct = Integer.toBinaryString(sum);

            System.out.println("Sum of two binary numbers: " + binaryProduct);

            scanner.close();
        }
    }

    // #19
    static class ConvertToBinary {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input a Decimal Number: ");
            int decimal = scanner.nextInt();

            String binary = Integer.toBinaryString(decimal);

            System.out.println("Binary Number: " + binary);
        }
    }

    // #20
    static class ConvertToHex {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input the number: ");
            int bumber = scanner.nextInt();

            String hex = Integer.toHexString(bumber);

            System.out.println("Hex: " + hex.toUpperCase());
        }
    }

    // #21
    static class DecimalToOctal {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input number: ");
            int number = scanner.nextInt();

            String octalNumber = Integer.toOctalString(number);

            System.out.println("Octal number is: " + octalNumber);
        }
    }

    // #22
    static class BinaryToDecimal {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input a binary number: ");
            String binaryNumberString = scanner.next();

            int decimalNumber = 0;
            int power = 0;

            // Проходимся по строке, начиная с конца
            for (int i = binaryNumberString.length() - 1; i >= 0; i--) {
                // Получаем текущий символ (цифру)
                char digitChar = binaryNumberString.charAt(i);
                // Преобразуем символ в цифру
                int digit = Character.getNumericValue(digitChar);
                // Увеличиваем десятичное число, учитывая текущую цифру и степень двойки
                decimalNumber += digit * Math.pow(2, power);
                // Увеличиваем степень двойки для следующего разряда
                power++;
            }

            System.out.println("Decimal Number: " + decimalNumber);
        }
    }

    // #23
    static class BinaryToHexadecimal {
        public static void main(String[] args) {
            // Объявление массива для хранения шестнадцатеричных цифр, переменных для вычислений и двоичного ввода
            int[] hex = new int[1000];
            int i = 1, j = 0, rem, dec = 0, bin;

            // Создание объекта Scanner для чтения ввода от пользователя
            Scanner in = new Scanner(System.in);

            // Подсказка пользователю ввести двоичное число
            System.out.print("Input a binary number: ");
            bin = in.nextInt();

            // Преобразование двоичного числа в десятичное
            while (bin > 0) {
                rem = bin % 2;
                dec = dec + rem * i;
                i = i * 2;
                bin = bin / 10;
            }
            i = 0;

            // Преобразование десятичного числа в шестнадцатеричное
            while (dec != 0) {
                hex[i] = dec % 16;
                dec = dec / 16;
                i++;
            }

            // Отображение шестнадцатеричного значения
            System.out.print("Шестнадцатеричное значение: ");
            for (j = i - 1; j >= 0; j--) {
                if (hex[j] > 9) {
                    System.out.print((char) (hex[j] + 55));
                } else {
                    System.out.print(hex[j]);
                }
            }
            System.out.print("\n");
        }
    }


    // #24
    public class BinaryToOctal {
        public static void main(String[] args) {
            // Объявление переменных для хранения двоичного и десятичного чисел, остатка, частного,
            // и массива для восьмеричных цифр
            int binnum, binnum1, rem, decnum = 0, quot, i = 1, j;
            int octnum[] = new int[100];

            // Создание объекта Scanner для чтения ввода от пользователя
            Scanner scan = new Scanner(System.in);

            // Подсказка пользователю ввести двоичное число
            System.out.print("Input a binary number: ");
            binnum = scan.nextInt();
            binnum1 = binnum;

            // Преобразование двоичного числа в десятичное
            while (binnum > 0) {
                rem = binnum % 10;
                decnum = decnum + rem * i;
                i = i * 2;
                binnum = binnum / 10;
            }

            i = 1;
            quot = decnum;

            // Преобразование десятичного числа в восьмеричное
            while (quot > 0) {
                octnum[i++] = quot % 8;
                quot = quot / 8;
            }

            // Отображение восьмеричного значения исходного двоичного числа
            System.out.print("Восьмеричное значение " + binnum1 + " :");
            for (j = i - 1; j > 0; j--) {
                System.out.print(octnum[j]);
            }
            System.out.print("\n");
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

