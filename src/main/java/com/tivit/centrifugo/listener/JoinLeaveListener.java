package com.tivit.centrifugo.listener;



import com.tivit.centrifugo.message.presence.JoinMessage;
import com.tivit.centrifugo.message.presence.LeftMessage;

/**
 * This file is part of centrifuge-android
 * Created by semyon on 29.04.16.
 * */
public interface JoinLeaveListener {

    void onJoin(final JoinMessage joinMessage);

    void onLeave(final LeftMessage leftMessage);

}
