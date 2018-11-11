package com.loxon.javachallenge2017.client;

public interface WebsocketSender {

    void sendObject(Object o);

    void stop();
}
