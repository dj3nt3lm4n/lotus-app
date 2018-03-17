package com.example.alan.lotus_app2.events;

/**
 * Created by alan on 16/03/18.
 */

public class SignUpEvent {
    private String token;

    public SignUpEvent(String message) {
        this.token = message;
    }

    public String getMessage() {
        return token;
    }
}
