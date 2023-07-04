package com.tddnote.ticket;

import com.tddnote.person.PersonId;

public class Ticket {
    public void AddMessage(PersonId from, String body){
        Message message = new Message(from, body);
        message.Append(message);
    }
}
