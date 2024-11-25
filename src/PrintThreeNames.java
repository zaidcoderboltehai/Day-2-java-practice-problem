//import java.util.Scanner;
//
//public class PrintThreeNames {
//    public static void main(String[] args) {
//        // Step 1: Create a Scanner object to take user input
//        Scanner scanner = new Scanner(System.in);
//
//        // Step 2: Prompt the user to enter three names
//        System.out.print("Enter the first name: ");
//        String name1 = scanner.nextLine();
//
//        System.out.print("Enter the second name: ");
//        String name2 = scanner.nextLine();
//
//        System.out.print("Enter the third name: ");
//        String name3 = scanner.nextLine();
//
//        // Step 3: Print the names in reverse order in the message
//        System.out.println("Hi " + name3 + ", " + name2 + " and " + name1 + ".");
//    }
//}
//
//import java.util.Scanner;
//
//public class FavoritePlaces {
//    public static void main(String[] args) {
//        // Step 1: Create a Scanner object to take user input
//        Scanner scanner = new Scanner(System.in);
//
//        // Step 2: Create an array to store the names of 5 places
//        String[] places = new String[5];
//
//        // Step 3: Prompt the user to input 5 places
//        for (int i = 0; i < 5; i++) {
//            System.out.print("Enter place " + (i + 1) + ": ");
//            places[i] = scanner.nextLine(); // Taking input for each place
//        }
//
//        // Step 4: Print the names of the places with a comma and space in between
//        System.out.print("Favorite places: ");
//        for (int i = 0; i < 5; i++) {
//            System.out.print(places[i]);
//            if (i < 4) { // Check to add comma after each place except the last one
//                System.out.print(", ");
//            }
//        }
//    }
//}
//
//import java.util.Scanner;
//
//public class IntOpt {
//    public static void main(String[] args) {
//        // Step 1: Create a Scanner object to take user input
//        Scanner scanner = new Scanner(System.in);
//
//        // Step 2: Take inputs for a, b, and c
//        System.out.print("Enter value of a: ");
//        int a = scanner.nextInt();
//
//        System.out.print("Enter value of b: ");
//        int b = scanner.nextInt();
//
//        System.out.print("Enter value of c: ");
//        int c = scanner.nextInt();
//
//        // Step 3: Perform the integer operations and print the results
//        System.out.println("a + b * c = " + (a + b * c));      // Operation 1
//        System.out.println("a * b + c = " + (a * b + c));      // Operation 2
//        System.out.println("c + a // b = " + (c + a / b));     // Operation 3 (Note: '//' is not valid in Java; used '/' for integer division)
//        System.out.println("a % b + c = " + (a % b + c));      // Operation 4
//    }
//}
//
//import java.util.Scanner;
//
//public class TemperatureConversion {
//    public static void main(String[] args) {
//        // Step 1: Create a Scanner object to take user input
//        Scanner scanner = new Scanner(System.in);
//
//        // Step 2: Take input for Celsius temperature
//        System.out.print("Enter temperature in Celsius: ");
//        double celsius = scanner.nextDouble();
//
//        // Step 3: Convert Celsius to Fahrenheit
//        double fahrenheit = (celsius * 9/5) + 32;
//        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
//
//        // Step 4: Take input for Fahrenheit temperature
//        System.out.print("Enter temperature in Fahrenheit: ");
//        double fahrenheitInput = scanner.nextDouble();
//
//        // Step 5: Convert Fahrenheit to Celsius
//        double celsiusConverted = (fahrenheitInput - 32) * 5/9;
//        System.out.println("Temperature in Celsius: " + celsiusConverted);
//    }
//}
//
//import java.util.Scanner;
//
//public class CircleCalculations {
//    public static void main(String[] args) {
//        // Step 1: Create a Scanner object to take input
//        Scanner scanner = new Scanner(System.in);
//
//        // Step 2: Take radius input in inches
//        System.out.print("Enter radius of the circle in inches: ");
//        double radiusInches = scanner.nextDouble();
//
//        // Step 3: Convert radius from inches to centimeters (1 inch = 2.54 cm)
//        double radiusCm = radiusInches * 2.54;
//
//        // Step 4: Calculate the circumference in centimeters (C = 2 * Pi * R)
//        double circumference = 2 * Math.PI * radiusCm;
//
//        // Step 5: Calculate the area in square centimeters (A = Pi * R^2)
//        double area = Math.PI * Math.pow(radiusCm, 2);
//
//        // Step 6: Print the circumference and area
//        System.out.println("Circumference of the circle: " + circumference + " cm");
//        System.out.println("Area of the circle: " + area + " cm²");
//    }
//}
//
//import java.util.Scanner;
//
//public class SchoolResult {
//    public static void main(String[] args) {
//        // Step 1: Scanner ka object banate hain taaki user se input le sakein
//        Scanner scanner = new Scanner(System.in);
//
//        // Step 2: Variables declare karte hain
//        String[] studentNames = new String[3];  // 3 students ke naam store karne ke liye
//        int[][] marks = new int[3][3];  // 3 students ke liye 3 subjects ke marks store karne ke liye (Physics, Chemistry, Maths)
//        double[] percentages = new double[3];  // Har student ka percentage store karne ke liye
//
//        // Step 3: 3 students ka naam aur unke marks input lete hain
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Enter name of student " + (i + 1) + ": ");
//            studentNames[i] = scanner.nextLine();  // Student ka naam input karte hain
//
//            System.out.println("Enter marks for Physics, Chemistry, Mathematics (out of 50) for " + studentNames[i] + ":");
//            marks[i][0] = scanner.nextInt();  // Physics ke marks
//            marks[i][1] = scanner.nextInt();  // Chemistry ke marks
//            marks[i][2] = scanner.nextInt();  // Mathematics ke marks
//
//            // Step 4: Percentage calculate karte hain
//            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];  // Total marks calculate
//            percentages[i] = (totalMarks / 150) * 100;  // Total marks out of 150 (50 per subject)
//            scanner.nextLine();  // To consume the newline character after nextInt()
//        }
//
//        // Step 5: Ek student ka result print karte hain
//        System.out.println("\nSchool: New School Of Learning");
//        System.out.println("Class: XI");
//        System.out.println("Student: " + studentNames[0]);  // Example mein pehla student dikhayenge
//        System.out.println("------------------------------------------------------------");
//        System.out.println("Subject    | Marks Obtained | Percentage");
//        System.out.println("------------------------------------------------------------");
//        System.out.println("Physics    | " + marks[0][0] + "              | " + (marks[0][0] * 100.0 / 50) + "%");
//        System.out.println("Chemistry  | " + marks[0][1] + "              | " + (marks[0][1] * 100.0 / 50) + "%");
//        System.out.println("Mathematics| " + marks[0][2] + "              | " + (marks[0][2] * 100.0 / 50) + "%");
//        System.out.println("------------------------------------------------------------");
//        System.out.println("Total Marks: " + (marks[0][0] + marks[0][1] + marks[0][2]));
//        System.out.println("Total Percentage: " + percentages[0] + "%");
//
//        // Step 6: Class ka summary calculate karte hain
//        double[] subjectAvg = new double[3];  // Har subject ka average marks store karenge
//        double classAvg = 0;  // Class ka overall average calculate karenge
//        for (int i = 0; i < 3; i++) {
//            subjectAvg[0] += marks[i][0];  // Physics ka total marks
//            subjectAvg[1] += marks[i][1];  // Chemistry ka total marks
//            subjectAvg[2] += marks[i][2];  // Mathematics ka total marks
//            classAvg += percentages[i];  // Class ka overall average
//        }
//
//        // Har subject ka average calculate karte hain
//        subjectAvg[0] = subjectAvg[0] / 3.0;
//        subjectAvg[1] = subjectAvg[1] / 3.0;
//        subjectAvg[2] = subjectAvg[2] / 3.0;
//
//        // Class ka overall average calculate karte hain
//        classAvg = classAvg / 3.0;
//
//        // Step 7: Class summary print karte hain
//        System.out.println("\nClass Summary:");
//        System.out.println("Average Marks in Physics: " + subjectAvg[0]);
//        System.out.println("Average Marks in Chemistry: " + subjectAvg[1]);
//        System.out.println("Average Marks in Mathematics: " + subjectAvg[2]);
//        System.out.println("Overall Class Average Percentage: " + classAvg + "%");
//    }
//}
//
//import java.util.Scanner;
//
//public class AdditionSubtraction {
//    public static void main(String[] args) {
//        // Scanner object to take input
//        Scanner scanner = new Scanner(System.in);
//
//        // Taking input for two numbers
//        System.out.print("Enter first number: ");
//        int num1 = scanner.nextInt();
//
//        System.out.print("Enter second number: ");
//        int num2 = scanner.nextInt();
//
//        // Calculating sum and difference
//        int sum = num1 + num2;
//        int difference = num1 - num2;
//
//        // Printing the results
//        System.out.println("Sum: " + sum);
//        System.out.println("Difference: " + difference);
//    }
//}
//
//import java.util.Scanner;
//
//public class MultiplicationTable {
//    public static void main(String[] args) {
//        // Scanner object to take input from user
//        Scanner scanner = new Scanner(System.in);
//
//        // Taking user input for number
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//
//        // Printing the multiplication table for the given number
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(number + " * " + i + " = " + (number * i));
//        }
//    }
//}
//
//import java.util.Scanner;
//
//public class AverageCalculation {
//    public static void main(String[] args) {
//        // Scanner object to take input from the user
//        Scanner scanner = new Scanner(System.in);
//
//        // Taking 5 integers as input
//        System.out.print("Enter number 1: ");
//        int num1 = scanner.nextInt();
//
//        System.out.print("Enter number 2: ");
//        int num2 = scanner.nextInt();
//
//        System.out.print("Enter number 3: ");
//        int num3 = scanner.nextInt();
//
//        System.out.print("Enter number 4: ");
//        int num4 = scanner.nextInt();
//
//        System.out.print("Enter number 5: ");
//        int num5 = scanner.nextInt();
//
//        // Calculating the sum of all numbers
//        int sum = num1 + num2 + num3 + num4 + num5;
//
//        // Calculating the average
//        double average = sum / 5.0;
//
//        // Printing the average
//        System.out.println("The average is: " + average);
//    }
//}
//
//import java.util.Scanner;
//
//public class CircleMeasurements {
//    public static void main(String[] args) {
//        // Scanner object to take input from the user
//        Scanner scanner = new Scanner(System.in);
//
//        // Taking radius as input from the user
//        System.out.print("Enter the radius of the circle: ");
//        double radius = scanner.nextDouble();
//
//        // Calculating the area of the circle
//        double area = Math.PI * radius * radius;
//
//        // Calculating the circumference of the circle
//        double circumference = 2 * Math.PI * radius;
//
//        // Printing the results
//        System.out.println("The area of the circle is: " + area);
//        System.out.println("The circumference of the circle is: " + circumference);
//    }
//}
//
//import java.util.Scanner;
//
//public class MaxOfThreeNumbers {
//    public static void main(String[] args) {
//        // Scanner object to take input from the user
//        Scanner scanner = new Scanner(System.in);
//
//        // Taking 3 numbers as input from the user
//        System.out.print("Enter the first number: ");
//        int num1 = scanner.nextInt();
//
//        System.out.print("Enter the second number: ");
//        int num2 = scanner.nextInt();
//
//        System.out.print("Enter the third number: ");
//        int num3 = scanner.nextInt();
//
//        // Find the maximum number
//        int max;
//        if (num1 >= num2 && num1 >= num3) {
//            max = num1;  // num1 is the largest
//        } else if (num2 >= num1 && num2 >= num3) {
//            max = num2;  // num2 is the largest
//        } else {
//            max = num3;  // num3 is the largest
//        }
//
//        // Print the maximum number
//        System.out.println("The maximum number is: " + max);
//    }
//}
//
//import java.util.Scanner;
//
//public class EqualityCheck {
//    public static void main(String[] args) {
//        // Scanner object to take input from the user
//        Scanner scanner = new Scanner(System.in);
//
//        // Taking two strings as input from the user
//        System.out.print("Enter the first string: ");
//        String str1 = scanner.nextLine();
//
//        System.out.print("Enter the second string: ");
//        String str2 = scanner.nextLine();
//
//        // Checking if both strings are equal
//        if (str1.equals(str2)) {
//            System.out.println("The strings are equal.");
//        } else {
//            System.out.println("The strings are not equal.");
//        }
//    }
//}
//
//import java.util.Scanner;
//
//public class LeapYearCheck {
//    public static void main(String[] args) {
//        // Scanner object to take input from the user
//        Scanner scanner = new Scanner(System.in);
//
//        // Taking the year as input from the user
//        System.out.print("Enter the year: ");
//        int year = scanner.nextInt();
//
//        // Check if the year is a leap year using logical operators
//        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//            System.out.println(year + " is a leap year.");
//        } else {
//            System.out.println(year + " is not a leap year.");
//        }
//    }
//}
//
//import java.util.Scanner;
//
//public class DivisibilityCheck {
//    public static void main(String[] args) {
//        // Scanner object to take input from the user
//        Scanner scanner = new Scanner(System.in);
//
//        // Taking the number as input from the user
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//
//        // Check if the number is divisible by both 5 and 7
//        if (number % 5 == 0 && number % 7 == 0) {
//            System.out.println(number + " is divisible by both 5 and 7.");
//        } else {
//            System.out.println(number + " is not divisible by both 5 and 7.");
//        }
//    }
//}
//
//import java.util.Scanner;
//
//public class CompoundAssignment {
//    public static void main(String[] args) {
//        // Scanner object to take input from the user
//        Scanner scanner = new Scanner(System.in);
//
//        // Taking the integer input from the user
//        System.out.print("Enter an integer: ");
//        int x = scanner.nextInt();
//
//        // += operation
//        x += 5; // x = x + 5
//        System.out.println("After += operation, x = " + x);
//
//        // -= operation
//        x -= 3; // x = x - 3
//        System.out.println("After -= operation, x = " + x);
//
//        // *= operation
//        x *= 4; // x = x * 4
//        System.out.println("After *= operation, x = " + x);
//
//        // /= operation
//        x /= 2; // x = x / 2
//        System.out.println("After /= operation, x = " + x);
//
//        // %= operation
//        x %= 3; // x = x % 3
//        System.out.println("After %= operation, x = " + x);
//    }
//}
//
//import java.util.Scanner;
//
//public class IncrementDemo {
//    public static void main(String[] args) {
//        // Scanner object to take input from the user
//        Scanner scanner = new Scanner(System.in);
//
//        // Taking the integer input from the user
//        System.out.print("Enter an integer: ");
//        int x = scanner.nextInt();
//
//        // Post-Increment demonstration
//        System.out.println("\nPost-Increment: ");
//        System.out.println("Initial value of x: " + x); // x ki initial value print karenge
//        System.out.println("Value after post-increment: " + x++); // Pehle x ko print karo, phir increment ho
//        System.out.println("Updated value of x: " + x); // x ki updated value print karo
//
//        // Pre-Increment demonstration
//        System.out.println("\nPre-Increment: ");
//        System.out.println("Initial value of x: " + x); // x ki current value print karenge
//        System.out.println("Value after pre-increment: " + ++x); // Pehle increment ho, phir new value print ho
//    }
//}
//
//public class ToggleBoolean {
//    public static void main(String[] args) {
//        // Step 1: Boolean variable declare karna aur initial value set karna
//        boolean isOn = true;  // isOn ki initial value true hai
//
//        // Step 2: NOT operator se toggle karna
//        isOn = !isOn;  // isOn ko toggle kar rahe hain (true se false ho jayega)
//
//        // Step 3: Toggle hone ke baad new value print karna
//        System.out.println("The toggled value of isOn is: " + isOn);  // Output: false
//
//        // Agar dobara toggle karna ho, toh:
//        isOn = !isOn;  // Ab isOn ki value false se true ho jayegi
//
//        // Step 4: Dobara print karenge
//        System.out.println("The toggled value of isOn is: " + isOn);  // Output: true
//    }
//}

