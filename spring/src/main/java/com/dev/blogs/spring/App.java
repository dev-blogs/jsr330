package com.dev.blogs.spring;
 
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.dev.blogs.jsr330.service.MessageService;
 
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lookup.xml");
        context.refresh();
         
        ServiceConsumer serviceConsumer = context.getBean("serviceConsumer", ServiceConsumer.class);
        serviceConsumer.print();
    }
}
