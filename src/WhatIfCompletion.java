import com.sun.org.apache.xpath.internal.operations.And;

import java.util.Scanner;
public class WhatIfCompletion {
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            int num1, num2;

            System.out.print("First number? : ");
            num1 = keyboard.nextInt();

            System.out.print("Second number? : ");
            num2 = keyboard.nextInt();

            int sum = num1 + num2;
            int product = num1 * num2;
            double avg = sum / 2;

            if ((sum > 200) && (sum < 1000))  //200<sum<1000
            {
                System.out.println("Sum: " + sum + "*~");
                System.out.println("Product: " + product);
                System.out.println("Average: " + avg);
            }

            else if  (sum > 200) // sum>=1000
            {
                System.out.println("Sum: " + sum + "*");
                System.out.println("Product: " + product);
                System.out.println("Average: " + avg);
            } else // sum<=200
            {
                System.out.println("Sum: " + sum +"~" );
                System.out.println("Product: " + product);
                System.out.println("Average: " + avg);
            }

        }}








