package PACKAGE_NAME;

import java.util.scanner
public class MonthlyTracker {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Enter your name: ");
         String name = input.nextLine();
        System.out.println("YOUR MONTHLY SPENDING TRACKER");
         System.out.print("Enter the month: ");
         String month = input.nextLine();
         System.out.print("Enter your monthly budget: ");
         float monthlyBudget = input.nextFloat();
         System.out.print("Enter rent cost: ");
         float rent = input.nextFloat();
         System.out.print("Enter electricity bill: ");
         float electricity = input.nextFloat();
         System.out.print("Enter savings: ");
         float savings = input.nextFloat();
        input.nextLine();

         double total1 = rent + electricity + savings;
         double remainingBudget = monthlyBudget - total1;

         double total2 = 0;
         String choice = "yes";

             System.out.print("\nWould you like to make any more purchases? ");
             choice = input.nextLine();

             while (choice.equalsIgnoreCase("Yes")) {
             System.out.print("\nEnter additional purchase: ");
             String purchase = input.nextLine();

             System.out.print("Enter price: $ ");
             double price = input.nextDouble();
             input.nextLine();

             if (price > 0) {
                 total2 = total2 + price;

                 if (total2 > remainingBudget) {
                     System.out.println("You are over your budget.");
                 } else {
                     System.out.println("You are still within your budget.");
                 }

                 System.out.print("\nWould you like to add another purchase? (yes/no): ");
                 choice = input.nextLine(); }
                 }

         double leftover = remainingBudget - total2;
         boolean withinremainingBudget = total2 <= remainingBudget;
         double totalMonthly = total1 + total2;

        System.out.println("MONTHLY  REPORT");
        System.out.println("Name: " + name.toUpperCase());

        System.out.printf("Monthly Budget: $%.2f%n", monthlyBudget);
        System.out.printf("Total Spending: $%.2f%n", totalMonthly);
        System.out.printf("Money Remaining: $%.2f%n", leftover);

        if (withinremainingBudget) {
            System.out.println("You stayed within your monthly budget!");
        } else {
            System.out.println("You went past your monthly budget!");
        }

    }



}

