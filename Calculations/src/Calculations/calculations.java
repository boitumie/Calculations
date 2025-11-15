package Calculations;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class calculations {

    public static void main(String[] args){


    Scanner scanner = new Scanner(System.in);


        List<Double> expenses = new ArrayList<>();
        double total_expenses = 0.0;
        boolean running = true;
        Date today = new Date();

        today.getDate();

        System.out.println(today);
        char exit = '*';
    while(running) {
    System.out.println("=== Expense Tracker ===\n" +
            "1. Add expense\n" +
            "2. View all expenses\n" +
            "3. View total amount spent\n" +
            "4. Exit");

    int menu = scanner.nextInt();

    switch (menu) {

        case 1: {
            System.out.print("Enter expense");
            double exItem = scanner.nextDouble();
            expenses.add(exItem);
            total_expenses += exItem;
            break;
        }

        case 2: {
            System.out.println("\nHere is the list of your expenses");
            for(int i = 0; i < expenses.size(); i++) {

                System.out.println(expenses.get((i)));

            }
            break;

        }

        case 3: {
            System.out.println("Here is the total money spent: " + total_expenses);
            break;
        }
        case 4: {
            System.out.println("Thanks goodbye");
            running = false;
            break;
        }
        default:{
            System.out.println("Please select the correct number");
            break;
        }

    }
}
    }
}
