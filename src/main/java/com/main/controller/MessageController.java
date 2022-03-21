package com.main.controller;

import com.main.service.MessageService;
import com.main.utility.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
public class MessageController {
    
    @Autowired
    private MessageService messageService;

    // Initial message load when page loads
    @GetMapping(path="/load",produces=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String initialLoad() {
        return messageService.loadMessages();
    }

    // Send message
    @PostMapping(path="/send",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody void send(@RequestBody Message message) {
        messageService.sendMessage(message);
    }
}