//import java.util.Scanner;
//
//public class BitwiseOperatorsDemo {
//    public static void main(String[] args) {
//        // Step 1: User se input lena
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter first integer: ");
//        int num1 = sc.nextInt();  // First number input
//        System.out.print("Enter second integer: ");
//        int num2 = sc.nextInt();  // Second number input
//
//        // Step 2: Bitwise operations perform karna
//        int andResult = num1 & num2;   // Bitwise AND
//        int orResult = num1 | num2;    // Bitwise OR
//        int xorResult = num1 ^ num2;   // Bitwise XOR
//
//        // Step 3: Results print karna
//        System.out.println("Bitwise AND result: " + andResult);
//        System.out.println("Bitwise OR result: " + orResult);
//        System.out.println("Bitwise XOR result: " + xorResult);
//    }
//}
//
//import java.util.Scanner;
//
//public class BitwiseShiftOperations {
//    public static void main(String[] args) {
//        // Step 1: User se input lena
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int num = sc.nextInt();  // Input integer
//
//        // Step 2: Left shift (Multiplying by 2)
//        int leftShiftResult = num << 1;  // num * 2
//
//        // Step 3: Right shift (Dividing by 2)
//        int rightShiftResult = num >> 1;  // num / 2
//
//        // Step 4: Results print karna
//        System.out.println("Original number: " + num);
//        System.out.println("After left shift (multiplied by 2): " + leftShiftResult);
//        System.out.println("After right shift (divided by 2): " + rightShiftResult);
//    }
//}
//
//import java.util.Scanner;
//
//public class OddOrEven {
//    public static void main(String[] args) {
//        // Step 1: User se input lena
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = sc.nextInt();  // User se integer input lena
//
//        // Step 2: Bitwise AND operation se odd ya even check karna
//        if ((num & 1) == 0) {
//            // Agar (num & 1) ka result 0 hai toh number even hai
//            System.out.println(num + " is an even number.");
//        } else {
//            // Agar (num & 1) ka result 1 hai toh number odd hai
//            System.out.println(num + " is an odd number.");
//        }
//    }
//}
//
//import java.util.Scanner;
//
//public class MinOfTwoNumbers {
//    public static void main(String[] args) {
//        // Step 1: User se do numbers input karna
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the first number: ");
//        int num1 = sc.nextInt();  // Pehla number input lena
//
//        System.out.print("Enter the second number: ");
//        int num2 = sc.nextInt();  // Dusra number input lena
//
//        // Step 2: Ternary operator se minimum find karna
//        int min = (num1 < num2) ? num1 : num2;  // Agar num1 < num2 toh min = num1, warna min = num2
//
//        // Step 3: Minimum number print karna
//        System.out.println("The minimum number is: " + min);
//    }
//}
//
//import java.util.Scanner;
//
//public class PassOrFail {
//    public static void main(String[] args) {
//        // Step 1: User se marks input karna
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your marks: ");
//        int marks = sc.nextInt();  // Student ke marks input lena
//
//        // Step 2: Ternary operator ka use karke pass ya fail check karna
//        String result = (marks >= 50) ? "Pass" : "Fail";  // Agar marks >= 50 hain toh Pass, warna Fail
//
//        // Step 3: Result print karna
//        System.out.println("You have " + result + "ed.");
//    }
//}
