package org.cetys.solid.incorrect.isp;

/**
 * Created by edwin on Apr, 2020
 */
public class EconomicPrinter implements ISmartDevice {
    public void Print() {
        //Yes I can print.
        System.out.println("I am printing!");
    }
    public void Fax() {
        throw new UnsupportedOperationException();
    }
    public void Scan() {
        throw new UnsupportedOperationException();
    }
}
