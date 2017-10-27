package com.tivit.centrifugo.message.history;



import com.tivit.centrifugo.message.DownstreamMessage;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


/**
 * This file is part of centrifuge-android
 * Created by semyon on 29.04.16.
 * */
public class HistoryMessage extends DownstreamMessage {

     
    private List<HistoryItem> messages = new ArrayList<>();

    public HistoryMessage(final JSONObject jsonObject) {
        super(jsonObject);
        JSONArray data = body.optJSONArray("data");
        if (data != null) {
            for (int i = 0; i < data.length(); i++) {
                JSONObject messageJSON = data.optJSONObject(i);
                HistoryItem dataMessage = new HistoryItem(messageJSON);
                messages.add(dataMessage);
            }
        }
    }

     
    public List<HistoryItem> getMessages() {
        return messages;
    }

}