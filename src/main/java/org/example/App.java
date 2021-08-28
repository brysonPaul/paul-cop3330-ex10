/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Bryson Paul
 */
package org.example;
import java.util.Scanner;
public class App {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        Item[] items = new Item[3];
        final float TAXRATE = (float).055;
        float subtotal = 0;
        while(true) {
            try {
                subtotal = 0;//needed for if it comes back if they enter a non-numeric
                for (int x = 0; x < 3; x++) {
                    items[x] = new Item();
                    items[x].setPrice(Integer.parseInt(strIO("Enter the price of item " + (x + 1) + " ", sc)));
                    items[x].setQuantity(Integer.parseInt(strIO("Enter the quantity of item " + (x + 1) + " ", sc)));
                    subtotal += items[x].price * items[x].quantity;
                }
            } catch (Exception ex) {
                System.out.println("Enter only numeric values");
                continue;
            }
            break;
        }
        float tax = subtotal*TAXRATE;
        float total= subtotal+tax;
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);

    }
    public static String strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
}
