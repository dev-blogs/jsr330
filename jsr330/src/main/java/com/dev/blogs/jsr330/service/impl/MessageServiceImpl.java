package com.dev.blogs.jsr330.service.impl;
 
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
 
import com.dev.blogs.jsr330.service.MessageService;
 
@Named("messageService")
@Singleton
public class MessageServiceImpl implements MessageService {
    @Inject
    @Named("message")
    private String message = "Default message";
 
    public String getMessage() {
        return message;
    }
}
