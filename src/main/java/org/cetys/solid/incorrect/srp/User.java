package org.cetys.solid.incorrect.srp;

/**
 * Created by edwin on Apr, 2020
 */
public class User {
    private String email;
    private String name;
    private boolean authenticated;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }

    public User(String email, String name) {
        this.email = email;
        this.name = name;
        this.authenticated = false;
    }
}
