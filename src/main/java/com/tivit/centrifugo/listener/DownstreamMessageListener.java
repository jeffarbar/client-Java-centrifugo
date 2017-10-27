package com.tivit.centrifugo.listener;



import com.tivit.centrifugo.message.DownstreamMessage;

/**
 * This file is part of centrifuge-android
 * Created by semyon on 29.04.16.
 * */
public interface DownstreamMessageListener {

    void onDownstreamMessage(final DownstreamMessage message);

}
