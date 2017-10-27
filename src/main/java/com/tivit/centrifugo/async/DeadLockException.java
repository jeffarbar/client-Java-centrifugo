package com.tivit.centrifugo.async;


/**
 * This file is part of centrifuge-android
 * Created by Semyon on 02.05.2016.
 * */
public class DeadLockException extends RuntimeException {

    public DeadLockException() {
    }

    public DeadLockException(final String detailMessage) {
        super(detailMessage);
    }

    public DeadLockException(final String detailMessage, final Throwable throwable) {
        super(detailMessage, throwable);
    }

    public DeadLockException(final Throwable throwable) {
        super(throwable);
    }

}