package com.bridgelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CabInvoiceTest {

    CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();

        @Test
        public void givenDistanceAndTime_ShouldReturnTotalFare () {
            double distance = 5;
            int time = 10;
            double fare = CabInvoiceGenerator.calculateFare(distance, time);
            assertEquals(60, fare);
        }
    }
