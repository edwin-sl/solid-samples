package org.cetys.solid.correct.lsp;

/**
 * Created by edwin on Apr, 2020
 */
public class ElectricCar implements Car{
    private ElectricMotor motor;

    public void turnOnMotor() {
        motor.on();
    }
    public void accelerate() {
        motor.powerOn(1000);
    }

}
