package ClassTasks;

import java.sql.SQLOutput;
import java.util.Scanner;

//Write a program that classifies a triangle based on its side lengths.
//Given three input values representing the lengths of the sides,
//determine if the triangle is equilateral (all sides are equal),
//isosceles (exactly two sides are equal), or scalene (no sides are equal).
//Use an if-else statement to classify the triangle.
public class task_27_Dec {
    static void main() {
//        int a=12,b=12, c=12;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first side ");
        int a = scanner.nextInt();
        System.out.println("Enter second side ");
        int b = scanner.nextInt();
        System.out.println("Enter third side ");
        int c = scanner.nextInt();
        if (a==b && b==c && c==a){
            System.out.println("The triangle is equilateral");
        } else if (a==b || b==c || c==a) {
            System.out.println("The triangle is isosceles");
        } else if (a!=b && b!=c && c!=a){
            System.out.println("The triangle is scalene");
        }scanner.close();
    }
}
