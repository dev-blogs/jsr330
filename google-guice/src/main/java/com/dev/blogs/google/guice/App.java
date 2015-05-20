package com.dev.blogs.google.guice;
 
import com.google.inject.Guice;
import com.google.inject.Injector;
 
public class App {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new Configurer());       
        ServiceConsumer serviceConsumer = injector.getInstance(ServiceConsumer.class);
        serviceConsumer.printMessage();
    }
}
