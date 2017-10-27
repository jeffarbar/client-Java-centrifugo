package com.tivit.centrifugo.message.history;

import org.json.JSONObject;

import java.util.Date;


/**
 * This file is part of centrifuge-android
 * Created by Semyon on 04.05.2016.
 */
public class HistoryItem {

    
    private String UUID;

    
    private Date timestamp;

    
    private String channel;

    
    private JSONObject data;

    public HistoryItem(final JSONObject messageJSON) {
        data = messageJSON.optJSONObject("data");
        UUID = messageJSON.optString("uid");
        channel = messageJSON.optString("channel");
        String timestampString = messageJSON.optString("timestamp");
        timestamp = new Date(Long.valueOf(timestampString));
    }

    
    public String getUUID() {
        return UUID;
    }

    
    public Date getTimestamp() {
        return timestamp;
    }

    
    public String getChannel() {
        return channel;
    }

    
    public JSONObject getData() {
        return data;
    }

}