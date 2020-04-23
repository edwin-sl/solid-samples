package org.cetys.solid.incorrect.lsp;

/**
 * Created by edwin on Apr, 2020
 */
public class ElectricCar implements Car {
    public void turnOnEngine() {
        throw new AssertionError("No engine");
    }

    public void accelerate() {
        // accelerates
    }
}
