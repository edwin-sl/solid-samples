package org.cetys.solid.correct.dip;

/**
 * Created by edwin on Apr, 2020
 */
public class BackendDeveloper implements Developer {
    @Override
    public void develop() {
        writeJava();
    }
    private void writeJava() {
        // codes server
        System.out.println("Coding in Java");
    }

}
