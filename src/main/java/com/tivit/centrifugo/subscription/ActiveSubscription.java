package com.tivit.centrifugo.subscription;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;



/**
 * This file is part of centrifuge-android
 * Created by Semyon on 04.05.2016.
 */
//TODO: decide if we need to keep channel's users list
public class ActiveSubscription {

    @NotNull
    private SubscriptionRequest initialRequest;

    @Nullable
    private String lastMessageId;

    private boolean connected = false;

    public ActiveSubscription(@NotNull final SubscriptionRequest initialRequest) {
        this.initialRequest = initialRequest;
    }

    public void updateLastMessage(final String newLastMessageId) {
        this.lastMessageId = newLastMessageId;
    }

 
    public SubscriptionRequest getInitialRequest() {
        return initialRequest;
    }

    @Nullable
    public String getLastMessageId() {
        return lastMessageId;
    }


    public String getChannel() {
        return initialRequest.getChannel();
    }

    public String getInfo() {
        return initialRequest.getInfo();
    }

    public boolean isConnected() {
        return connected;
    }

    public void setConnected(final boolean connected) {
        this.connected = connected;
    }

}