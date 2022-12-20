package com.bridgelabz;

import java.util.Objects;

public class InvoiceSummary {

    int numberOfRides;
    double totalFare;
    double avgFare;

    public InvoiceSummary() {

    }

    /**
     * create parameterized constructor name as invoiceSummary
     */

    public InvoiceSummary(int numberOfRides,double totalFare) {
        /**
         * The "this" keyword is used to refer to the current object.
         */

        this.numberOfRides = numberOfRides;
        this.totalFare = totalFare;
    }
    /**
     * create a parameterized constructor name as Invoice
     */

    public InvoiceSummary(int numberOfRides,double totalFare,String type) {

        this.numberOfRides = numberOfRides;
        this.totalFare = totalFare;
    }

    public InvoiceSummary getInvoiceSummary() {
        this.avgFare = this.totalFare / this.numberOfRides;
        return this;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() !=o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return numberOfRides == that.numberOfRides && Double.compare(that.totalFare,totalFare) == 0 && Double.compare(that.avgFare,avgFare) == 0;
    }

    /**
     * overriding the toString() method
     */

@Override
public int hashCode() {
    return Objects.hash(numberOfRides,totalFare,avgFare);
}
}
