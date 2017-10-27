package com.tivit.centrifugo.message;

import com.tivit.centrifugo.credentials.Info;
import com.tivit.centrifugo.credentials.User;

import org.json.JSONObject;

import java.util.Date;


/**
 * This file is part of centrifuge-android
 * Created by Semyon on 01.05.2016.
 * */
public class DataMessage extends DownstreamMessage {

    private String data;

     
    private String UUID;

     
    private String channel;

     
    private Info info;

     
    private Date timestamp;

    public static DataMessage fromBody(final JSONObject jsonObject) {
        DataMessage dataMessage = new DataMessage();
        dataMessage.setBody(jsonObject);
        dataMessage.setOriginalMessage(jsonObject);
        dataMessage.init(jsonObject);
        return dataMessage;
    }

    public DataMessage() {
    }

    public DataMessage(final JSONObject jsonObject) {
        super(jsonObject);
        init(body);
    }

    private void init(  final JSONObject body) {
        Object dataObj = body.opt("data");
        if (dataObj != null) {
            data = dataObj.toString();
        }

        UUID = body.optString("uid");
        channel = body.optString("channel");
          JSONObject infoJSON = body.optJSONObject("info");

        if (infoJSON != null) {
            String userString = infoJSON.optString("user");
            String clientString = infoJSON.optString("client");
            User user = new User(userString, clientString);
            JSONObject defaultInfo = infoJSON.optJSONObject("default_info");
            JSONObject channelInfo = infoJSON.optJSONObject("channel_info");
            info = new Info(user, defaultInfo, channelInfo);
        }


        String timestampString = body.optString("timestamp");
        if(!"".equals(timestampString)){
        	timestamp = new Date(Long.valueOf(timestampString));
        }
    }

    public String getData() {
        return data;
    }

     
    public String getChannel() {
        return channel;
    }

     
    public Info getInfo() {
        return info;
    }

     
    public Date getTimestamp() {
        return timestamp;
    }

     
    public String getUUID() {
        return UUID;
    }

}