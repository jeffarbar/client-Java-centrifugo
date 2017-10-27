package com.tivit.centrifugo.credentials;


import org.json.JSONObject;


/**
 * This file is part of centrifuge-android
 * Created by Semyon on 03.05.2016.
 * */
public class Info {

     
    private User user;

    
    private JSONObject defaultInfo;

    
    private JSONObject channelInfo;

    public Info(  final User user,  final JSONObject defaultInfo,  final JSONObject channelInfo) {
        this.user = user;
        this.defaultInfo = defaultInfo;
        this.channelInfo = channelInfo;
    }

     
    public User getUser() {
        return user;
    }

    
    public JSONObject getDefaultInfo() {
        return defaultInfo;
    }

    
    public JSONObject getChannelInfo() {
        return channelInfo;
    }

}