package org.cetys.solid.correct.dip;

/**
 * Created by edwin on Apr, 2020
 */
public class FrontendDeveloper implements Developer {
    @Override
    public void develop() {
        writeJavascript();
    }
    private void writeJavascript() {
        // codes server
        System.out.println("Coding in Javascript");
    }

}
