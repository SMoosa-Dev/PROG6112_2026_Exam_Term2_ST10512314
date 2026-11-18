
package com.mycompany.salesreportfinal;

public class PrintProduct {

    // Display product sales report
    public void PrintReport(IProduct product) {

        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("************************************");

        System.out.println("Total Products Sold: "
                + product.GetTotalProductsSold());

        System.out.println("Average Products Sold: "
                + product.GetAverageProductSold());

        System.out.println("Most Popular Product: "
                + product.GetMostPopularProduct());

        System.out.println("************************************");
    }
}

