package org.cetys.solid.incorrect.lsp;

/**
 * Created by edwin on Apr, 2020
 */
public class MotorCar implements Car {
    private Engine engine;

    public void turnOnEngine() {
        engine.on();
    }

    public void accelerate() {
        engine.powerOn(1000);
    }
}
