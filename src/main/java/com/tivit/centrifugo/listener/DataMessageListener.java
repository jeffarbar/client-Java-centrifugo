package com.tivit.centrifugo.listener;



import com.tivit.centrifugo.message.DataMessage;

/**
 * This file is part of centrifuge-android
 * Created by semyon on 29.04.16.
 * */
public interface DataMessageListener {

    void onNewDataMessage(final DataMessage message);

}
