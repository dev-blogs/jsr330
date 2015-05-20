package com.dev.blogs.google.guice;
 
import com.dev.blogs.jsr330.service.MessageService;
import com.dev.blogs.jsr330.service.impl.MessageServiceImpl;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.google.inject.util.Providers;
 
public class Configurer extends AbstractModule {
    @Override
    protected void configure() {
        bind(MessageService.class).to(MessageServiceImpl.class);
        bind(String.class).annotatedWith(Names.named("message")).toProvider(Providers.<String>of("Google guice. Test message"));
    }
}
