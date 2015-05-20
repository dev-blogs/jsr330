package com.dev.blogs.google.guice;
 
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
 
import com.dev.blogs.jsr330.service.MessageService;
 
@Named("serviceConsumer")
@Singleton
public class ServiceConsumer {
    @Inject
    private MessageService messageService;
     
    public void printMessage() {
        System.out.println(messageService.getMessage());
    }
}
