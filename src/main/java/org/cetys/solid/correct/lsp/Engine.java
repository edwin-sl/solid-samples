package org.cetys.solid.correct.lsp;

/**
 * Created by edwin on Apr, 2020
 */
public class Engine implements Motor {
    private int status;
    private float power;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public void on() {
        this.status = 1;
    }

    public void powerOn(float power) {
        this.setPower(power);
    }
}
