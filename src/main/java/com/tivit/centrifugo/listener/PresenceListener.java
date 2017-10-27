package com.tivit.centrifugo.listener;

import com.tivit.centrifugo.message.presence.PresenceMessage;

/**
 * This file is part of centrifuge-android
 * Created by semyon on 29.04.16.
 * */
public interface PresenceListener {

    void onPresence(final PresenceMessage presenceMessage);

}
