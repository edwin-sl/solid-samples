package org.cetys.solid.incorrect.isp;

/**
 * Created by edwin on Apr, 2020
 */
public class AllInOnePrinter implements ISmartDevice {
    public void Print() {
        // Printing code.
        System.out.println("I am printing!");
    }
    public void Fax() {
        // Beep booop biiiiip.
        System.out.println("I am faxing!");
    }
    public void Scan() {
        // Scanning code.
        System.out.println("I am scanning!");
    }
}
