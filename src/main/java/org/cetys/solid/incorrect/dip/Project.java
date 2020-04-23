package org.cetys.solid.incorrect.dip;

/**
 * Created by edwin on Apr, 2020
 */
public class Project {
    private BackendDeveloper backend = new BackendDeveloper();
    private FrontendDeveloper frontend = new FrontendDeveloper();

    public void implement() {
        backend.writeJava();
        frontend.writeJavascript();
    }
}
