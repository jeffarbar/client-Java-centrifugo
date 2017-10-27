package com.tivit.centrifugo.message;

import org.json.JSONObject;



/**
 * This file is part of centrifuge-android
 * Created by semyon on 29.04.16.
 * */
public class DownstreamMessage {

    protected String requestUUID;

    protected JSONObject body;

    protected JSONObject originalMessage;

   
    private String error;

    public DownstreamMessage() {
    }

    public DownstreamMessage(final JSONObject jsonObject) {
        this.originalMessage = jsonObject;
        requestUUID = jsonObject.optString("uid");
        body = jsonObject.optJSONObject("body");
        if (jsonObject.has("error")) {
            error = jsonObject.optString("error");
        }
    }

    public String getRequestUUID() {
        return requestUUID;
    }

    public JSONObject getBody() {
        return body;
    }

    public JSONObject getOriginalMessage() {
        return originalMessage;
    }

   
    public String getError() {
        return error;
    }

    void setOriginalMessage(final JSONObject originalMessage) {
        this.originalMessage = originalMessage;
    }

    void setBody(final JSONObject body) {
        this.body = body;
    }

}