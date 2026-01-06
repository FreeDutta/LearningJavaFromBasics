package ClassTasks;

import javax.xml.transform.Source;
import java.util.Scanner;

//Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F)
//based on the following grading scale:
//
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59
public class task_29_Dec {
    static void main() {
        //int a = 99;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the marks");
        int a=scanner.nextInt();
        if(a>= 90 && a<= 100){
            System.out.println("A");
        }else if(a>= 80 && a<= 89){
            System.out.println("B");
        }else if(a>= 70 && a<= 79){
            System.out.println("C");
        }else if(a>= 60 && a<= 69){
            System.out.println("D");
        }else if(a>= 0 && a<= 59){
            System.out.println("F");
        }
    }
}
