package com.tddnote.ticket;

import com.tddnote.person.PersonId;

public class Message {
    private PersonId from;
    private String body;

    public Message(PersonId from, String body) {
        this.from = from;
        this.body = body;
    }

    public void Append(Message message) {
        //...
    }
}
