package com.tivit.centrifugo.credentials;


/**
 * This file is part of centrifuge-android
 * Created by Semyon on 03.05.2016.
 * */
public class User {

    
    private String user;

   
    private String client;

    public User( final String user, final String client) {
        this.user = user;
        this.client = client;
    }

   
    public String getClient() {
        return client;
    }

    
    public String getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "User{" +
                "user='" + user + '\'' +
                ", client='" + client + '\'' +
                '}';
    }

}