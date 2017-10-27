package com.tivit.centrifugo.message;

import org.json.JSONArray;
import org.json.JSONObject;



/**
 * This file is part of centrifuge-android
 * Created by Semyon on 04.05.2016.
 */
public class SubscribeMessage extends DownstreamMessage {

     
    private String channel;

     
    private Boolean status;

     
    private JSONArray recoveredMessages;

    public SubscribeMessage(final JSONObject jsonObject) {
        super(jsonObject);
        channel = body.optString("channel");
        if (body.has("status")) {
            status = body.optBoolean("status");
        }
        recoveredMessages = (JSONArray) body.optJSONArray("messages");
    }

     
    public String getChannel() {
        return channel;
    }

     
    public Boolean getStatus() {
        return status;
    }

     
    public JSONArray getRecoveredMessages() {
        return recoveredMessages;
    }

}