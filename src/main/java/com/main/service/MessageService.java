package com.main.service;

import com.main.utility.Message;

import org.springframework.stereotype.Service;

@Service
public interface MessageService {
    public void sendMessage(Message message);
    public String loadMessages();
}
