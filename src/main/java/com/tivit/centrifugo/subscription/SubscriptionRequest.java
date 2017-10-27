package com.tivit.centrifugo.subscription;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;


/**
 * This file is part of centrifuge-android
 * Created by semyon on 08.02.16.
 * */
public class SubscriptionRequest {

    @NotNull
    private String channel;

    @Nullable
    private String channelToken;

    private String info = "";

    public SubscriptionRequest( final String channel) {
        this.channel = channel;
    }

    public SubscriptionRequest( final String channel, @Nullable final String channelToken) {
        this.channel = channel;
        this.channelToken = channelToken;
    }

    public SubscriptionRequest( final String channel, @Nullable final String channelToken,  final String info) {
        this.channel = channel;
        this.channelToken = channelToken;
        this.info = info;
    }

    
    public String getChannel() {
        return channel;
    }

    public void setChannel( final String channel) {
        this.channel = channel;
    }

    @Nullable
    public String getChannelToken() {
        return channelToken;
    }

    public void setChannelToken(@Nullable final String channelToken) {
        this.channelToken = channelToken;
    }

    
    public String getInfo() {
        return info;
    }

    public void setInfo( final String info) {
        this.info = info;
    }

}
