/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg5;

/**
 *
 * @author agutu
 */
import java.util.Scanner;
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input 1st integer:");
        int a = input.nextInt();
        System.out.print("Input 2nd integer:");
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("Sum of two integers:" + sum);
        int difference = a - b;
        System.out.println("Difference of two integers:" + difference);
        int product = a * b;
        System.out.println("Product of two integers:" + product);
        double average = (a + b)/2;
        System.out.println("Average of two integers:" + average);
        int distance;
        System.out.println("Distance of two integers:" + difference);
        if (a > b){
            System.out.println("Max integer:" + a);
        }
        else{
            System.out.println("Min integer:" + a);
        }
        if (b > a){
            System.out.println("Max integer:" + b);
        }
        else{
            System.out.println("Min integer:" + b);
            //boolean test = (y>x)? true:false;
        }
        
    }
    
}
