package com.rapidtech.demospringbootrifai.config;

import com.rapidtech.demospringbootrifai.model.Bar;
import com.rapidtech.demospringbootrifai.model.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.*;

@Slf4j
@Configuration
public class DependOnConfiguration {
    @Lazy
    @Bean
    @DependsOn(value = {"foo"})
    public Bar bor(){
        log.debug("Creating new Bar");
        return new Bar();
    }

    @Bean
    @Scope("prototype")
    public Foo foo(){
        log.debug("Creating new Foo");
        return new Foo();
    }
}
