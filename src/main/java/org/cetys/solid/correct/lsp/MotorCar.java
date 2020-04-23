package org.cetys.solid.correct.lsp;

/**
 * Created by edwin on Apr, 2020
 */
public class MotorCar implements Car {
    private Engine engine;

    public void turnOnMotor() {
        engine.on();
    }
    public void accelerate() {
        engine.powerOn(1000);
    }
}
