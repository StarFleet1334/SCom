package com.system.folder.util;

import com.system.folder.broker.message.UserCommonMessage;
import com.system.folder.broker.message.UserLoginMessage;
import com.system.folder.broker.message.UserRegisterMessage;

public class Transformer {

    public static UserCommonMessage transform(UserLoginMessage userLoginMessage) {
        var userCommonMessage = new UserCommonMessage();
        userCommonMessage.setEmail(userLoginMessage.getEmail());
        userCommonMessage.setTime(userLoginMessage.getLoginTime());
        userCommonMessage.setAction("LOGIN");
        return userCommonMessage;
    }

    public static UserCommonMessage transform(UserRegisterMessage userRegisterMessage) {
        var userCommonMessage = new UserCommonMessage();
        userCommonMessage.setEmail(userRegisterMessage.getEmail());
        userCommonMessage.setTime(userRegisterMessage.getRegisterTime());
        userCommonMessage.setAction("REGISTER");
        return userCommonMessage;
    }
}
