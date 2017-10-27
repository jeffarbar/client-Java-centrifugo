package com.tivit.centrifugo.message.presence;




import com.tivit.centrifugo.credentials.User;
import com.tivit.centrifugo.message.DownstreamMessage;

import org.json.JSONObject;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


/**
 * This file is part of centrifuge-android
 * Created by semyon on 29.04.16.
 * */
public class PresenceMessage extends DownstreamMessage {

     
    private List<User> userList = new LinkedList<>();

    public PresenceMessage(final JSONObject jsonObject) {
        super(jsonObject);
         JSONObject data = body.optJSONObject("data");
        if (data != null) {
            Iterator<String> iter = data.keys();
            while (iter.hasNext()) {
                String key = iter.next();
                 JSONObject userJson = data.optJSONObject(key);
                if (userJson != null) {
                    String userString = userJson.optString("user");
                    String clientString = userJson.optString("client");
                    User user = new User(userString, clientString);
                    userList.add(user);
                }
            }
        }
    }

     
    public List<User> getUserList() {
        return userList;
    }

}