package org.cetys.solid.correct.srp;

/**
 * Created by edwin on Apr, 2020
 */
public class UserSettingService {
    public void changeEmail(User user) {
        if(SecurityService.checkAccess(user)) {
            //Grant option to change
        }
    }
}
