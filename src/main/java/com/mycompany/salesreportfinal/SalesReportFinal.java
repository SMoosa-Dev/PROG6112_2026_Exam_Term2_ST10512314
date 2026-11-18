
package com.mycompany.salesreportfinal;

import java.util.Scanner;

/**
 * Code Attribution / References:
 *
 * 1. Oracle. "Classes and Objects."
 *    Used for understanding classes, objects,
 *    constructors, getters and setters.
 *    https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html
 *
 * 2. Oracle. "Arrays."
 *    Used for understanding one-dimensional and
 *    multidimensional arrays.
 *    https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
 *
 * 3. Oracle. "The if-then and if-then-else Statements."
 *    Used for understanding conditional statements.
 *    https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html
 *
 * 4. Oracle. "The for Statement."
 *    Used for understanding loops and array traversal.
 *    https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html
 *
 * 5. Oracle. "The while and do-while Statements."
 *    Used for understanding while loops and menu repetition.
 *    https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html
 *
 * 6. Oracle. "Scanner Class Documentation."
 *    Used for understanding keyboard input.
 *    https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Scanner.html
 *
 * 7. Oracle. "Random Class Documentation."
 *    Used for understanding random number generation.
 *    https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Random.html
 *
 * 8. Oracle. "String Class Documentation."
 *    Used for understanding String comparison and String methods.
 *    https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/lang/String.html
 *
 * These references were used for learning and understanding
 * the Java concepts implemented in this program.
 *
 * @author moosa
 */

public class SalesReportFinal implements IProduct {

    // Creating the variables
    int Month1CozyNights;
    int Month2CozyNights;
    int Month3CozyNights;

    int Month1RestonicBarbodosMattress;
    int Month2RestonicBarbodosMattress;
    int Month3RestonicBarbodosMattress;

    int Month1sealyPhuketMattress;
    int Month2sealyPhuketMattress;
    int Month3sealyPhuketMattress;

    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        SalesReportFinal report = new SalesReportFinal();

        // Enter Cozy Nights sales
        System.out.println("Enter number of sales for Month 1 for Cozy Nights Monarch mattress:");
        report.Month1CozyNights = input.nextInt();

        System.out.println("Enter number of sales for Month 2 for Cozy Nights Monarch mattress:");
        report.Month2CozyNights = input.nextInt();

        System.out.println("Enter number of sales for Month 3 for Cozy Nights Monarch mattress:");
        report.Month3CozyNights = input.nextInt();

        // Enter Restonic sales
        System.out.println("Enter number of sales for Month 1 for Restonic Barbados mattress:");
        report.Month1RestonicBarbodosMattress = input.nextInt();

        System.out.println("Enter number of sales for Month 2 for Restonic Barbados mattress:");
        report.Month2RestonicBarbodosMattress = input.nextInt();

        System.out.println("Enter number of sales for Month 3 for Restonic Barbados mattress:");
        report.Month3RestonicBarbodosMattress = input.nextInt();

        // Enter Sealy sales
        System.out.println("Enter number of sales for Month 1 for Sealy Phuket mattress:");
        report.Month1sealyPhuketMattress = input.nextInt();

        System.out.println("Enter number of sales for Month 2 for Sealy Phuket mattress:");
        report.Month2sealyPhuketMattress = input.nextInt();

        System.out.println("Enter number of sales for Month 3 for Sealy Phuket mattress:");
        report.Month3sealyPhuketMattress = input.nextInt();

        // Display sales report
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("************************************");

        System.out.println("Total Products Sold: "
                + report.GetTotalProductsSold());

        System.out.println("Average Products Sold: "
                + report.GetAverageProductSold());

        System.out.println("Most Popular Product: "
                + report.GetMostPopularProduct());

        input.close();
    }

   // Default constructor
public SalesReportFinal() {
}

// Constructor for unit testing
public SalesReportFinal(int cozy1, int cozy2, int cozy3,
        int restonic1, int restonic2, int restonic3,
        int sealy1, int sealy2, int sealy3) {

    Month1CozyNights = cozy1;
    Month2CozyNights = cozy2;
    Month3CozyNights = cozy3;

    Month1RestonicBarbodosMattress = restonic1;
    Month2RestonicBarbodosMattress = restonic2;
    Month3RestonicBarbodosMattress = restonic3;

    Month1sealyPhuketMattress = sealy1;
    Month2sealyPhuketMattress = sealy2;
    Month3sealyPhuketMattress = sealy3;
}
  

    // Calculate total sales
    @Override
    public int GetTotalProductsSold() {

        return Month1CozyNights + Month2CozyNights
                + Month3CozyNights
                + Month1RestonicBarbodosMattress
                + Month2RestonicBarbodosMattress
                + Month3RestonicBarbodosMattress
                + Month1sealyPhuketMattress
                + Month2sealyPhuketMattress
                + Month3sealyPhuketMattress;
    }

    // Calculate average sales
    @Override
    public double GetAverageProductSold() {

        return GetTotalProductsSold() / 9.0;
    }

    // Find most popular mattress
    @Override
    public String GetMostPopularProduct() {

        int CozyTotal = Month1CozyNights
                + Month2CozyNights + Month3CozyNights;

        int RestonicTotal = Month1RestonicBarbodosMattress
                + Month2RestonicBarbodosMattress
                + Month3RestonicBarbodosMattress;

        int SealyTotal = Month1sealyPhuketMattress
                + Month2sealyPhuketMattress
                + Month3sealyPhuketMattress;

        if (CozyTotal > RestonicTotal && CozyTotal > SealyTotal) {

            return "Cozy Nights Monarch";

        } else if (RestonicTotal > CozyTotal && RestonicTotal > SealyTotal) {

            return "Restonic Barbados";

        } else if (SealyTotal > CozyTotal && SealyTotal > RestonicTotal) {

            return "Sealy Phuket";

        } else {

            return "There is a tie between products";
        }
    }
}


