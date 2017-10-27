package com.tivit.centrifugo.message.presence;


import org.json.JSONObject;

import com.tivit.centrifugo.message.DownstreamMessage;

//import org.json.JSONObject;



/**
 * This file is part of centrifuge-android
 * Created by Semyon on 03.05.2016.
 * */
public class BaseJoinLeftMessage extends DownstreamMessage {

    
    private String channel;

    
    private String user;

    
    private String client;

    public BaseJoinLeftMessage(final JSONObject jsonObject) {
        super(jsonObject);
        channel = body.optString("channel");
         JSONObject data = body.optJSONObject("data");
        if (data != null) {
            user = data.optString("user");
            client = data.optString("client");
        }
    }

    
    public String getChannel() {
        return channel;
    }

    
    public String getUser() {
        return user;
    }

    
    public String getClient() {
        return client;
    }

}