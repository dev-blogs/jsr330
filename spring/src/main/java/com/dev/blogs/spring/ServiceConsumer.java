package com.dev.blogs.spring;
 
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
 
import com.dev.blogs.jsr330.service.MessageService;
 
@Named("serviceConsumer")
@Singleton
public class ServiceConsumer {
    @Inject
    private MessageService messageService;
     
    public void print() {
        System.out.println(messageService.getMessage());
    }
}
