package org.cetys.solid.correct.srp;

/**
 * Created by edwin on Apr, 2020
 */
public class SecurityService {
    public static boolean checkAccess(User user) {
        //check the access.
        return user.isAuthenticated();
    }
}
