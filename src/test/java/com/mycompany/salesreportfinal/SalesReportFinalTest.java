
package com.mycompany.salesreportfinal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SalesReportFinalTest {

    @Test
    public void testGetTotalProductsSold() {

        SalesReportFinal report = new SalesReportFinal(
                10, 20, 30,
                5, 10, 15,
                10, 10, 10
        );

        assertEquals(120, report.GetTotalProductsSold());
    }

    @Test
    public void testGetAverageProductSold() {

        SalesReportFinal report = new SalesReportFinal(
                10, 20, 30,
                5, 10, 15,
                10, 10, 10
        );

        assertEquals(120.0 / 9.0,
                report.GetAverageProductSold(), 0.001);
    }

    @Test
    public void testGetMostPopularProduct() {

        SalesReportFinal report = new SalesReportFinal(
                50, 50, 50,
                10, 10, 10,
                20, 20, 20
        );

        assertEquals("Cozy Nights Monarch",
                report.GetMostPopularProduct());
    }

    @Test
    public void testProductsTie() {

        SalesReportFinal report = new SalesReportFinal(
                10, 10, 10,
                10, 10, 10,
                10, 10, 10
        );

        assertEquals("There is a tie between products",
                report.GetMostPopularProduct());
    }
}
