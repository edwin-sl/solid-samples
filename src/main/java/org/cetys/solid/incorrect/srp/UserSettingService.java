package org.cetys.solid.incorrect.srp;

/**
 * Created by edwin on Apr, 2020
 */
public class UserSettingService {
    // handling user data
    public void changeEmail(User user) {
        if(checkAccess(user)) {
            //Grant option to change
        }
    }

    //handling authentication
    public boolean checkAccess(User user) {
        //Verify if the user is valid.
        return user.isAuthenticated();
    }

}
